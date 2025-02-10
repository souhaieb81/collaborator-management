package com.collaborator.management.authentication.common.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.collaborator.management.authentication.dto.RoleDto;
import com.collaborator.management.authentication.model.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {

	Role fromDto(RoleDto roleDto);

	RoleDto toDto(Role role);

	List<RoleDto> toListDto(List<Role> roles);
}
