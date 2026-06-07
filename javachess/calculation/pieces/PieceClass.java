package javachess.calculation.pieces;
public class PieceClass implements PieceInterface{
    Type type;
    int xCoord;
    int yCoord;
    boolean white; //Piece can have white and black because EMPTY pieces have neither 
    boolean black;
    public Move[] getMoves(Board board){
        return null;
    }
}