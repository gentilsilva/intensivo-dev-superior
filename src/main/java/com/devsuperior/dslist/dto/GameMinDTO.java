package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.model.Game;
import com.devsuperior.dslist.projection.GameMinProjection;

public record GameMinDTO(
        Long id,
        String title,
        Integer year,
        String imgUrl,
        String shortDescription
) {
    public GameMinDTO(Game game) {
        this(game.getId(), game.getTitle(), game.getYear(), game.getImgUrl(), game.getShortDescription());
    }

    public GameMinDTO(GameMinProjection gameMinProjection) {
        this(gameMinProjection.getId(), gameMinProjection.getTitle(), gameMinProjection.getYear(), gameMinProjection.getImgUrl(), gameMinProjection.getShortDescription());
    }
}
