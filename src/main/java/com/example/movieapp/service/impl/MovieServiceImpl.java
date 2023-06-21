package com.example.movieapp.service.impl;

import com.example.movieapp.dao.MovieRepository;
import com.example.movieapp.data.Movie;
import com.example.movieapp.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;
    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> findByID(Long movieID) {
        return movieRepository.findById(movieID);
    }
}
