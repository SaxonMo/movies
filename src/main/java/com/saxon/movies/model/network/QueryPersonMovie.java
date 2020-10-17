package com.saxon.movies.model.network;

import com.saxon.movies.model.dbEntity.Movies;
import com.saxon.movies.model.dbEntity.PersonMovie;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface QueryPersonMovie {
    //查询所有的联系
    List<PersonMovie> QueryAllPersonMovie();
    //通过特定的属性查询联系
    List<PersonMovie> QueryPersonMovies(Map<String,Object> map);
    //添加一部联系
    int insertPersonMovie(Map<String,Object> map);
    //删除一部联系
    int deletePersonMovie(int moviesID);
    //修改一个电影的联系
    int updatePersonMovie(Map<String,Object> map);
}
