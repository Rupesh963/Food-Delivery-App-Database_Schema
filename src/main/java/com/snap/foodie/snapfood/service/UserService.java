package com.snap.foodie.snapfood.service;

import com.snap.foodie.snapfood.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User saveUser(User user);
    public User updateUser(User user, String userId);

}
