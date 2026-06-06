package chess.calculation.pieces;
public interface Piece{
    public record Move(int x, int y) {}
    Type type;
    int xCoord;
    int yCoord;
    boolean white;
    public Move[] getMoves();
    

}