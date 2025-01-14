package com.example.liverpoolapi.Player;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
public class DetailedPlayerDto {
    
    private UUID id;
    private String name;
    private int shirtNumber;
    private LocalDate birthDate;
    private String country;
    private double height;
    private String position; 
    
    public DetailedPlayerDto(UUID id, String name, int shirtNumber, LocalDate birthDate, String country, double height, String position) {
        this.id = id;
        this.name = name;
        this.shirtNumber = shirtNumber;
        this.birthDate = birthDate;
        this.country = country;
        this.height = height;
        this.position = position;
    }
    
}

