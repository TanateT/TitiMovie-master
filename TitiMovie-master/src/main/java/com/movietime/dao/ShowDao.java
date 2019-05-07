package com.movietime.dao;

import com.movietime.entity.Show;

import java.util.List;

public interface ShowDao {

     Show findOne(long showId);
     List<Show> findAll();
     List<Show> findByMovie(long movieId);
     List<Show> findByTheaterId(long theaterId);
}
