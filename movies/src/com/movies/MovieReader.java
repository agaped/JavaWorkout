package com.movies;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by agaped on 26.03.2018.
 */
 public  class MovieReader {

    private Movie movie;
    private List<Movie> movies;
    private File file;
    private ArrayList<String[]> moviesLines;
    private String path;


    public MovieReader() {
        this.movies=new ArrayList<>();
        this.moviesLines=new ArrayList<>();
        this.file =new File("src\\com\\movies\\resources\\TheWorstMovies");
        this.path=file.getAbsolutePath();

    }

    public  ArrayList<String[]> readFile(){
        String[] tab;
        try{
            Scanner sc=new Scanner(this.file);
            while(sc.hasNextLine()){
                  this.movie=new Movie();
                  String line=sc.nextLine();
                    line=line.replace('(',' ');
                    line=line.replace(')',' ');
                    line=line.trim();
                    tab=line.split(",");
                moviesLines.add(tab);
              }

        }catch(IOException e){
            System.err.print("Problem with reading the file");
        }
        return moviesLines;
    }

}
