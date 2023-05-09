package com.devsuperior.dslist.services;

import com.devsuperior.dslist.models.dto.GameDTO;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAllGames() {
        return gameRepository.findAll().stream().map(GameDTO::new).toList();
    }

}
