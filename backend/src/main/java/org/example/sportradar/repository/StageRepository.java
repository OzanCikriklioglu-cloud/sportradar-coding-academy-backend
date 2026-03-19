package org.example.sportradar.repository;

import org.example.sportradar.model.Stage;
import org.springframework.data.jpa.repository.JpaRepository;

/* Repository interface for Stage entity,
 Note: primary key type is String (not Long) because stage IDs are,
 meaningful text values like "ROUND OF 16", "FINAL", "GROUP STAGE",
 JpaRepository provides findById(String id), findAll(), save() etc. for free */
public interface StageRepository extends JpaRepository<Stage, String> {}