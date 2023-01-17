package com.usermangement.service;

import com.usermangement.entity.User;
import com.usermangement.userdao.UserDTO;

public interface UserService {

	User saveUser(UserDTO userDTO);
	User getUserById(Long id);
}
