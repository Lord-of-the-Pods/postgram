package com.social.postgram.controller;

import com.social.postgram.dto.UsersDTO;
import com.social.postgram.service.UserService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users/{id}")
    public UsersDTO getUser(@PathVariable int id) {
         return userService.getUser(Long.valueOf(id));
    }

    @GetMapping("/users")
    public List<UsersDTO> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping ("/addUser")
    public void addUsers(@RequestBody UsersDTO usersDTO) {
         userService.createUser(usersDTO);
    }

}
