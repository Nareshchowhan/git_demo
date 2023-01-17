package com.usermangement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usermangement.entity.User;
import com.usermangement.serviceimpl.UserServiceImpl;
import com.usermangement.userdao.UserDTO;

import jakarta.validation.Valid;

@RestController
public class UserController {
	@Autowired
	UserServiceImpl userServiceImpl;
	@PostMapping(path="/users")
	ResponseEntity<User> addUser(@RequestBody @Valid UserDTO userDTO)
	{
		return new ResponseEntity<>(userServiceImpl.saveUser(userDTO),HttpStatus.CREATED);
		
	}
	@GetMapping(path="/users/{id}")
	 public ResponseEntity<User> getUserById(@PathVariable Long id)
	{
		return new ResponseEntity<>(userServiceImpl.getUserById(id),HttpStatus.OK);
	}

}
