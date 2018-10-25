package com.pk.controller;

import com.pk.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Created by pangkunkun on 2018/10/25.
 */
@RestController
public class UserController {


    @PostMapping("/users")
    public User addUser(@RequestBody User user){

        return user;
    }

}
