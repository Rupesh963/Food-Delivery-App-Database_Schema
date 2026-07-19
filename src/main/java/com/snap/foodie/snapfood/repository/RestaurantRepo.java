package com.snap.foodie.snapfood.repository;

import com.snap.foodie.snapfood.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepo extends JpaRepository<Restaurant, String> {

}
