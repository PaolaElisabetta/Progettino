package com.pccube.entities;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

    List<User> findByUserName(String userName);
}