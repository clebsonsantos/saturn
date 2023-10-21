package com.ms.titan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.titan.models.UserModel;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
}
