import javax.swing.*;
import java.awt.*;

/**
 *
 * Chess board class
 * Stores all pieces for both players
 *
 * Created by Bill on 2/15/2018.
 */
public class Board extends JComponent{

    private final int BOARD_SIZE = 8;

    private static final int SIZE = 800;

    private static final int DISPLAY_HEIGHT = 20;

    private static final int NUMBER_OF_PLAYERS = 2;

    private Piece [][] board = new Piece [BOARD_SIZE][BOARD_SIZE];

    private Player whosMove;

    private Player nextMove;

    Board(Player white, Player black){
        whosMove = white;
        nextMove = black;
        board = fillBoard(board);

        drawBoard();
    }

    /**
     * draws board and
     */
    private void drawBoard(){
        setLayout(new BorderLayout());
        JLabel topText = new JLabel();
        topText.setPreferredSize(new Dimension(SIZE/NUMBER_OF_PLAYERS, DISPLAY_HEIGHT));
        topText.setLayout(new GridLayout(1, NUMBER_OF_PLAYERS));
        JLabel move = new JLabel ("Test label");
        topText.add(move);

        add(topText, BorderLayout.PAGE_START);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(BOARD_SIZE,BOARD_SIZE));
        JButton [][] buttons = new JButton[BOARD_SIZE][BOARD_SIZE];

        for(int i = 0; i<BOARD_SIZE; i++){
            for(int j = 0; j<BOARD_SIZE; j++){
                //final int f = i;
                //final int g = j;
                final JButton b = new JButton();
                if ((i+j)%2==0){
                    b.setBackground(Color.BLACK);
                }else {
                    b.setBackground(Color.WHITE);
                }
                buttons[i][j] = b;

                p.add(buttons[i][j]);
            }
        }
        add(p, BorderLayout.CENTER);
    }


    /**
     * fills board with all pieces
     * @param board
     * @return a board with all pieces in the proper starting places
     */
    private Piece[][] fillBoard(Piece [][] board){

        board = createBoard(board);


        return board;
    }

    /**
     * Fills the board with the square class 8x8
     *
     * @param board
     * @return board filled with empty squares
     */
    private Piece[][] createBoard(Piece[][] board){

        return board;
    }

    /**
     * moves a piece from square from to square to.
     *
     * @param x_from
     * @param y_from
     * @param x_to
     * @param y_to
     * @return null if there is no piece on square from or if there is no piece being taken
     *          from square to
     */
    public Piece movePiece(int x_from, int y_from, int x_to, int y_to){



        return board[x_to][y_to];
    }



}
