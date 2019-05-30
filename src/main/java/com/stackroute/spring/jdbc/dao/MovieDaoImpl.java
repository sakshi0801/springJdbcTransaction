package com.stackroute.spring.jdbc.dao;

import com.stackroute.spring.jdbc.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class MovieDaoImpl implements MovieDao {
    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource){
        this.dataSource=dataSource;
    }

    @Override
    public void create(Movie movie) {
     String queryMovie="insert into movies values(?,?,?,?)";
     String queryActor="insert into actor values(?,?,?)";
     jdbcTemplate=new JdbcTemplate(dataSource);

     jdbcTemplate.update(queryMovie,new Object[]{movie.getMovieId(),movie.getMovieName(),movie.getReleaseYear(),movie.getRatings()});
        System.out.println("Inserted in movie");
     jdbcTemplate.update(queryActor,new Object[]{movie.getMovieId(),movie.getActor().getActorName(),movie.getActor().getActorAge()});
        System.out.println("Inserted in actor");
    }
}
