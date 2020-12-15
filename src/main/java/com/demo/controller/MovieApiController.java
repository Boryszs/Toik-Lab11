package com.demo.controller;


import com.demo.dto.MovieDto;
import com.demo.dto.MovieResponse;
import com.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class MovieApiController {

    private MovieService movieService;

    @Autowired
    public MovieApiController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<MovieResponse> getBooks() {

        return new ResponseEntity<>(movieService.getMovies(), HttpStatus.OK);
    }
}
