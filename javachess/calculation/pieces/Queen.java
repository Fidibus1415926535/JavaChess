package javachess.calculation.pieces;
import javachess.calculation.board.Board;
public class Queen extends PieceClass{
    Type type = QUEEN;
    int xCoord;
    int yCoord;
    boolean white;
    boolean black;

    public Queen(boolean white, boolean black, int x, int y){
        this.white = white;
        this.black = black; 
        this.xCoord = x;
        this.yCoord = y;
    }

    public Move[] getMoves(Board board){
        
    }
}