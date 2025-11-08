package com.satyam.model;


import lombok.ToString;
import org.springframework.stereotype.Component;

//@ToString
@Component
public class PlayingPieceO extends PlayingPiece{

    public PlayingPieceO(){
        super(PieceType.O);
    }
    @Override
    public String toString(){
        return "0";
    }
}
