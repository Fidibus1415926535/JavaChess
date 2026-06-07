package javachess.calculation.pieces;
import javachess.calculation.board.Board;
public class King extends PieceClass{
    Type type = KING;
    int xCoord;
    int yCoord;
    boolean white;
    boolean black;

    public King(boolean white, boolean black, int x, int y){
        this.white = white;
        this.black = black; 
        this.xCoord = x;
        this.yCoord = y;
    }

    public Move[] getMoves(Board board){
        
    }
}