package com.example.liverpoolapi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    
    private String name;
    private int shirtNumber;
    private LocalDate birthDate;
    private String country;
    private double height;

    @Enumerated(EnumType.STRING)
    private Position position;
}
