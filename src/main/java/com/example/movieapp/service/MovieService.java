package com.example.movieapp.service;

import com.example.movieapp.data.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {

    Movie saveMovie(Movie movie);
    List<Movie> findAll();
    Optional<Movie> findByID(Long movieID);
}
