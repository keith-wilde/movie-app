package com.example.movieapp.service;

import com.example.movieapp.data.Movie;

import java.util.List;

public interface MovieService {

    Movie saveMovie(Movie movie);
    List<Movie> findAll();
}
