package org.example.sportradar.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalTime;

// Entity class representing a sports event in the database
// Maps to the "events" table in PostgreSQL
@Entity
@Table(name = "events")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder // Allows builder pattern: Event.builder().season(2026).build()
public class Event {

    // Auto-generated primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // The season year this event belongs to (e.g. 2026)
    private Integer season;

    // Current status of the event: "played" or "scheduled"
    private String status;

    // Date of the event — explicit column name to match DB schema
    @Column(name = "date_venue")
    private LocalDate dateVenue;

    // Kick-off time in UTC — explicit column name to avoid Hibernate naming issues
    @Column(name = "time_venue_utc")
    private LocalTime timeVenueUTC;

    // Goals scored — nullable because scheduled events have no score yet
    @Column(name = "home_goals")
    private Integer homeGoals;

    @Column(name = "away_goals")
    private Integer awayGoals;

    // Name of the winning team — null if draw or not played yet
    private String winner;

    // Foreign key relationships — prefixed with "_" as required by the exercise
    // ManyToOne: many events can belong to one sport
    @ManyToOne
    @JoinColumn(name = "_sport_id")
    private Sport sport;

    // Home team — ManyToOne because one team can play many events
    @ManyToOne
    @JoinColumn(name = "_home_team_id")
    private Team homeTeam;

    // Away team — separate FK to the same teams table
    @ManyToOne
    @JoinColumn(name = "_away_team_id")
    private Team awayTeam;

    // Competition stage (e.g. "ROUND OF 16", "FINAL")
    @ManyToOne
    @JoinColumn(name = "_stage_id")
    private Stage stage;
}