package com.example.hos;

import com.example.hos.model.User;
import com.example.hos.model.UserConfigDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private User user;

    @Autowired
    private UserConfigDemo userConfigDemo;

    @GetMapping("/hi")
    public String getMsg(){
        return "hi";
    }

    @GetMapping("/users")
    public  String getUsers(){
        return user.toString();
    }

     @GetMapping("/userconfig")
     public String getUserConfig(){
        return userConfigDemo.toString();
     }


}
