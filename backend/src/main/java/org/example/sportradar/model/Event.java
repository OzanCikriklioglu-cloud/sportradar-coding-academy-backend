package org.example.sportradar.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "events")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer season;

    private String status; // "played", "scheduled"

    @Column(name = "date_venue")
    private LocalDate dateVenue;

    @Column(name = "time_venue_utc") // Alt tireyi burada sabitledik, hata vermez
    private LocalTime timeVenueUTC;

    @Column(name = "home_goals")
    private Integer homeGoals;

    @Column(name = "away_goals")
    private Integer awayGoals;

    private String winner;

    @ManyToOne
    @JoinColumn(name = "_sport_id")
    private Sport sport;

    @ManyToOne
    @JoinColumn(name = "_home_team_id")
    private Team homeTeam;

    @ManyToOne
    @JoinColumn(name = "_away_team_id")
    private Team awayTeam;

    @ManyToOne
    @JoinColumn(name = "_stage_id")
    private Stage stage;
}