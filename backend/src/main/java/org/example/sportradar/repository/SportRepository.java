package org.example.sportradar.repository;

import org.example.sportradar.model.Sport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportRepository extends JpaRepository<Sport, Long> {}