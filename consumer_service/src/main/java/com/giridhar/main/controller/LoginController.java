package com.giridhar.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.giridhar.main.service.UserService;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/hello")
    public String getDara() 
    {
		return "Hello i am consumer services";
    	
    }

}
