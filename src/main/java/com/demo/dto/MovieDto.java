package com.demo.dto;

import java.io.Serializable;

public class MovieDto implements Serializable {
    private int movieId;
    private String title;
    private int year;
    private String image;

    public MovieDto() {
    }

    private MovieDto(Builder builder) {
        this.movieId = builder.movieId;
        this.title = builder.title;
        this.year = builder.year;
        this.image = builder.image;
    }


    public int getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getImage() {
        return image;
    }

    public static class Builder {
        private int movieId;
        private String title;
        private int year;
        private String image;

        public Builder movieId(int movieId) {
            this.movieId = movieId;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Builder fromPrototype(MovieDto prototype) {
            movieId = prototype.movieId;
            title = prototype.title;
            year = prototype.year;
            image = prototype.image;
            return this;
        }

        public MovieDto build() { return new MovieDto(this); }
    }
}
