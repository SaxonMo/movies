package com.saxon.movies.model.service;

import com.saxon.movies.model.dbEntity.Movies;
import com.saxon.movies.model.network.QueryMovies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MoviesServiceImpl implements MoviesService {
    QueryMovies queryMovies;

    @Autowired
    public void setQueryMovies (QueryMovies queryMovies) {
        this.queryMovies = queryMovies;
    }

    @Override
    public List<Movies> QueryAllMovies () {
        return queryMovies.QueryAllMovies ();
    }

    @Override
    public List<Movies> QueryMovie (Map<String, Object> map) {
        return queryMovies.QueryMovie (map);
    }

    @Override
    public int insertMovie (Map<String, Object> map) {
        return queryMovies.insertMovie (map);
    }

    @Override
    public int deleteMovieByID (int moviesID) {
        return queryMovies.deleteMovieByID (moviesID);
    }

    @Override
    public int updateMovies (Map<String, Object> map) {
        return queryMovies.updateMovies (map);
    }
}
