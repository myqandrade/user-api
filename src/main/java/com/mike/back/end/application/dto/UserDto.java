package com.mike.back.end.application.dto;

import com.mike.back.end.application.model.UserModel;
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

    public static UserDto convert(UserModel userModel){
        UserDto userDto = new UserDto();
        userDto.setName(userModel.getName());
        userDto.setCpf(userModel.getCpf());
        userDto.setEmail(userModel.getEmail());
        userDto.setAddress(userModel.getAddress());
        userDto.setPhone(userModel.getPhone());
        userDto.setRegistrationDate(userModel.getRegistrationDate());

        return userDto;
    }
}
