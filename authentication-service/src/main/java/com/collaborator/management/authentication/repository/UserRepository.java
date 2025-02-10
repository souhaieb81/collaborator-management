package com.collaborator.management.authentication.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collaborator.management.authentication.model.User;

public interface UserRepository extends JpaRepository<User, UUID>{

}
