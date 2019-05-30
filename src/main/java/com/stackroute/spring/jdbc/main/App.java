package com.stackroute.spring.jdbc.main;

import com.stackroute.spring.jdbc.model.Actor;
import com.stackroute.spring.jdbc.model.Movie;
import com.stackroute.spring.jdbc.service.MovieManager;
import com.stackroute.spring.jdbc.service.MovieManagerImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        MovieManager manager=context.getBean("movieManager", MovieManagerImpl.class);

        Movie movie=createNewMovie();
        manager.createMovie(movie);
        context.close();
    }
    private static Movie createNewMovie(){
        Movie movie=new Movie();
        movie.setMovieId(1);
        movie.setMovieName("ABCD");
        movie.setReleaseYear(2016);
        movie.setRatings(6.0f);
        Actor actor=new Actor();
        actor.setActorAge(40);
        actor.setActorName("Prabhu deva");
        actor.setMovieId(movie.getMovieId());
        movie.setActor(actor);
        return movie;
    }
}
