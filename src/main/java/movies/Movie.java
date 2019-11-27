package movies;

/**
 * Created by agaped on 26.03.2018.
 */
public class Movie {

    private String title;
    private int year;
    private double rating;
    private int count;

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String toString(){
        return this.getTitle()+","+this.getYear()+","+this.getRating()+", "+this.getCount();
    }
}
