package calculation.pieces;
import calculations.board.Board;
public class Empty implements Piece{
    Type type = EMPTY;
    int xCoord;
    int yCoord;
    boolean white;
    boolean black;

    public Empty(boolean white, boolean black, int x, int y){
        this.white = white;
        this.black = black; 
        this.xCoord = x;
        this.yCoord = y;
    }

    public Move[] getMoves(Board board){
        
    }
}