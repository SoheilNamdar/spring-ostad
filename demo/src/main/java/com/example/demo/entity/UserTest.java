package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserTest {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String password;


}
