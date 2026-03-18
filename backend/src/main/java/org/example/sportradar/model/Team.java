package org.example.sportradar.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "teams")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String officialName;
    private String abbreviation;
    private String teamCountryCode;
}