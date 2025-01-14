package com.example.liverpoolapi.Player;

import com.example.liverpoolapi.Position.Position;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PlayerService {
    
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
    
    public List<MiniPlayerDto> getAllMiniPlayersDto(){
        List<Player> players = playerRepository.findAll();
        return players.stream()
                .map(player -> new MiniPlayerDto(
                        player.getId(),
                        player.getName(),
                        player.getShirtNumber(),
                        player.getPosition().getValue()
                ))
                .collect(Collectors.toList());
    }

    public List<MiniPlayerDto> getMiniPlayersWithPosition(String position) {
        Position enumPosition = Position.valueOf(position.toUpperCase());
        List<Player> players = playerRepository.findAllByPosition(enumPosition);
        return players.stream()
                .map(player -> new MiniPlayerDto(
                        player.getId(),
                        player.getName(),
                        player.getShirtNumber(),
                        player.getPosition().getValue()
                ))
                .collect(Collectors.toList());
    }
    
    public DetailedPlayerDto getPlayerWithId(String id){
        UUID uuid = UUID.fromString(id);
        Optional<Player> optionalPlayer = playerRepository.findById(uuid);
        return optionalPlayer.map(player -> new DetailedPlayerDto(
                player.getId(), 
                player.getName(),
                player.getShirtNumber(),
                player.getBirthDate(),
                player.getCountry(),
                player.getHeight(),
                player.getPosition().getValue()

        )).orElseThrow(() -> new RuntimeException("Player not found"));
    }
}
