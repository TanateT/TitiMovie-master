package com.movietime.dao;

import com.movietime.entity.User;


public interface UserDao {

     void create(User user);
     User findOne(long id);
     User findByUsername(String username);
}
