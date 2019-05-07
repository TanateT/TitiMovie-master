package com.movietime.dao;

import com.movietime.entity.Movie;

import java.util.List;

public interface MovieDao {

    Movie findOne(long id);
    List<Movie> findAll();
    List<Movie> findByTagName(String tagName);
}
