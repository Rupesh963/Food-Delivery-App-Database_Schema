package com.snap.foodie.snapfood.service;

import com.snap.foodie.snapfood.dto.UserDto;
import com.snap.foodie.snapfood.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    UserDto saveUser(UserDto userDto);
    UserDto updateUser(UserDto userDto, String userId);

    List<UserDto> getAll();
    List<UserDto> getUserByName(String userName);
    List<UserDto> getUserByEmail(String userEmail);
    UserDto getUserById(String userId);
    void deleteUser(String userId);


}
