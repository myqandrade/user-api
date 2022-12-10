package com.mike.back.end.application.controller;

import com.mike.back.end.application.dto.UserDto;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    public static List<UserDto> users = new ArrayList<>();

    @PostConstruct
    public void initiateList(){
        UserDto user1 = new UserDto();
        user1.setName("Mike");
        user1.setCpf("132.094.956-03");
        user1.setEmail("mike.andrade@hotmail.com");
        user1.setPhone("21 98657-9387");
        user1.setAddress("Vasco da Gama 1898");
        user1.setRegistrationDate(new Date());

        UserDto user2 = new UserDto();
        user2.setName("Matheus");
        user2.setCpf("145.798.976-04");
        user2.setEmail("matheus.toledo@hotmail.com");
        user2.setPhone("21 97650-3245");
        user2.setAddress("Rua Brasil Mulambo 823");
        user2.setRegistrationDate(new Date());

        UserDto user3 = new UserDto();
        user3.setName("Mariana");
        user3.setCpf("267.553.984-05");
        user3.setEmail("mariana.campos@hotmail.com");
        user3.setPhone("21 96587-3247");
        user3.setAddress("Rua Charles Menezes 231");
        user3.setRegistrationDate(new Date());

        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    @GetMapping("/")
    public String getMessage(){
        return "Spring boot is working!";
    }
}
