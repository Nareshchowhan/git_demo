package com.usermangement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usermangement.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
