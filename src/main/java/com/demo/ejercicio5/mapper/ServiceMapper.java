package com.demo.ejercicio5.mapper;

import com.demo.ejercicio5.model.User;
import com.demo.ejercicio5.response.UserResponse;

import java.util.List;

public interface ServiceMapper {
    UserResponse userToUserResponse(User user);
    UserResponse userToUserResponse(List<User> user);
}
