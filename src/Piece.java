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




}
