package com.demo.dto;

import java.util.List;

public class MovieResponse {
   private List<MovieDto> movies;

    public MovieResponse(List<MovieDto> movies) {
        this.movies = movies;
    }

    public List<MovieDto> getMovies() {
        return movies;
    }
}
