package com.example.liverpoolapi.controllers;

import com.example.liverpoolapi.models.Player;
import com.example.liverpoolapi.repos.PlayerRepository;
import com.example.liverpoolapi.services.PlayerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {
    
    
    private final PlayerService playerService;


    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }
    
    @GetMapping("/players")
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }
}
