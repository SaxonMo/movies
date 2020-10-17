package com.saxon.movies.model.dbEntity;

public class PersonMovie {
    private int idPersonMovie;
    private actor actor;
    private Movies movies;

    @Override
    public String toString () {
        return "PersonMovie{" +
                "idPersonMovie=" + idPersonMovie +
                ", actor=" + actor +
                ", movies=" + movies +
                '}';
    }

    public int getIdPersonMovie () {
        return idPersonMovie;
    }

    public void setIdPersonMovie (int idPersonMovie) {
        this.idPersonMovie = idPersonMovie;
    }

    public actor getActor () {
        return actor;
    }

    public void setActor (actor actor) {
        this.actor = actor;
    }

    public Movies getMovies () {
        return movies;
    }

    public void setMovies (Movies movies) {
        this.movies = movies;
    }


}
