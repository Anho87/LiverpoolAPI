package com.example.liverpoolapi.services;

import com.example.liverpoolapi.models.Player;
import com.example.liverpoolapi.repos.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
    
    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }

    public Player getRandomPlayer() {
        return playerRepository.findRandomPlayer()
                .orElseThrow(() -> new IllegalStateException("No players found in the database"));
    }
}
