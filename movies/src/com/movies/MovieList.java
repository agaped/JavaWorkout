package com.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by agaped on 26.03.2018.
 */
public class MovieList {

    private Movie movie;
    private MovieReader movieReader;
    private List<Movie> movies;

    public MovieList() {
        this.movieReader=new MovieReader();
        this.movies=new ArrayList<>();
    }

    public List<Movie> readToList(){
        ArrayList<String[]> list=this.movieReader.readFile();
        for (String[] tab: list) {
                this.movie = new Movie();
                this.movie.setTitle(tab[0]);
                if(tab[1].matches("[1-2][0-9]{3}")){
                    this.movie.setYear(Integer.parseInt(tab[1]));
                }else{
                    continue;
                }
                if(tab[2].matches("[0-9]+.[0-9]*")){
                    this.movie.setRating(Double.parseDouble(tab[2]));
                }else{
                    continue;
                }
                this.movie.setCount(Integer.parseInt(tab[3]));
                this.movies.add(movie);
        }
        return movies;
    }
}
