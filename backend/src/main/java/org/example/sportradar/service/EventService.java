package org.example.sportradar.service;

import org.example.sportradar.model.*;
import org.example.sportradar.repository.*;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;
    private final TeamRepository teamRepository;
    private final StageRepository stageRepository;
    private final SportRepository sportRepository;

    // Tüm eventları getir (PDF: efficient query, no loops)
    public List<Event> getAllEvents() {
        return eventRepository.findAllWithDetails();
    }

    // Tek event getir
    public Event getEventById(Long id) {
        return eventRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Event not found: " + id));
    }

    // Yeni event ekle
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }
}