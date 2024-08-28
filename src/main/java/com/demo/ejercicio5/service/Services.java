package com.demo.ejercicio5.service;

import com.demo.ejercicio5.model.User;

import java.util.List;

public interface Services {

    User addUser(User user);
    List<User> getAllUsers();

}
