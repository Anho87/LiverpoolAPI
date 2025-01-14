package com.example.liverpoolapi.Player;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {
    
    
    private final PlayerService playerService;


    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }
    
    @GetMapping("/all")
    public List<MiniPlayerDto> getAllPlayers(){
        return playerService.getAllMiniPlayersDto();
    }
    
    @GetMapping("/position")
    public List<MiniPlayerDto> getPlayersWithPosition(@RequestParam(defaultValue = "") String position){
        return playerService.getMiniPlayersWithPosition(position.trim());
    }
    
    @GetMapping("/player")
    public DetailedPlayerDto getDetailedPlayer(@RequestParam String id){
        return playerService.getPlayerWithId(id);
    }
    
    
}
