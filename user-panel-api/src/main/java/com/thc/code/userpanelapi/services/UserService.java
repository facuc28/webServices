package com.thc.code.userpanelapi.services;

import com.thc.code.userpanelapi.domain.User;
import com.thc.code.userpanelapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getUserByName(String name) {
        return userRepository.getUserByName(name);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public String createUser(User user) {
        if (userRepository.createUser(user)) {
            return "Usuario creado correctamente!";
        } else {
            return "Error al crear usuario!";
        }
    }
}
