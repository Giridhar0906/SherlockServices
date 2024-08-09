package com.giridhar.main.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.giridhar.main.repository.UserRepository;


@Service
public class UserService{
	
    @Autowired
    private UserRepository userRepository;

}

