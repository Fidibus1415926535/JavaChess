package chess.calculation.board;
import chess.calculation.pieces.*;
public class Board{
    Piece [][] board;
    boolean white;  // Is the player white?  
    boolean whiteTurn; // Is white the player that has to move? 


    //todo (for each piece do piece.getMoves() and save the result)
    public Move[] getAllMoves(){}

    //todo (for each Move in the list verify the move using positionLegal())
    public Move verifyMoves(Move[] unverifiedMoves){}

    //todo (check if a move results in a legal position, uses check())
    public boolean positionLegal(){}

    //todo (check for check on board)
    public boolean check(){}

    //todo (check for checkmate on board)
    public boolean checkMate(){}
}