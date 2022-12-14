package com.mike.back.end.application.model;

import com.mike.back.end.application.dto.UserDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "TB_USERS")
public class UserModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="cpf", nullable = false)
    private String cpf;
    @Column(name="email", nullable = false)
    private String email;
    @Column(name="address", nullable = false)
    private String address;
    @Column(name="phone", nullable = false)
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
