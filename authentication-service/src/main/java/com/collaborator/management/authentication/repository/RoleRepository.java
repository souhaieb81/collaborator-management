package com.collaborator.management.authentication.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collaborator.management.authentication.model.Role;

public interface RoleRepository extends JpaRepository<Role, UUID> {

}
