package com.mike.back.end.application.service;

import com.mike.back.end.application.dto.UserDto;
import com.mike.back.end.application.model.UserModel;
import com.mike.back.end.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<UserDto> getUsers(){
        List<UserModel> users = userRepository.findAll();
        return users.stream().map(UserDto::convert).collect(Collectors.toList());
    }

    public UserDto findById(Long id){
        Optional<UserModel> user = userRepository.findById(id);
        if(user.isPresent()){
            return UserDto.convert(user.get());
        }
        return null;
    }

    public UserDto createUser(UserDto userDto){
        userDto.setRegistrationDate(new Date());
        UserModel user = userRepository.save(UserModel.convert(userDto));
        return UserDto.convert(user);
    }

    public UserDto deleteUser(Long id){
        Optional<UserModel> user = userRepository.findById(id);
        if(user.isPresent()){
            userRepository.delete(user.get());
        }
        return null;
    }

    public UserDto findByCpf(String cpf){
        UserModel user = userRepository.findByCpf(cpf);
        if(user != null){
            return UserDto.convert(user);
        }
        return null;
    }

    public List<UserDto> queryByNameLike(String name){
        List<UserModel> users = userRepository.queryByNameLike(name);
        return users.stream().map(UserDto::convert).collect(Collectors.toList());
    }
}
