package com.demo.repository;

import com.demo.dto.MovieDto;

import java.util.List;

public interface MovieRepository {

    List<MovieDto> getMovies();
}
