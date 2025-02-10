package com.collaborator.management.authentication.service;

import java.util.Optional;
import java.util.UUID;

import com.collaborator.management.authentication.dto.UserDto;
import com.collaborator.management.authentication.model.User;

public interface UserService {

	Optional<UserDto> createUser(UserDto userDto);
	
	Optional<User> getUserById(UUID userId);
	
	Optional<User> updateUser(UserDto userDto);
	
	void deleteUser(UUID userId);
}
