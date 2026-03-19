package org.example.sportradar.model;

import jakarta.persistence.*;
import lombok.*;

// Entity class representing a competition stage in the database
// Maps to the "stages" table in PostgreSQL
// Examples: Group Stage, Round of 16, Quarter Final, Semi Final, Final
@Entity
@Table(name = "stages")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Stage {

    // Primary key is a String instead of auto-generated Long
    // because stage names are meaningful and stable (e.g. "ROUND OF 16", "FINAL")
    @Id
    private String id;

    // Display name of the stage — cannot be null
    @Column(nullable = false)
    private String name;

    // Ordering number to sort stages chronologically
    // e.g. Group Stage = 1, Round of 16 = 4, Final = 7
    private Integer ordering;
}