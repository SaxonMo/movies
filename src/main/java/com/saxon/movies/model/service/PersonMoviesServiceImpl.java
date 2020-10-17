package com.saxon.movies.model.service;

import com.saxon.movies.model.dbEntity.PersonMovie;
import com.saxon.movies.model.network.QueryPersonMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class PersonMoviesServiceImpl implements PersonMoviesService {
    QueryPersonMovie queryPersonMovie;

    @Autowired
    public void setQueryPersonMovie (QueryPersonMovie queryPersonMovie) {
        this.queryPersonMovie = queryPersonMovie;
    }

    @Override
    public List<PersonMovie> QueryAllPersonMovie () {
        return queryPersonMovie.QueryAllPersonMovie ();
    }

    @Override
    public List<PersonMovie> QueryPersonMovies (Map<String, Object> map) {
        return queryPersonMovie.QueryPersonMovies (map);
    }

    @Override
    public int insertPersonMovie (Map<String, Object> map) {
        return queryPersonMovie.insertPersonMovie (map);
    }

    @Override
    public int deletePersonMovie (int moviesID) {
        return queryPersonMovie.deletePersonMovie (moviesID);
    }

    @Override
    public int updatePersonMovie (Map<String, Object> map) {
        return queryPersonMovie.updatePersonMovie (map);
    }
}
