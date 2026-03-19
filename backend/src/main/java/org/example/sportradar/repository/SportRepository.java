package org.example.sportradar.repository;

import org.example.sportradar.model.Sport;
import org.springframework.data.jpa.repository.JpaRepository;

/* Repository interface for Sport entity
 Extends JpaRepository which provides all basic CRUD operations out of the box
 No custom queries needed findAll() and findById() from JpaRepository are sufficient*/
public interface SportRepository extends JpaRepository<Sport, Long> {}