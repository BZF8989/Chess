/**
 *
 * Knight class
 *
 * Created by Bill on 2/19/2018.
 */
public class Knight implements Piece {

    private boolean original_spot;

    private int x_cord;

    private int y_cord;

    private final PieceTypes self = PieceTypes.KNIGHT;

    private final Player p;

    Knight(int x, int y, Player p){
        x_cord = x;
        y_cord = y;
        original_spot = true;
        this.p = p;
    }


    @Override
    public void move(int x, int y) {
        x_cord = x;
        y_cord = y;
        original_spot = false;
    }

    @Override
    public int pieceType() {
        return self.getPieceType();
    }

    @Override
    public int getXcord() {
        return x_cord;
    }

    @Override
    public int getYcord() {
        return y_cord;
    }

    @Override
    public Player getPlayer() {
        return p;
    }
}
