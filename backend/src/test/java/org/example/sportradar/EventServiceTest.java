package org.example.sportradar;

import org.example.sportradar.model.*;
import org.example.sportradar.repository.*;
import org.example.sportradar.service.EventService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EventServiceTest {

    @Mock
    private EventRepository eventRepository;
    @Mock
    private TeamRepository teamRepository;
    @Mock
    private StageRepository stageRepository;
    @Mock
    private SportRepository sportRepository;

    @InjectMocks
    private EventService eventService;

    private Event sampleEvent;
    private Team homeTeam;
    private Team awayTeam;
    private Stage stage;
    private Sport sport;

    @BeforeEach
    void setUp() {
        sport = new Sport(1L, "Football");
        homeTeam = new Team(1L, "Salzburg", "FC Red Bull Salzburg", "SAL", "AUT");
        awayTeam = new Team(2L, "Sturm Graz", "SK Sturm Graz", "STU", "AUT");
        stage = new Stage("FINAL", "FINAL", 7);

        sampleEvent = new Event();
        sampleEvent.setId(1L);
        sampleEvent.setSeason(2026);
        sampleEvent.setStatus("scheduled");
        sampleEvent.setDateVenue(LocalDate.of(2026, 5, 6));
        sampleEvent.setHomeTeam(homeTeam);
        sampleEvent.setAwayTeam(awayTeam);
        sampleEvent.setStage(stage);
        sampleEvent.setSport(sport);
    }

    @Test
    void getAllEvents_shouldReturnAllEvents() {
        when(eventRepository.findAllWithDetails()).thenReturn(List.of(sampleEvent));

        List<Event> result = eventService.getAllEvents();

        assertEquals(1, result.size());
        assertEquals("scheduled", result.get(0).getStatus());
        verify(eventRepository, times(1)).findAllWithDetails();
    }

    @Test
    void getEventById_shouldReturnEvent_whenExists() {
        when(eventRepository.findByIdWithDetails(1L)).thenReturn(Optional.of(sampleEvent));

        Event result = eventService.getEventById(1L);

        assertNotNull(result);
        assertEquals(1L, result.getId());
        assertEquals(2026, result.getSeason());
    }

    @Test
    void getEventById_shouldThrowException_whenNotFound() {
        when(eventRepository.findByIdWithDetails(99L)).thenReturn(Optional.empty());

        RuntimeException ex = assertThrows(RuntimeException.class,
                () -> eventService.getEventById(99L));

        assertTrue(ex.getMessage().contains("99"));
    }

    @Test
    void createEvent_shouldSaveAndReturnEvent() {
        when(teamRepository.findById(1L)).thenReturn(Optional.of(homeTeam));
        when(teamRepository.findById(2L)).thenReturn(Optional.of(awayTeam));
        when(stageRepository.findById("FINAL")).thenReturn(Optional.of(stage));
        when(sportRepository.findById(1L)).thenReturn(Optional.of(sport));
        when(eventRepository.save(any(Event.class))).thenReturn(sampleEvent);

        Event result = eventService.createEvent(sampleEvent);

        assertNotNull(result);
        assertEquals("Salzburg", result.getHomeTeam().getName());
        verify(eventRepository, times(1)).save(any(Event.class));
    }

    @Test
    void getEventsBySport_shouldReturnFilteredEvents() {
        when(eventRepository.findBySportId(1L)).thenReturn(List.of(sampleEvent));

        List<Event> result = eventService.getEventsBySport(1L);

        assertEquals(1, result.size());
        assertEquals("Football", result.get(0).getSport().getName());
    }
}