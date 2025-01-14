package com.example.liverpoolapi.Position;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PositionService {
    
    public List<String> getAllPositions(){
        return Arrays.stream(Position.values())
                .map(Position::getValue)
                .toList();
    }
}
