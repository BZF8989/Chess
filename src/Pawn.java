/**
 * the pawn piece
 *
 * Created by Bill on 2/15/2018.
 */
public class Pawn extends Piece {

    private final PieceTypes self = PieceTypes.PAWN;

    Pawn(int x, int y, Player p){
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
