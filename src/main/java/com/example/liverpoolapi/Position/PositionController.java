package com.example.liverpoolapi.Position;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PositionController {

    private final PositionService positionService;

    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }
    
    @GetMapping("/positions")
    public List<String> getAllPositions(){
        return positionService.getAllPositions();
    }
}
