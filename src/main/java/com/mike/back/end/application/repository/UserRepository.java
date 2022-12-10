package com.mike.back.end.application.repository;

import com.mike.back.end.application.model.UserModel;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

    UserModel findByCpf(String cpf);

    List<UserModel> queryByNameLike(String name);
}
