package com.mike.back.end.application.model;

import com.mike.back.end.application.dto.UserDto;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class UserModel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="cpf")
    private String cpf;
    @Column(name="email")
    private String email;
    @Column(name="address")
    private String address;
    @Column(name="phone")
    private String phone;
    @Column(name="registration_date")
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
