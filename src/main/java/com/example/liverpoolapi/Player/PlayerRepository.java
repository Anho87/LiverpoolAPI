package com.example.liverpoolapi.Player;

import com.example.liverpoolapi.Player.Player;
import com.example.liverpoolapi.Position.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PlayerRepository extends JpaRepository<Player, UUID> {

    @Query("SELECT p FROM Player p ORDER BY RANDOM()")
    Optional<Player> findRandomPlayer();


    List<Player> findAllByPosition(Position position);
    
}
