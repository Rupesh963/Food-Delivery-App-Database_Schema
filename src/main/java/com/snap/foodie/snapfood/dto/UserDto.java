package com.snap.foodie.snapfood.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto
{
    private String id;

    private String name;

    private String email;

    private String password;

    private String address;

    private String phoneNumber;

}
