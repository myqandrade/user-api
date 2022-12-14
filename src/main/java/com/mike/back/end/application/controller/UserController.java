package com.mike.back.end.application.controller;

import com.mike.back.end.application.dto.UserDto;
import com.mike.back.end.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    public static List<UserDto> users = new ArrayList<>();

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UserDto> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/health")
    public String getHealth(){
        return "Application is running";
    }

    @GetMapping("/users/{cpf}")
    public UserDto findByCpf(@PathVariable(value = "cpf") String cpf) {
        return userService.findByCpf(cpf);
    }

    @GetMapping("/users/search")
    public List<UserDto> queryByNameLike(@RequestParam(name="name", required = true) String name){
        return userService.queryByNameLike(name);
    }

    @PostMapping("/newUser")
    public UserDto createUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }

    @DeleteMapping("/users/{id}")
    public UserDto deleteUser(@PathVariable(value = "id") Long id) {
        return userService.deleteUser(id);
    }
}