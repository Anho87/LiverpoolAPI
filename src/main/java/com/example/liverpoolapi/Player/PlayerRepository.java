package com.example.liverpoolapi.Player;

import com.example.liverpoolapi.Position.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface PlayerRepository extends JpaRepository<Player, UUID> {
    

    List<Player> findAllByPosition(Position position);
    
}
