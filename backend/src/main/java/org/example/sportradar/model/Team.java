package org.example.sportradar.model;

import jakarta.persistence.*;
import lombok.*;

// Entity class representing a sports team in the database
// Maps to the "teams" table in PostgreSQL
// One team can appear in many events as either home or away team
@Entity
@Table(name = "teams")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Team {

    // Auto-generated primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Short display name — cannot be null (e.g. "Salzburg")
    @Column(nullable = false)
    private String name;

    // Full official name of the team (e.g. "FC Red Bull Salzburg")
    private String officialName;

    // 3-letter abbreviation used in scores and tables (e.g. "SAL")
    private String abbreviation;

    // ISO country code of the team (e.g. "AUT", "ENG", "ESP")
    private String teamCountryCode;
}