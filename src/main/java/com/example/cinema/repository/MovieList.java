package com.example.cinema.repository;

import com.example.cinema.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class MovieList {

    private ArrayList<Movie> movies;
    Movie movie;

    public MovieList(){
        this.movies = new ArrayList<>();
    }

    // methods for list of movies
    public ArrayList<Movie> getMovies() {
        movie = new Movie("Title", "12A", 112);
        movies.add(movie);
        return getMovies();
    }

    public Movie addMovies(Movie movie){
        movies = new ArrayList<>();
        movies.add(movie);
        return movie;
    }
}
