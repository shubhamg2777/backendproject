package com.jsp.movie;

import com.jsp.movie.Repositry.MovieRepositry;
import com.jsp.movie.entity.MovieInfo;

/**
 * Hello world! 
 *
 */
public class App
{
    public static void main( String[] args )
    {
       MovieInfo movieInfo = new MovieInfo();
       movieInfo.setId(1);
       movieInfo.setMoviename("padamavat");
       movieInfo.setActorname("Ranbeer singh");
       movieInfo.setActressname("DEEPIKA");
       movieInfo.setBudget("20000"); 
       
       MovieRepositry repositry = new MovieRepositry(); 
       repositry.saveMovieDetails(movieInfo);
    }
}