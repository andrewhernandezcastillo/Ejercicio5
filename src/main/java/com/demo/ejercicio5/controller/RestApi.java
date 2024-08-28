package com.demo.ejercicio5.controller;

import com.demo.ejercicio5.mapper.ServiceMapper;
import com.demo.ejercicio5.model.User;
import com.demo.ejercicio5.response.UserResponse;
import com.demo.ejercicio5.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class RestApi {

    private final Services services;
    private final ServiceMapper serviceMapper;

    public RestApi(@Autowired(required = false) Services services, ServiceMapper serviceMapper) {
        this.services = services;
        this.serviceMapper = serviceMapper;
    }

    @GetMapping("api/v1")
    public UserResponse getAll() {
        return serviceMapper.userToUserResponse(services.getAllUsers());
    }

    @PostMapping("api/v1")
    public UserResponse add(@RequestBody User user) {
        return serviceMapper.userToUserResponse(services.addUser(user));
    }

}
