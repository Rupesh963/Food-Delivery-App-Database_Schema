package com.snap.foodie.snapfood.payload.example;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class UserData {

    @NotEmpty(message = "name is required")
    @Size(min = 3 , max = 20 , message = "name must between 3 or 20")
    private String name;

    @NotEmpty(message = "age is required")
    private String age;

    @Email(message = "Invalid email!!")
    private String email;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
