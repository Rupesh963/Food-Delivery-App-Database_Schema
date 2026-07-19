package com.snap.foodie.snapfood.service.impl;

import com.snap.foodie.snapfood.dto.UserDto;
import com.snap.foodie.snapfood.entity.Restaurant;
import com.snap.foodie.snapfood.entity.User;
import com.snap.foodie.snapfood.repository.UserRepo;
import com.snap.foodie.snapfood.service.UserService;
import com.snap.foodie.snapfood.utils.Helper;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {


    private UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void deleteUser(String userId) {

    }

    @Override
    public UserDto getUserById(String userId) {
        return null;
    }

    @Override
    public List<UserDto> getUserByEmail(String userEmail) {
        return List.of();
    }

    @Override
    public List<UserDto> getUserByName(String userName) {
        return List.of();
    }

    @Override
    public List<UserDto> getAll() {

        List<User> users = userRepo.findAll();
        List<UserDto> userDtos = users
                .stream()
                .map((User user) -> convertUserToUserDto(user))
                .toList();
        return userDtos;
    }

    @Override
    public UserDto updateUser(UserDto userDto, String userId) {
        return null;
    }

    @Override
    public UserDto saveUser(UserDto userDto) {

        userDto.setId(Helper.generateRandomId());
        User user = convertUserDtoToUser(userDto);
        User savedUser = userRepo.save(user);
        return convertUserToUserDto(savedUser);
    }

    private User convertUserDtoToUser(UserDto userDto){
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        return user;
    }

    private UserDto convertUserToUserDto(User user){
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user, userDto);
        return userDto;
    }

    //    private UserRepo userRepo;
//
//    public UserServiceImpl(UserRepo userRepo) {
//        this.userRepo = userRepo;
//    }
//
//    @Override
//    public User saveUser(User user) {
//        user.setId(UUID.randomUUID().toString());
//        User savedEntity = userRepo.save(user);
//        return savedEntity;
//    }
//
////    @Override
////    public User updateUser() {
////        return null;
////    }
//
//    @Transactional
//    public User updateUser(User user, String userId) {
//        //get user
//        //add new restaurant
//
//        User user1 = userRepo.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
//
//        user1.setName(user.getName());
//
//        User save = userRepo.save(user1);
//        return save;
//    }
}
