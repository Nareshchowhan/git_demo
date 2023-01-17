package com.usermangement.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usermangement.entity.User;
import com.usermangement.repository.UserRepository;
import com.usermangement.service.UserService;
import com.usermangement.userdao.UserDTO;


@Service
public class UserServiceImpl implements UserService {
	
	

	@Autowired
	UserRepository userRepository;
	public User saveUser(UserDTO userDTO) {
		
		User user=( User.builder()).name(userDTO.getName()).email(userDTO.getEmail()).phoneNumber(userDTO.getPhoneNumber())
				   .age(userDTO.getAge()).build();
		return userRepository.save(user);
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}