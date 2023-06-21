package com.example.movieapp.dao;

import com.example.movieapp.data.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
