package com.snap.foodie.snapfood.service.impl;

import com.snap.foodie.snapfood.entity.Restaurant;
import com.snap.foodie.snapfood.entity.User;
import com.snap.foodie.snapfood.repository.UserRepo;
import com.snap.foodie.snapfood.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User saveUser(User user) {
        user.setId(UUID.randomUUID().toString());
        User savedEntity = userRepo.save(user);
        return savedEntity;
    }

//    @Override
//    public User updateUser() {
//        return null;
//    }

    @Transactional
    public User updateUser(User user, String userId) {
        //get user
        //add new restaurant

        User user1 = userRepo.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));

        user1.setName(user.getName());

        User save = userRepo.save(user1);
        return save;
    }
}
