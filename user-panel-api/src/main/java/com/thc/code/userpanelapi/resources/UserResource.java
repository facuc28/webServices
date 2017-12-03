package com.thc.code.userpanelapi.resources;

import com.thc.code.userpanelapi.domain.User;
import com.thc.code.userpanelapi.framework.ChannelResponse;
import com.thc.code.userpanelapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserResource {

    @Autowired
    UserService userService;
    @Autowired
    ChannelResponse channelResponse;

    @GetMapping("/{name}")
    public ChannelResponse getUser(@PathVariable("name") String name) {
        channelResponse.setData(userService.getUserByName(name));
        channelResponse.setSuccess(true);

        return channelResponse;
    }

    @RequestMapping("/all")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }


    @PostMapping("/add")
    public String createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
