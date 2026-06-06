package calculation.pieces;
import calculations.board.Board;
public interface Piece{
    Type type;
    int xCoord;
    int yCoord;
    boolean white; //Piece can have white and black because EMPTY pieces have neither 
    boolean black;
    public Move[] getMoves(Board board);
    

}