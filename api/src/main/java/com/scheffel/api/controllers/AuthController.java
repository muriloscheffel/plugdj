package com.scheffel.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scheffel.api.dtos.LoginRequestDto;
import com.scheffel.api.dtos.RegisterRequestDto;
import com.scheffel.api.dtos.ResponseDto;
import com.scheffel.api.services.AuthService;


@RestController
@RequestMapping("/api/auth")
public class AuthController {

  @Autowired
  private AuthService authService;

  @PostMapping("/login")
  public ResponseEntity login(@RequestBody LoginRequestDto body) {
    ResponseDto response = authService.login(body.email(), body.password());
    return ResponseEntity.ok(response);
  }

  @PostMapping("/register")
  public ResponseEntity register(@RequestBody RegisterRequestDto body) {
    ResponseDto response = authService.register(body);
    return ResponseEntity.ok(response);
  }
}
