package org.example.sportradar.controller;

import org.example.sportradar.model.Event;
import org.example.sportradar.service.EventService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/events")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class EventController {

    private final EventService eventService;

    // GET /api/events
    @GetMapping
    public ResponseEntity<List<Event>> getAllEvents(
            @RequestParam(required = false) Long sportId,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {

        if (sportId != null) return ResponseEntity.ok(eventService.getEventsBySport(sportId));
        if (date != null) return ResponseEntity.ok(eventService.getEventsByDate(date));
        return ResponseEntity.ok(eventService.getAllEvents());
    }

    // GET /api/events/1
    @GetMapping("/{id}")
    public ResponseEntity<Event> getEventById(@PathVariable Long id) {
        return ResponseEntity.ok(eventService.getEventById(id));
    }

    // POST /api/events
    @PostMapping
    public ResponseEntity<Event> createEvent(@RequestBody Event event) {
        return ResponseEntity.ok(eventService.createEvent(event));
    }
}