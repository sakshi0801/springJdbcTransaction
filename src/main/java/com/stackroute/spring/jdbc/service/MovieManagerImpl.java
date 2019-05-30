package com.stackroute.spring.jdbc.service;

import com.stackroute.spring.jdbc.dao.MovieDao;
import com.stackroute.spring.jdbc.model.Movie;
import org.springframework.transaction.annotation.Transactional;

public class MovieManagerImpl implements MovieManager {

    private MovieDao movieDao;

    public void setMovieDao(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    @Transactional
    public void createMovie(Movie movie) {
        movieDao.create(movie);
    }
}
