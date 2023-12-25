package oop.movie;

public class Movie {

    private String title;
    private String director;
    private String genre;
    private double creditCost;
    private boolean isRequested;

    public Movie(String title, String director, String genre, double creditCost, boolean isRequested) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.creditCost = creditCost;
        this.isRequested = isRequested;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getCreditCost() {
        return creditCost;
    }

    public void setCreditCost(double creditCost) {
        this.creditCost = creditCost;
    }

    public boolean isRequested() {
        return isRequested;
    }

    public void setRequested(boolean requested) {
        isRequested = requested;
    }
}
