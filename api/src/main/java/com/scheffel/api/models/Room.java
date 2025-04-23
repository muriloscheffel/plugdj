package com.scheffel.api.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity(name = "rooms")
@Table(name = "rooms")
@AllArgsConstructor
@NoArgsConstructor
public class Room {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String description;
  private int capacity;

  private LocalDateTime createdAt;

  @PrePersist
  protected void onCreate() {
    capacity = 30;
    createdAt = LocalDateTime.now();
  }

  
}
