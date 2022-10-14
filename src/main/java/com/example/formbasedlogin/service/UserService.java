package com.example.formbasedlogin.service;

import com.example.formbasedlogin.dto.UserDto;
import com.example.formbasedlogin.model.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
