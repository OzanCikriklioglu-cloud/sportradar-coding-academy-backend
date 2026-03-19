package org.example.sportradar.service;

import org.example.sportradar.model.Event;
import org.example.sportradar.repository.*;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.time.LocalDate;
import java.util.List;

// Service layer — contains all business logic for events
// Sits between the controller (API layer) and repository (database layer)
@Service
@RequiredArgsConstructor
public class EventService {

    // All repositories injected via constructor (Lombok @RequiredArgsConstructor)
    private final EventRepository eventRepository;
    private final TeamRepository teamRepository;
    private final StageRepository stageRepository;
    private final SportRepository sportRepository;

    // Returns all events with full details (teams, stage, sport)
    // Uses JOIN FETCH query to avoid N+1 problem
    public List<Event> getAllEvents() {
        return eventRepository.findAllWithDetails();
    }

    // Returns a single event by ID — throws exception if not found
    // GlobalExceptionHandler will catch this and return a 404 response
    public Event getEventById(Long id) {
        return eventRepository.findByIdWithDetails(id)
                .orElseThrow(() -> new RuntimeException("Event not found with id: " + id));
    }

    // Returns events filtered by sport ID (e.g. only Football events)
    public List<Event> getEventsBySport(Long sportId) {
        return eventRepository.findBySportId(sportId);
    }

    // Returns events filtered by exact date
    public List<Event> getEventsByDate(LocalDate date) {
        return eventRepository.findByDate(date);
    }

    // Creates a new event — resolves all foreign key references before saving
    // We fetch the full entity from DB instead of just using the ID
    // This prevents Hibernate's "unsaved transient instance" error
    public Event createEvent(Event event) {

        // Resolve home team from database using the ID sent from frontend
        if (event.getHomeTeam() != null && event.getHomeTeam().getId() != null) {
            event.setHomeTeam(teamRepository.findById(event.getHomeTeam().getId())
                    .orElseThrow(() -> new RuntimeException("Home team not found")));
        }

        // Resolve away team the same way
        if (event.getAwayTeam() != null && event.getAwayTeam().getId() != null) {
            event.setAwayTeam(teamRepository.findById(event.getAwayTeam().getId())
                    .orElseThrow(() -> new RuntimeException("Away team not found")));
        }

        // Resolve stage — ID is a String like "ROUND OF 16" or "FINAL"
        if (event.getStage() != null && event.getStage().getId() != null) {
            event.setStage(stageRepository.findById(event.getStage().getId())
                    .orElseThrow(() -> new RuntimeException("Stage not found: " + event.getStage().getId())));
        }

        // Resolve sport entity
        if (event.getSport() != null && event.getSport().getId() != null) {
            event.setSport(sportRepository.findById(event.getSport().getId())
                    .orElseThrow(() -> new RuntimeException("Sport not found")));
        }

        // Save and return the fully resolved event
        return eventRepository.save(event);
    }
}