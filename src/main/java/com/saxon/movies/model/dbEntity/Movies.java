package com.saxon.movies.model.dbEntity;

public class Movies {
    private int movieID;
    private String title;
    private String plot;
    private String date;
    private String image;
    private Category category;

    @Override
    public String toString () {
        return "Movies{" +
                "movieID=" + movieID +
                ", title='" + title + '\'' +
                ", plot='" + plot + '\'' +
                ", date='" + date + '\'' +
                ", image='" + image + '\'' +
                ", category=" + category +
                '}';
    }

    public int getMovieID () {
        return movieID;
    }

    public void setMovieID (int movieID) {
        this.movieID = movieID;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public String getPlot () {
        return plot;
    }

    public void setPlot (String plot) {
        this.plot = plot;
    }

    public String getDate () {
        return date;
    }

    public void setDate (String date) {
        this.date = date;
    }

    public String getImage () {
        return image;
    }

    public void setImage (String image) {
        this.image = image;
    }

    public Category getCategory () {
        return category;
    }

    public void setCategory (Category category) {
        this.category = category;
    }
}
