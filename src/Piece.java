/**
 *
 * pieces on the board
 *
 * Created by Bill on 2/15/2018.
 */
public interface Piece {

    /**
     * moves piece to x,y
     * @param x
     * @param y
     */
    void move(int x, int y);

    /**
     * using the class PieceType, determines what piece it is
     *
     * @return the type of piece as int
     */
    int pieceType();

    /**
     * gets piece's current x cord
     * @return x cord
     */
    int getXcord();

    /**
     * gets piece's current y cord
     * @return y cord
     */
    int getYcord();

    /**
     * gets the player that owns this piece
     * @return the player that owns the piece
     */
    Player getPlayer();

    /**
     * determines if the piece can move to x and y
     * @param x
     * @param y
     * @return true if move is legal, flase otherwise
     */
    boolean canMove(int x, int y);

    /**
     * can move to take a piece
     * @param x
     * @param y
     * @return true if you can take a piece at x,y; false otherwise
     */
    boolean canTake(int x, int y);




}
