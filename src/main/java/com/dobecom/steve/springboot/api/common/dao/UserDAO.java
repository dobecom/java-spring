package com.dobecom.steve.springboot.api.common.dao;

import com.dobecom.steve.springboot.api.common.entities.User;

import java.util.List;

public interface UserDAO {
    void save(User user);

    User findById(int id);

    List<User> findAllSteve();
}
