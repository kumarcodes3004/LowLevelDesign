package com.satyam.model;


import org.springframework.stereotype.Component;

@Component
public class PlayingPieceX extends PlayingPiece{

    public PlayingPieceX(){
        super(PieceType.X);
    }

    @Override
    public String toString(){
        return "X";
    }
}
