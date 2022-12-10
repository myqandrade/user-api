package com.mike.back.end.application.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDto {

    private String name;
    private String cpf;
    private String email;
    private String address;
    private String phone;
    private Date registrationDate;
}
