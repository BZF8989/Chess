import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * pieces on the board
 *
 * Created by Bill on 2/15/2018.
 */
public abstract class Piece {

    private boolean original_spot;

    private final int BOARD_SIZE = 8;

    private int x_cord;

    private int y_cord;

    private final Player p;

    private ArrayList<Pair> move;


    Piece(int x, int y, Player p){
        x_cord = x;
        y_cord = y;
        this.p = p;
        move=null;
    }


    public ArrayList<Pair> getMove(){
        return move;
    }

    /**
     * moves piece to x,y
     * @param x
     * @param y
     */
    public abstract void move(int x, int y);

    /**
     * using the class PieceType, determines what piece it is
     *
     * @return the type of piece as int
     */
    public abstract int pieceType();

    /**
     * gets piece's current x cord
     * @return x cord
     */
    public int getXcord(){
        return x_cord;
    }

    /**
     * gets piece's current y cord
     * @return y cord
     */
    public int getYcord(){
        return y_cord;
    }

    /**
     * gets the player that owns this piece
     * @return the player that owns the piece
     */
    public Player getPlayer(){
        return p;
    }

    /**
     * determines if the piece can move to x and y
     * @param x
     * @param y
     * @return true if move is legal, false otherwise
     */
    public abstract boolean canMove(int x, int y);

    /**
     * can move to take a piece
     * @param x
     * @param y
     * @return true if you can take a piece at x,y; false otherwise
     */
    public abstract boolean canTake(int x, int y);


    public boolean withInBounds(int x, int y){
        return x>=0 && x <=BOARD_SIZE && y>=0 && y<=BOARD_SIZE;
    }

}
