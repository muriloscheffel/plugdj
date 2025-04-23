package com.scheffel.api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scheffel.api.models.User;

public interface UserRepository extends JpaRepository<User, String>{

  Optional<User> findByEmail(String email);

}
