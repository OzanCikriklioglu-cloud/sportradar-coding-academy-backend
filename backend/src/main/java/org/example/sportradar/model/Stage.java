package org.example.sportradar.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "stages")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Stage {

    @Id
    private String id; // "ROUND OF 16", "FINAL"

    @Column(nullable = false)
    private String name;

    private Integer ordering;
}
