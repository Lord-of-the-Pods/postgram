package com.social.postgram.service;

import com.social.postgram.dto.UsersDTO;

import java.util.List;

public interface UserService {

    void createUser(UsersDTO user);

    void deleteUser(Long userId);

    UsersDTO getUser(Long userId);

    List<UsersDTO> getAllUsers();

}
