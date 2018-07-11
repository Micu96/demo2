package com.example.jdbc.demo.jdbc.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movies {

    @Id
    @Column(name = "imdb_id")
    private String imdbId;
    @Column(name ="ratings")
    private int ratings;
    @Column(name = "votes_number")
    private long votesNumber;
    
 
    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public long getVotesNumber() {
        return votesNumber;
    }

    public void setVotesNumber(long votesNumber) {
        this.votesNumber = votesNumber;
    }

}
