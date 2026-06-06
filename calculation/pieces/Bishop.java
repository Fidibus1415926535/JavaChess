package calculation.pieces;
import calculations.board.Board;
public class Bishop implements Piece{
    Type type = BISHOP;
    int xCoord;
    int yCoord;
    boolean white;
    boolean black;

    public Bishop(boolean white, boolean black, int x, int y){
        this.white = white;
        this.black = black; 
        this.xCoord = x;
        this.yCoord = y;
    }

    public Move[] getMoves(Board board){
        
    }
}