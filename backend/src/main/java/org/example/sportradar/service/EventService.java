package org.example.sportradar.service;

import org.example.sportradar.model.Event;
import org.example.sportradar.repository.*;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;
    private final TeamRepository teamRepository;
    private final StageRepository stageRepository;
    private final SportRepository sportRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAllWithDetails();
    }

    public Event getEventById(Long id) {
        return eventRepository.findByIdWithDetails(id)
                .orElseThrow(() -> new RuntimeException("Event not found with id: " + id));
    }

    public List<Event> getEventsBySport(Long sportId) {
        return eventRepository.findBySportId(sportId);
    }

    public List<Event> getEventsByDate(LocalDate date) {
        return eventRepository.findByDate(date);
    }

    public Event createEvent(Event event) {
        if (event.getHomeTeam() != null && event.getHomeTeam().getId() != null) {
            event.setHomeTeam(teamRepository.findById(event.getHomeTeam().getId())
                    .orElseThrow(() -> new RuntimeException("Home team not found")));
        }
        if (event.getAwayTeam() != null && event.getAwayTeam().getId() != null) {
            event.setAwayTeam(teamRepository.findById(event.getAwayTeam().getId())
                    .orElseThrow(() -> new RuntimeException("Away team not found")));
        }
        if (event.getStage() != null && event.getStage().getId() != null) {
            event.setStage(stageRepository.findById(event.getStage().getId())
                    .orElseThrow(() -> new RuntimeException("Stage not found: " + event.getStage().getId())));
        }
        if (event.getSport() != null && event.getSport().getId() != null) {
            event.setSport(sportRepository.findById(event.getSport().getId())
                    .orElseThrow(() -> new RuntimeException("Sport not found")));
        }
        return eventRepository.save(event);
    }
}