package calculation.board;
import calculation.pieces.*;
public class Board{
    Piece [][] board;
    boolean playerWhite;  // Is the player white?  
    boolean playerBlack; 
    boolean whiteTurn; // Is white the player that has to move? 

    public Board(boolean playerWhite){
        this.playerWhite = playerWhite;
        this.playerBlack = !playerWhite;
        setUp();
    }

    public void setUp(){
        this.board = new Piece[8][8]();
        for (int i = 0; i < 8; i++){ //x Coordinate
            for (int j = 2; j < 7; j++){ //y Coordinate
                this.board[i][j] = new Empty(false, false, i, j);
            }
        } 
        for (int i = 0; i < 8; i++){
            this.board[i][1] = new Pawn (true, false, i, 1);//white pawns
            this.board[i][6] = new Pawn (false, true, i, 6);//black pawns
        }
        this.board[0][0] = new Rock(true, false, 0, 0);//Rocks
        this.board[7][0] = new Rock(true, false, 7, 0);
        this.board[0][7] = new Rock(false, true, 0, 7);
        this.board[7][7] = new Rock(true, false, 7, 7);

        this.board[1][0] = new Knight(true, false, 1, 0);
        this.board[6][0] = new Knight(true, false, 6, 0);
        this.board[1][7] = new Knight(false, true, 1, 7);
        this.board[6][7] = new Knight(true, false, 6, 7);

        this.board[2][0] = new Bishop(true, false, 2, 0);
        this.board[5][0] = new Bishop(true, false, 5, 0);
        this.board[2][7] = new Bishop(false, true, 2, 7);
        this.board[5][7] = new Bishop(true, false, 5, 7);

        this.board[3][0] = new Queen(true, false, 3, 0);
        this.board[3][7] = new Queen(false, true, 3, 7);

        this.board[4][0] = new King(true, false, 4, 0);
        this.board[4][7] = new King(true, false, 4, 7);
    }


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