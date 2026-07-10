package com.snap.foodie.snapfood.services;

import com.snap.foodie.snapfood.entity.Restaurant;
import com.snap.foodie.snapfood.entity.Role;
import com.snap.foodie.snapfood.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
public class UserService {

    @Autowired
    private com.snap.foodie.snapfood.service.UserService userService;

    @Test
    public void testSaveUser() {

        System.out.println("Save user");

        //user
        User user = new User();

        user.setName("Rupesh");
        user.setAvailable(true);
        user.setEmail("Rup@gmail.com");
        user.setPassword("Rupesh123");
        user.setPhoneNumber("629911xxxx");
        user.setAddress("Noida Sec 51");
        user.setRoles(Role.ADMIN);


        //restaurant
        Restaurant restaurant1 = new Restaurant();
        restaurant1.setId(UUID.randomUUID().toString());
        restaurant1.setName("KFC");
        restaurant1.setAddress("Noida");
        restaurant1.setOpen(true);

        Restaurant restaurant2 = new Restaurant();
        restaurant2.setId(UUID.randomUUID().toString());
        restaurant2.setName("Haldiram");
        restaurant2.setAddress("Noida");
        restaurant2.setOpen(true);

         restaurant1.setUser(user);
         restaurant2.setUser(user);

         user.getRestaurants().add(restaurant1);
         user.getRestaurants().add(restaurant2);

        User saved = userService.saveUser(user);
        System.out.println(saved.getName());

    }

    @Test
    public void testUpdateUser() {

        User user = userService.updateUser();
        System.out.println("User updated");

    }
}
