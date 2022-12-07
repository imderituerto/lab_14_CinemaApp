package com.example.cinema.services;

import com.example.cinema.models.Movie;
import com.example.cinema.repository.MovieList;
import com.example.cinema.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    // contains logic of Movie model (LOGIC)
    // connects controller and repository

    @Autowired
    MovieRepository movieRepository;
    @Autowired
    MovieList movieList;

    public MovieService(){
    }

    //replies
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(@PathVariable int id){
        Movie movie = movieRepository.findById(id).get();
        return movieRepository.findById(id);
    }

    public List<Movie> postNewMovie(Movie movie){
        List movieList = getAllMovies();
        movieList.add(movie);
        return movieList;
    }

}
