import javax.swing.*;

/**
 *
 * Chess board class
 * Stores all pieces for both players
 *
 * Created by Bill on 2/15/2018.
 */
public class Board extends JComponent{

    private final int BOARD_SIZE = 8;

    private Square [][] board = new Square [BOARD_SIZE][BOARD_SIZE];

    private Player whosMove;

    private Player nextMove;

    Board(Player white, Player black){
        whosMove = white;
        nextMove = black;
        board = fillBoard(board);
    }


    /**
     * fills board with all pieces
     * @param board
     * @return a board with all pieces in the proper starting places
     */
    private Square[][] fillBoard(Square [][] board){

        board = createBoard(board);

        for(int i = 0; i < BOARD_SIZE; i++ ){
            board[1][i].addPiece(new Pawn(1 , i, whosMove));
        }

        for(int i = 0; i < BOARD_SIZE; i++ ){
            board[BOARD_SIZE-1][i].addPiece(new Pawn(BOARD_SIZE-1 , i, nextMove));
        }
        return board;
    }

    /**
     * Fills the board with the square class 8x8
     *
     * @param board
     * @return board filled with empty squares
     */
    private Square[][] createBoard(Square[][] board){
        for(int i = 0; i < BOARD_SIZE; i++){
            for(int j = 0; j < BOARD_SIZE; j++){
                board[i][j] = new Square(i,j);
            }
        }

        return board;
    }

    /**
     * moves a piece from square from to square to.
     *
     * @param from
     * @param to
     * @return null if there is no piece on square from or if there is no piece being taken
     *          from square to
     */
    public Piece movePiece(Square from, Square to){
        if(!from.hasPiece()){
            return null;
        }else{
            Piece temp = to.getPiece();
            from.movePiece(to);
            return temp;
        }
    }



}
