package com.demo.ejercicio5.mapper;

import com.demo.ejercicio5.model.User;
import com.demo.ejercicio5.response.UserResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IServiceMapper implements ServiceMapper{

    @Override
    public UserResponse userToUserResponse(User user) {
        return UserResponse.builder()
                .message("Operacion exitosa")
                .user(user)
                .build();
    }
    @Override
    public UserResponse userToUserResponse(List<User> user) {
        return UserResponse.builder()
                .message("Operacion exitosa")
                .users(user)
                .build();
    }

}
