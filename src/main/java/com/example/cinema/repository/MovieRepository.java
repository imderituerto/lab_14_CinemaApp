package com.example.cinema.repository;

import com.example.cinema.models.Movie;
import com.example.cinema.services.MovieService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
        // stores Movie class data (DATA)
}
