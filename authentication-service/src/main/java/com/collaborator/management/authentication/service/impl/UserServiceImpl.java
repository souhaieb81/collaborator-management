package com.collaborator.management.authentication.service.impl;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.collaborator.management.authentication.common.mapper.UserMapper;
import com.collaborator.management.authentication.dto.UserDto;
import com.collaborator.management.authentication.model.Role;
import com.collaborator.management.authentication.model.User;
import com.collaborator.management.authentication.repository.RoleRepository;
import com.collaborator.management.authentication.repository.UserRepository;
import com.collaborator.management.authentication.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	
	private final RoleRepository roleRepository;
	
	private final UserMapper userMapper;
	
	public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, UserMapper userMapper) {
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
		this.userMapper = userMapper;
	}

	@Override
	public Optional<User> getUserById(UUID userId) {
		return userRepository.findById(userId);
	}
	
	@Override
	public Optional<UserDto> createUser(UserDto userDto) {
		Optional<Role> role = roleRepository.findById(UUID.fromString("2"));
		User user = userMapper.fromDto(userDto);
		Set<Role> roles = new HashSet<>();
		roles.add(role.get());
		user.setRoles(roles);
		user.setActive(true);
		user.setCreatedAt(ZonedDateTime.now());
		
		return Optional.of(userMapper.toDto(userRepository.save(user)));
	}

	@Override
	public Optional<User> updateUser(UserDto userDto) {
		return Optional.of(userRepository.save(userMapper.fromDto(userDto)));
	}

	@Override
	public void deleteUser(UUID userId) {
		userRepository.delete(getUserById(userId).get());

	}

}
