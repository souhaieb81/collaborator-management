package com.collaborator.management.authentication.service;

import java.util.UUID;

import com.collaborator.management.authentication.dto.RoleDto;
import com.collaborator.management.authentication.model.Role;

public interface RoleService {

	Role createRole(RoleDto roleDto);
	
	Role updateRole(RoleDto roleDto);
	
	void delteRole(UUID roleId);
}
