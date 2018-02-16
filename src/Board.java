import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * Chess board class
 * Stores all pieces for both players
 *
 * Created by bill on 2/15/2018.
 */
public class Board {

    private final int BOARD_SIZE = 8;

    private Collection<Collection<Square>> board;

    private Player white;

    private Player black;

    Board(Player white, Player black){
        this.white = white;
        this.black = black;
        fillboard(board);
    }


    /**
     * fills board with 8 by 8 squares
     * @param board
     */
    private void fillboard(Collection<Collection<Square>> board){
        for(int i = 0; i < BOARD_SIZE; i++){
            Collection<Square> row = new LinkedList<>();
            for(int j = 0; j < BOARD_SIZE; j++){
                row.add(new Square(i,j));
            }
            board.add(row);
        }

    }
}
