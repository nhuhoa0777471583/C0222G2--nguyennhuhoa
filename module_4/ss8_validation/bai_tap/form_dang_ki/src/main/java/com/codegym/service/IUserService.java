package com.codegym.service;

import com.codegym.model.User;

import java.util.List;

public interface IUserService {

    List<User> displayAll();
    void save(User user);
}
