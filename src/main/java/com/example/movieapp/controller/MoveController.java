package com.example.movieapp.controller;

import com.example.movieapp.data.Movie;
import com.example.movieapp.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor
public class MoveController {

    private final MovieService movieService;

    @GetMapping("/all")
    public ResponseEntity<List<Movie>> getAllMovies() {

        return ResponseEntity.ok(movieService.findAll());
    }

    @PostMapping("")
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {

        return ResponseEntity.ok(movieService.saveMovie(movie));
    }
}
