package com.example.liverpoolapi.Position;

import lombok.Getter;

@Getter
public enum Position {
    
    GOALKEEPER("Goalkeeper"),
    DEFENDER("Defender"),
    MIDFIELDER("Midfielder"),
    FORWARD("Forward");


    private final String value;

    Position(String value) {
        this.value = value;
    }

}
