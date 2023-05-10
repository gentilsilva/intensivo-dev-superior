package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.model.Game;

public record GameDTO(
        Long id,
        String title,
        String genre,
        String platforms,
        Double score,
        Integer year,
        String imgUrl,
        String shortDescription
) {
    public GameDTO(Game game) {
        this(game.getId(), game.getTitle(), game.getGenre(), game.getPlatforms(), game.getScore(), game.getYear(), game.getImgUrl(), game.getShortDescription());
    }
}
