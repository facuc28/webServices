package com.thc.code.restwebservice.repositories;

import com.thc.code.restwebservice.domain.User;
import org.springframework.data.repository.CrudRepository;

import javax.websocket.OnClose;

public class UsersRepository implements CrudRepository<User,String> {


    public User findByName(String name){
        return 
    }


}
