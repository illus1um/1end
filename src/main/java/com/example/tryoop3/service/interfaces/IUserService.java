package com.example.tryoop3.service.interfaces;

import com.example.tryoop3.entities.User;


public interface IUserService {

    User signUpSave(User user);

    User getUserByEmail (String email);

    void deleteUserById(int id);

    User createUser (User user);
}
