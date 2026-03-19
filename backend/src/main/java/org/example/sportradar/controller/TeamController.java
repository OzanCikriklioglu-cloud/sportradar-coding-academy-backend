package org.example.sportradar.controller;

import org.example.sportradar.model.Team;
import org.example.sportradar.repository.TeamRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.List;

// REST controller that handles all team-related API requests
@RestController
@RequestMapping("/api/teams")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") // Allow requests from any origin (frontend)
public class TeamController {

    // Spring automatically injects the repository via constructor (Lombok)
    private final TeamRepository teamRepository;

    // GET /api/teams — returns all teams from the database
    @GetMapping
    public ResponseEntity<List<Team>> getAllTeams() {
        return ResponseEntity.ok(teamRepository.findAll());
    }
}