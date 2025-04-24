package com.scheffel.api.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.scheffel.api.dtos.RegisterRequestDto;
import com.scheffel.api.dtos.ResponseDto;
import com.scheffel.api.infra.security.TokenService;
import com.scheffel.api.models.User;
import com.scheffel.api.repositories.UserRepository;

@Service
public class AuthService {
  
  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;
  private final TokenService tokenService;

  public AuthService(UserRepository userRepository, PasswordEncoder passwordEncoder, TokenService tokenService) {
    this.userRepository = userRepository;
    this.passwordEncoder = passwordEncoder;
    this.tokenService = tokenService;
  }

  public ResponseDto login(String email, String password) {
    User user = userRepository.findByEmail(email)
        .orElseThrow(() -> new RuntimeException("User not found"));

    if (!passwordEncoder.matches(password, user.getPassword())) {
      throw new RuntimeException("Invalid credentials");
    }

    String token = tokenService.generateToken(user);
    return new ResponseDto(user.getName(), token);
  }

  public ResponseDto register(RegisterRequestDto body) {
    Optional<User> existingUser = userRepository.findByEmail(body.email());

    if (existingUser.isPresent()) {
      throw new RuntimeException("Email already in use");
    }

    User user = new User();
    user.setName(body.name());
    user.setEmail(body.email());
    user.setPassword(passwordEncoder.encode(body.password()));
    this.userRepository.save(user);

    String token = tokenService.generateToken(user);
    return new ResponseDto(user.getName(), token);
  }
}
