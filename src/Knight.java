/**
 *
 * Knight class
 *
 * Created by Bill on 2/19/2018.
 */
public class Knight extends Piece {

    private final PieceTypes self = PieceTypes.KNIGHT;

    Knight(int x, int y, Player p){
        super(x, y, p);
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public int pieceType() {
        return 0;
    }

    @Override
    public boolean canMove(int x, int y) {
        return false;
    }

    @Override
    public boolean canTake(int x, int y) {
        return false;
    }


}
