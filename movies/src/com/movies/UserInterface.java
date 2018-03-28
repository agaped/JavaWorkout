package com.movies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by agaped on 26.03.2018.
 */
public class UserInterface {

    private MovieList movieList;
    private Scanner reader;
    private List<Movie> currentList;
    private List<Movie> tempList;
    String[] inputs;
    String userInput;


    public UserInterface() {
        this.movieList = new MovieList();
        this.reader = new Scanner(System.in);
        this.inputs=new String[2];

    }

    public void start() {
        this.currentList = this.movieList.readToList();
        this.tempList = this.currentList;
        this.printMenu();

        while (true) {
            System.out.println("Your command: ");
            this.userInput=this.reader.nextLine();

            if (this.userInput.equals("ShowMovieCount")) {
                System.out.println(this.tempList.size());
            } else if (this.userInput.matches("(FilterByRatingBetterThan )[0-9]\\.[0-9]+")) {
                String[] inputs=this.userInput.split(" ");
                this.filterByRatingBetterThan(Double.parseDouble(inputs[1]));
            } else if (this.userInput.matches("(FilterByYearOfProduction )[1-2][0-9]{3}")) {
                String[] inputs=this.userInput.split(" ");
                this.filterByYearOfProduction(Integer.parseInt(inputs[1]));
            }else if (this.userInput.matches("(FilterByRatingCountMoreThan )[0-9]+")) {
                String[] inputs=this.userInput.split(" ");
                this.filterByRatingCountMoreThan(Integer.parseInt(inputs[1]));
            } else if (this.userInput.equals("Reset")) {
                this.reset();
            } else if (userInput.equals("ShowTitles")) {
                this.showTitles();
            } else if (userInput.equals("Exit")) {
                break;
            } else {
                System.out.println("Unknown command");
            }

        }
        System.out.println("Thank's for visit!");

    }

    private void printMenu() {
        System.out.println("Loaded: " + this.currentList.size());

        System.out.println("\n***** Menu: ******\nShowMovieCount\nFilterByRatingBetterThan " +
                "[x]\nFilterByYearOfProduction" +
                "[y]\nFilterByRatingCountMoreThan [x]\nShowMovieCount\nShowTitles\nReset\nExit\n");
    }

    private void filterByRatingBetterThan(double rating) {
        List<Movie> result = new ArrayList<>();
        for (Movie m : this.tempList) {
            if (m.getRating() > rating) {
                result.add(m);
            }
        }
        this.tempList = result;
    }

    private void filterByYearOfProduction(int year) {
        List<Movie> result = new ArrayList<>();
        for (Movie m : this.tempList) {
            if (m.getYear() == year) {
                result.add(m);
            }
        }
        this.tempList = result;
    }

    private void filterByRatingCountMoreThan(int count) {
        List<Movie> result = new ArrayList<>();
        for (Movie m : this.tempList) {
            if (m.getCount() > count) {
                result.add(m);
            }
        }
        this.tempList = result;
    }

    private void showTitles() {
        for (Movie m : this.tempList) {
            System.out.println(m.getTitle());
        }
    }

    private void reset() {
        this.tempList.clear();
        this.tempList = currentList;
    }
}
