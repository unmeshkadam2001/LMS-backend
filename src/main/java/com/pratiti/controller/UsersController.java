package com.pratiti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pratiti.entity.Users;
import com.pratiti.service.UserServices;

@RestController
@CrossOrigin
public class UsersController {
    
    @Autowired
    private UserServices userServices;
    
    @PostMapping("/save-user")
    public String createUser(@RequestBody Users user) {
        return userServices.createUser(user);
    }
    
    @PostMapping("/login")
    public int login(@RequestParam String username, @RequestParam String password) {
        Users user = userServices.getUserByUsername(username);
        if(user == null || !user.getPassword().equals(password)) {
            return 3;
        } else if(user.getLibrarian()) {
            return 1;
        } else {
            return 2;
        }
    }
}
