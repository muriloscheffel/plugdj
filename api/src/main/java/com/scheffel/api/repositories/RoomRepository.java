package com.scheffel.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scheffel.api.models.Room;

public interface RoomRepository extends JpaRepository<Room,Long> {}
