package day40_CustomClass_Statics.MovieTask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String little, country, genre, director;
    public LocalDate releaseDate;
    public ArrayList<String> casts = new ArrayList<>();

    public void setInfo(String little, String country, String genre, String director, LocalDate releaseDate) {
        this.little = little;
        this.country = country;
        this.genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
    }

    public void addCast(String cast){
        this.casts.add(cast);
    }

    public void addCast(String[] casts){
        this.casts.addAll(Arrays.asList(casts));
    }

    public void addCast(ArrayList<String> casts){
        this.casts.addAll( casts );
    }

    public String toString() { // January/01/2021
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/YYYY");
        return "Movie{" +
                "little= '" + little + '\'' +
                ", country= '" + country + '\'' +
                ", genre= '" + genre + '\'' +
                ", director= '" + director + '\'' +
                ", releaseDate= " + releaseDate.format(df) +
                ", total number of casts= " + casts.size() +
                '}';
    }
}
