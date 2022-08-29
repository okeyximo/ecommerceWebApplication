package com.example.okey.service;

import com.example.okey.model.User;
import com.example.okey.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUserByEmailAndpassword(String email, String password){
        return userRepository.findUserByEmailAndPassword(email, password);
    }
}
