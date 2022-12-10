package com.mike.back.end.application.model;

import com.mike.back.end.application.dto.UserDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class UserModel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;
    private String email;
    private String address;
    private String phone;
    private Date registrationDate;

    public static UserModel convert(UserDto userDto){
        UserModel userModel = new UserModel();
        userModel.setName(userDto.getName());
        userModel.setCpf(userDto.getCpf());
        userModel.setEmail(userDto.getEmail());
        userModel.setAddress(userDto.getAddress());
        userModel.setPhone(userDto.getPhone());
        userModel.setRegistrationDate(userDto.getRegistrationDate());

        return userModel;
    }
}
