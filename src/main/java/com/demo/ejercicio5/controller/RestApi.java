package com.demo.ejercicio5.controller;

import com.demo.ejercicio5.mapper.ServiceMapper;
import com.demo.ejercicio5.model.User;
import com.demo.ejercicio5.response.UserResponse;
import com.demo.ejercicio5.service.Services;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RestApi {

    private final Services services;
    private final ServiceMapper serviceMapper;


    @GetMapping("api/v1")
    public UserResponse getAll() {
        return serviceMapper.userToUserResponse(services.getAllUsers());
    }

    @PostMapping("api/v1")
    public UserResponse add(@RequestBody User user) {
        return serviceMapper.userToUserResponse(services.addUser(user));
    }

}
