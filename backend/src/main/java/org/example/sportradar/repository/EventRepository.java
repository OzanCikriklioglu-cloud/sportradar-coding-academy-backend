package org.example.sportradar.repository;

import org.example.sportradar.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/* Repository interface for Event entity
 Extends JpaRepository to get basic CRUD operations for free
 Custom queries use JOIN FETCH to load all related entities in a single SQL query
 This avoids the N+1 problem — no extra queries inside loops*/
public interface EventRepository extends JpaRepository<Event, Long> {

    // Fetches all events with their related teams, stage and sport in one query
    // JOIN FETCH forces eager loading — without this, each event would trigger
    // separate queries for homeTeam, awayTeam, stage and sport
    @Query("SELECT e FROM Event e JOIN FETCH e.homeTeam JOIN FETCH e.awayTeam JOIN FETCH e.stage LEFT JOIN FETCH e.sport")
    List<Event> findAllWithDetails();

    // Filters events by sport ID — used for frontend sport filter
    // LEFT JOIN FETCH on sport because sport could theoretically be null
    @Query("SELECT e FROM Event e JOIN FETCH e.homeTeam JOIN FETCH e.awayTeam JOIN FETCH e.stage LEFT JOIN FETCH e.sport WHERE e.sport.id = :sportId")
    List<Event> findBySportId(@Param("sportId") Long sportId);

    // Filters events by exact date — used for frontend date filter
    @Query("SELECT e FROM Event e JOIN FETCH e.homeTeam JOIN FETCH e.awayTeam JOIN FETCH e.stage LEFT JOIN FETCH e.sport WHERE e.dateVenue = :date")
    List<Event> findByDate(@Param("date") LocalDate date);

    // Fetches a single event by ID with all related data
    // Returns Optional to handle the case where the event doesn't exist
    @Query("SELECT e FROM Event e JOIN FETCH e.homeTeam JOIN FETCH e.awayTeam JOIN FETCH e.stage LEFT JOIN FETCH e.sport WHERE e.id = :id")
    Optional<Event> findByIdWithDetails(@Param("id") Long id);
}