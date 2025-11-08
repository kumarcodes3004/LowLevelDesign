package com.satyam;

//import ch.qos.logback.core.joran.sanity.Pair;
import com.satyam.model.*;
import javafx.util.Pair;

import org.springframework.stereotype.Component;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@Component
public class TicTacToeGame {

    Deque<Player> players;
    Board gameBoard;

    TicTacToeGame(){
        initializeGame();
    }

    public void initializeGame(){
        players = new LinkedList<>();
        PlayingPieceO  noughtsPiece =new PlayingPieceO();
        Player p1 = new Player("satyam",noughtsPiece);

        PlayingPieceX crossPiece = new PlayingPieceX();
        Player p2 =new Player("aaryan",crossPiece);

        players.add(p1);
        players.add(p2);

        gameBoard =new Board(3);
    }


    public String startGame(){

        boolean noWinner =true;

        while(noWinner){
            Player playerTurn = players.removeFirst();

            gameBoard.printBoard();

            List<Pair<Integer,Integer>> freeSpaces =gameBoard.getFreeCells();

            if(freeSpaces.isEmpty()){
                noWinner=false;
                continue;
            }

            System.out.println("Player : "+playerTurn.getName() + "Enter row,col: ");
            Scanner inputScanner =new Scanner(System.in);
            String s =inputScanner.nextLine();
            String[] values = s.split(",");
            int inputR = Integer.valueOf(values[0]);
            int inputC  = Integer.valueOf(values[1]);

            boolean pieceAddedSuccessfully= gameBoard.addPiece(inputR,inputC,playerTurn.getPiece());

            if(!pieceAddedSuccessfully){
                System.out.println("INCORRECT position choosen to add ,try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner =isThereWinner(inputR,inputC,playerTurn.getPiece().pieceType);

            if(winner){
                return playerTurn.getName();
            }

        }

        return "tie";
    }

    public boolean isThereWinner(int r, int c, PieceType pieceType){
        boolean rowMatch =true;
        boolean columnMatch =true;
        boolean diagonalMatch =true;
        boolean antiDiagonalMatch =true;

        //check for row match
        for(int i=0;i< gameBoard.size;i++){
            if(gameBoard.board[r][i] == null || gameBoard.board[r][i].pieceType!=pieceType ){
                rowMatch=false;
            }
        }

        //check for col match
        for(int i=0;i< gameBoard.size;i++){
            if(gameBoard.board[i][c] == null || gameBoard.board[i][c].pieceType!=pieceType ){
                columnMatch=false;
            }
        }

        //check for diagonals

        for(int i=0,j=0;i< gameBoard.size;i++,j++){
            if(gameBoard.board[i][j]==null || gameBoard.board[i][j].pieceType!= pieceType){
                diagonalMatch=false;
            }
        }


        for(int i=0,j=gameBoard.size-1;i< gameBoard.size;i++,j--){
            if(gameBoard.board[i][j]==null || gameBoard.board[i][j].pieceType!= pieceType){
                antiDiagonalMatch=false;
            }
        }

        return rowMatch || columnMatch||diagonalMatch || antiDiagonalMatch;

    }


}
