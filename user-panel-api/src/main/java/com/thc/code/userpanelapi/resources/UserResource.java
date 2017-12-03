package com.thc.code.userpanelapi.resources;

import com.thc.code.userpanelapi.domain.User;
import com.thc.code.userpanelapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    UserService userService;

    @GetMapping("/user/{name}")
    public User getUser(@PathVariable("name") String name) {
        return userService.getUserByName(name);

    }

    @RequestMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
