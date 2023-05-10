package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.model.GameList;

public record GameListDTO(
        Long id,
        String name
) {
    public GameListDTO(GameList gameList) {
        this(gameList.getId(), gameList.getName());
    }
}
