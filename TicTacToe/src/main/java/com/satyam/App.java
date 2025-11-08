package com.satyam;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Welcome to the Game" );

        TicTacToeGame game =new TicTacToeGame();
        System.out.println("game winner is: "+game.startGame());
    }
}
