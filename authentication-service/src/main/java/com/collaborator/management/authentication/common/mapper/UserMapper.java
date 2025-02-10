package com.collaborator.management.authentication.common.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.collaborator.management.authentication.dto.UserDto;
import com.collaborator.management.authentication.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "hashPassword", source = "password")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "roles", ignore = true)
    User fromDto(UserDto userDto);
}