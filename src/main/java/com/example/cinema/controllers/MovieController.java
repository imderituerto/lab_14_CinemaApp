package com.example.cinema.controllers;

import com.example.cinema.models.Movie;
import com.example.cinema.repository.MovieList;
import com.example.cinema.repository.MovieRepository;
import com.example.cinema.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
    // executes methods in Movie model (MovieServices)
    // connects repository and client via Movie and MovieService

//    @Autowired
//    MovieRepository movieRepository;
    @Autowired
    MovieService movieService;

    // return list of movies from repository via MovieService methods
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
//        List<Movie> result = movieRepository.findAll();
//        return new ResponseEntity<>(result, HttpStatus.OK);
            List<Movie> movieList = movieService.getAllMovies();
            return new ResponseEntity<>(movieList, HttpStatus.OK);
        }

    // return movies by id from repository via MovieService methods
    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable int id){
        return new ResponseEntity<>(movieService.getMovieById(id), HttpStatus.OK);
    }

    // create new movie and add to list of movies in repository via MovieService methods
    @PostMapping
//  public ResponseEntity<ArrayList<String>> postNewMovie(@RequestBody Movie movie){
//      return new ResponseEntity<>(HttpStatus.CREATED);
    public ResponseEntity<Movie> addNewMovie(@RequestBody Movie movie){
        movieService.saveNewMovie(movie);
        return new ResponseEntity<>(movie, HttpStatus.CREATED);
    }

}
