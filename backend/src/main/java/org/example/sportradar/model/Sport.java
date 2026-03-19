package org.example.sportradar.model;

import jakarta.persistence.*;
import lombok.*;

// Entity class representing a sport type in the database
// Maps to the "sports" table in PostgreSQL
// Examples: Football, Ice Hockey, Basketball
@Entity
@Table(name = "sports")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Sport {

    // Auto-generated primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Name of the sport must be unique and cannot be null
    // e.g. "Football", "Ice Hockey"
    @Column(nullable = false, unique = true)
    private String name;
}