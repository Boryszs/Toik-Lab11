package com.demo.service.impl;


import com.demo.dto.MovieResponse;
import com.demo.repository.MovieRepository;
import com.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @Override
    public MovieResponse getMovies() {
        return  new MovieResponse(movieRepository.getMovies());
    }
}
