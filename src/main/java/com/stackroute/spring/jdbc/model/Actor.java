package com.stackroute.spring.jdbc.model;

public class Actor {

    private int movieId;
    private String actorName;
    private int actorAge;

    public Actor() {
    }

    public Actor(int movieId, String actorName, int actorAge) {
        this.movieId = movieId;
        this.actorName = actorName;
        this.actorAge = actorAge;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public int getActorAge() {
        return actorAge;
    }

    public void setActorAge(int actorAge) {
        this.actorAge = actorAge;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "movieId=" + movieId +
                ", actorName='" + actorName + '\'' +
                ", actorAge=" + actorAge +
                '}';
    }
}
