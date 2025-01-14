package com.example.liverpoolapi.repos;

import com.example.liverpoolapi.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface PlayerRepository extends JpaRepository<Player, UUID> {

    @Query("SELECT p FROM Player p ORDER BY RANDOM()")
    Optional<Player> findRandomPlayer();
}
