package com.snap.foodie.snapfood.controller.example;

import com.snap.foodie.snapfood.payload.example.UserData;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController {

    //login
    //logger

    private Logger logger = LoggerFactory.getLogger(AuthController.class);

    @RequestMapping("/login")
    public List<String> login(@RequestBody List<String> list){

        logger.info("list : {}" , list);
        return list;

    }



    //signup
    //@RequestMapping(value = "/signup" , method = RequestMethod.GET)
    @GetMapping("/signup")
    public String signup( @Valid  @RequestBody UserData userData){

       // System.out.println(userData.getName());

        logger.info("name : {}" , userData.getName());
        logger.info("age : {}" , userData.getAge());
        logger.info("email : {}" , userData.getEmail());
        logger.info("password : {}" , userData.getPassword());
        return "we got data";



    }
}
