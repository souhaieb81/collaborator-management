package com.collaborator.management.authentication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collaborator.management.authentication.dto.UserDto;
import com.collaborator.management.authentication.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	private final UserService userService;
	
	public AuthController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping
	public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto) {
		return ResponseEntity.ok(userService.createUser(userDto).get());
	}
}
