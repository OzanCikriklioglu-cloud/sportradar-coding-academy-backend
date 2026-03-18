package org.example.sportradar.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "sports")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Sport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name; // "Football", "Ice Hockey"
}