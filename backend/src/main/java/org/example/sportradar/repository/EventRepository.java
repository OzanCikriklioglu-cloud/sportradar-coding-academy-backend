package org.example.sportradar.repository;

import org.example.sportradar.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

    // PDF'de "efficient SQL query, no queries inside loops" dedi
    @Query("SELECT e FROM Event e JOIN FETCH e.homeTeam JOIN FETCH e.awayTeam JOIN FETCH e.stage LEFT JOIN FETCH e.sport")
    List<Event> findAllWithDetails();
}