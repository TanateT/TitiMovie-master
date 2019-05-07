package com.movietime.dao;

import com.movietime.entity.Seat;

import java.util.List;

public interface SeatDao {

     void update(Seat seat);
     boolean occupied(Seat seat);
     List<Seat> findAllBooked(long id);
}