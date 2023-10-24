package com.social.postgram.service;

import com.social.postgram.aop.Log;
import com.social.postgram.dto.UsersDTO;
import com.social.postgram.pojo.Users;
import com.social.postgram.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Log
    @Override
    public void createUser(UsersDTO user) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:MM:ss");
        Users userDao = new Users();

        userDao.setId(user.getId());
        userDao.setUsername(user.getUsername());
        userDao.setRole(user.getRole());
        userDao.setCreatedAt(Timestamp.valueOf( user.getCreatedAt()));

        userRepository.saveAndFlush(userDao);

    }

    @Override
    public void deleteUser(Long userId) {

    }

    @Log
    @Override
    public UsersDTO getUser(Long userId) {

        Optional<Users> ouser = userRepository.findById(userId);
        Users user = ouser.get();

        UsersDTO userDTO = new UsersDTO();

        userDTO.setId(user.getId());
        userDTO.setUsername(user.getUsername());
        userDTO.setRole(user.getRole());
        userDTO.setCreatedAt(user.getCreatedAt().toString());


        return userDTO;
    }

    @Log
    @Override
    public List<UsersDTO> getAllUsers() {

       List<Users> users = userRepository.findAll();
       List<UsersDTO> usersDto = new ArrayList<>();
        for (Users user: users) {
            UsersDTO userDTO = new UsersDTO();
            userDTO.setId(user.getId());
            userDTO.setUsername(user.getUsername());
            userDTO.setRole(user.getRole());
            userDTO.setCreatedAt(user.getCreatedAt().toString());
            usersDto.add(userDTO);
        }

        return usersDto;
    }
}
