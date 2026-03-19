package org.example.sportradar.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.Map;

// Global exception handler — catches errors from all controllers
// Instead of showing a stack trace, it returns a clean JSON error response
@RestControllerAdvice
public class GlobalExceptionHandler {

    // Handles RuntimeException (e.g. "Event not found with id: 99")
    // Returns HTTP 404 with a structured error body
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, Object>> handleNotFound(RuntimeException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of(
                "timestamp", LocalDateTime.now().toString(),
                "status", 404,
                "error", ex.getMessage()
        ));
    }

    // Handles any unexpected exception that wasn't caught elsewhere
    // Returns HTTP 500 to avoid leaking internal details to the client
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleGeneral(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of(
                "timestamp", LocalDateTime.now().toString(),
                "status", 500,
                "error", "Internal server error"
        ));
    }
}