package com.saxon.movies.model.service;

import com.saxon.movies.model.dbEntity.Movies;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface MoviesService {
    //查询所有的电影
    List<Movies> QueryAllMovies();
    //通过特定的属性查询电影
    List<Movies> QueryMovie(Map<String,Object> map);
    //添加一部电影
    int insertMovie(Map<String,Object> map);
    //删除一部电影
    int deleteMovieByID(int moviesID);
    //修改一个电影的数据
    int updateMovies(Map<String,Object> map);
}
