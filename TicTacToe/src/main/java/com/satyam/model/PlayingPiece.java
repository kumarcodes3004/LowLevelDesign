package com.satyam.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class PlayingPiece  {

    public PieceType pieceType;

    PlayingPiece(PieceType pieceType){
        this.pieceType=pieceType;
    }
}
