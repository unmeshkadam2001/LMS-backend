package com.pratiti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratiti.entity.Users;
import com.pratiti.repository.UsersRepository;

@Service
public class UserServices {
	@Autowired
	private UsersRepository usersRepository;
	
	public String createUser(Users user) {
		usersRepository.save(user);
		return  "User created successfully";
        
    }

    public Users getUserByUsername(String username) {
        return usersRepository.findByUserName(username);
    }
}
