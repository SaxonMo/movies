package com.saxon.movies;

import com.saxon.movies.model.network.QueryActor;
import com.saxon.movies.model.network.QueryCategory;
import com.saxon.movies.model.network.QueryMovies;
import com.saxon.movies.model.network.QueryPersonMovie;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
@SpringBootTest
class MoviesApplicationTests {
    @Autowired
    QueryActor queryActor;
    @Autowired
    QueryMovies queryMovies;
    @Autowired
    QueryPersonMovie queryPersonMovie;

    @Test
    void contextLoads () {
        HashMap<String, Object> map = new HashMap<> ();
       map.put ("id",3);

        System.out.println (queryPersonMovie.QueryPersonMovies (map));
    }

}
