package com.devsuperior.dslist.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Entity(name = "GameList")
@Table(name = "tb_game_list")
@Getter
@EqualsAndHashCode(of = "id")
public class GameList {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
