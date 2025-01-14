package com.example.liverpoolapi.Player;

import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
public class MiniPlayerDto {

    private UUID id;
    private String name;
    private int shirtNumber;
    private String position;

    public MiniPlayerDto(UUID id, String name, int shirtNumber, String position) {
        this.id = id;
        this.name = name;
        this.shirtNumber = shirtNumber;
        this.position = position;
    }
}
