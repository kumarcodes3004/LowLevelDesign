package com.satyam.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Player {

    public String name;
    public PlayingPiece piece;

    public Player(String name,PlayingPiece playingPiece){
        this.name=name;
        this.piece =playingPiece;
    }

}
