package com.example.jdbc.demo.jdbc.Rest;


import com.example.jdbc.demo.jdbc.Entities.Movies;
//import com.example.jdbc.demo.jdbc.Services.MovieSerivce;
import com.example.jdbc.demo.jdbc.repositiores.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.Optional;

@RestController
@RequestMapping("/imdb/rest")
public class MovieRest {

    @Autowired
    MovieRepository movieRepository;



    @RequestMapping(path = "/findByImdbId/{imdbId}",method = RequestMethod.GET)
    public Movies findByImdbId(@PathVariable("imdbId") String imdbId){
        return movieRepository.findByImdbId(imdbId);
    }


}
