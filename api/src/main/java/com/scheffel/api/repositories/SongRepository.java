package com.scheffel.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scheffel.api.models.Song;

public interface SongRepository extends JpaRepository<Song,Long> {}
