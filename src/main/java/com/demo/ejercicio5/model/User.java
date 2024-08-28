package com.demo.ejercicio5.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String name;
    private String lastname;
    private String email;
    private Long age;
    private String createDate;

}
