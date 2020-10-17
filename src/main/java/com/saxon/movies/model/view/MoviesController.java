package com.saxon.movies.model.view;

import com.saxon.movies.model.dbEntity.Movies;
import com.saxon.movies.model.service.ActorServiceImpl;
import com.saxon.movies.model.service.MoviesServiceImpl;
import com.saxon.movies.model.service.PersonMoviesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MoviesController {
    MoviesServiceImpl moviesService;
    PersonMoviesServiceImpl personMoviesService;
    ActorServiceImpl actorService;

    @Autowired
    public void setActorService (ActorServiceImpl actorService) {
        this.actorService = actorService;
    }

    @Autowired
    public void setMoviesService (MoviesServiceImpl moviesService) {
        this.moviesService = moviesService;
    }

    @Autowired
    public void setPersonMoviesService (PersonMoviesServiceImpl personMoviesService) {
        this.personMoviesService = personMoviesService;
    }

    //获得所有的电影
    @GetMapping ( {"/", "index"})
    public String getAllMovies (Model model) {
        List<Movies> movies = moviesService.QueryAllMovies ();
        model.addAttribute ("movies", movies);
        return "index";
    }

    @GetMapping ("/single/{movieID}")
    public String single (@PathVariable int movieID, Model model) {
        Map<String, Object> map = new HashMap<> ();
        map.put ("id", movieID);
        model.addAttribute ("actors", personMoviesService.QueryPersonMovies (map));
        model.addAttribute ("movieSingle", moviesService.QueryMovie (map).get (0));
        return "single";
    }

    @GetMapping ("/actor/{actorID}")
    public String actor (@PathVariable int actorID, Model model) {
        Map<String, Object> map = new HashMap<> ();
        map.put ("id", actorID);
        model.addAttribute ("actor", actorService.QueryActors (map).get (0));
        return "/actor";
    }

    @GetMapping ("/saxon")
    public String saxon () {
        return "/saxon";
    }

}
