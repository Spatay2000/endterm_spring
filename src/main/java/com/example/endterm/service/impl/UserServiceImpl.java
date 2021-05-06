package com.example.endterm.service.impl;

import com.example.endterm.model.User;
import com.example.endterm.repository.UserRepo;
import com.example.endterm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public User getById(int id) {

        return userRepo.getById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User uptade(User user) {
        return userRepo.save(user);
    }

    @Override
    public void delete(int id) {
    User user1 = userRepo.getById(id);
    userRepo.delete(user1);
    }
}
