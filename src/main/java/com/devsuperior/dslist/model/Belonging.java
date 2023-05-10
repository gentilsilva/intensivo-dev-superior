package com.devsuperior.dslist.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Belonging")
@Table(name = "tb_belonging")
@NoArgsConstructor
@Getter
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer position;

    public Belonging(Game game, GameList gameList, Integer position) {
        id.setGame(game);
        id.setGameList(gameList);
        this.position = position;
    }

}
