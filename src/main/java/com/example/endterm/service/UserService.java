package com.example.endterm.service;

import com.example.endterm.model.User;

import java.util.List;

public interface UserService {
    User getById(int id);
    List<User> findAll();
    User createUser(User user);
    User uptade(User user);
    void delete(int id);
}
