package com.snap.foodie.snapfood.controller;

import com.snap.foodie.snapfood.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//@Controller
@RestController
@RequestMapping("/users")
public class UserController {


    @RequestMapping("/")
    //@ResponseBody
    public String testing() {
        System.out.println("Getting User");
        return "This is user list";
    }

    @RequestMapping("/player-list")
    public List<String> players(){

        List<String> list = new ArrayList<>();

        list.add("Rahane");
        list.add("Sachin");
        list.add("Virat");
        list.add("Rohit");
        list.add("Hardik");

        return list;
    }

    @RequestMapping("/get-user")
    public User getUser() {

        User user = new User();

        user.setId(UUID.randomUUID().toString());
        user.setName("Rupesh");
        user.setEmail("Rup@gmail.com");
        user.setPassword("12345");
        user.setAddress("sec 51 Noida");
        user.setAvailable(true);
        return user;
    }
}
