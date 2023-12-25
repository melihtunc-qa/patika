package oop.movie;

import java.util.List;

public class MovieLibrary {
    private List<Movie> movies;

    public MovieLibrary(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
