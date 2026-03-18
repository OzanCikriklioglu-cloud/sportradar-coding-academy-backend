package org.example.sportradar.repository;

import org.example.sportradar.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EventRepository extends JpaRepository<Event, Long> {

    @Query("SELECT e FROM Event e JOIN FETCH e.homeTeam JOIN FETCH e.awayTeam JOIN FETCH e.stage LEFT JOIN FETCH e.sport")
    List<Event> findAllWithDetails();

    @Query("SELECT e FROM Event e JOIN FETCH e.homeTeam JOIN FETCH e.awayTeam JOIN FETCH e.stage LEFT JOIN FETCH e.sport WHERE e.sport.id = :sportId")
    List<Event> findBySportId(@Param("sportId") Long sportId);

    @Query("SELECT e FROM Event e JOIN FETCH e.homeTeam JOIN FETCH e.awayTeam JOIN FETCH e.stage LEFT JOIN FETCH e.sport WHERE e.dateVenue = :date")
    List<Event> findByDate(@Param("date") LocalDate date);

    @Query("SELECT e FROM Event e JOIN FETCH e.homeTeam JOIN FETCH e.awayTeam JOIN FETCH e.stage LEFT JOIN FETCH e.sport WHERE e.id = :id")
    Optional<Event> findByIdWithDetails(@Param("id") Long id);
}