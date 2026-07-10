package com.snap.foodie.snapfood.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "foodie_users")
@Getter
@Setter
public class User {

    @Id
    private String id;

    private String name;

    private String email;

    private String password;

    private String address;

    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Role roles;  // ADMIN , CUSTOMER , DELIVERY BOY

    private boolean isAvailable=true; //applicable for delivery boy.


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Restaurant> restaurants = new ArrayList<>();


}
