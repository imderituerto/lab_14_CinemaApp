package com.example.cinema.models;

import javax.persistence.*;

@Entity(name = "movies")
public class Movie {
    // contains model properties

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Title")
    private String title;
    @Column(name = "Rating")
    private String rating;
    @Column(name = "Duration")
    private int duration;

    public Movie(String title, String rating, int duration){
        this.title = title;
        this.rating = rating;
        this.duration = duration;
    }

    // needed to create a new instance via reflection by your persistence framework
    public Movie(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


}
