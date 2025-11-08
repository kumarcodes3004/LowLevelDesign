package com.satyam.model;



import org.springframework.stereotype.Component;

import java.util.ArrayList;
import javafx.util.Pair;
//import org.antlr.v4.runtime.misc.Pair;

import java.util.List;

@Component
public class Board {

    public int size;
    public PlayingPiece[][] board;

    public Board(int size){
        this.size=size;
        board =new PlayingPiece[size][size];
    }

    public boolean addPiece(int r,int c,PlayingPiece playingPiece){

        if(board[r][c]!= null){
            return false;
        }

        board[r][c]= playingPiece;
        return true;

    }

    public void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public List<Pair<Integer, Integer>> getFreeCells() {

        List<Pair<Integer,Integer>> freeCell =new ArrayList<>();

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null){
                    Pair<Integer,Integer> rowCol= new Pair<>(i,j);
                    freeCell.add(rowCol);
                }
            }
        }

        return freeCell;
    }
}
