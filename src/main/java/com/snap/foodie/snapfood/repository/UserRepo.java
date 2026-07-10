package com.snap.foodie.snapfood.repository;

import com.snap.foodie.snapfood.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends  JpaRepository<User,String> {

}
