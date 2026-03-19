package org.example.sportradar.repository;

import org.example.sportradar.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

// Repository interface for Team entity
// Extends JpaRepository to get basic CRUD operations out of the box
// No custom queries needed here — teams are fetched via JOIN FETCH
// in EventRepository to avoid extra queries per event
public interface TeamRepository extends JpaRepository<Team, Long> {}