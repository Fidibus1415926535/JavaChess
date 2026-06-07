package javachess.calculation.pieces;
import javachess.calculation.board.Board;
public class Rock extends PieceClass{
    Type type = ROCK;
    int xCoord;
    int yCoord;
    boolean white;
    boolean black;

    public Rock(boolean white, boolean black, int x, int y){
        this.white = white;
        this.black = black; 
        this.xCoord = x;
        this.yCoord = y;
    }

    public Move[] getMoves(Board board){
        
    }
}