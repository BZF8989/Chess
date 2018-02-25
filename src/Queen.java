/**
 *
 * Queen
 *
 * Created by Bill on 2/19/2018.
 */
public class Queen extends Piece {

    private final PieceTypes self = PieceTypes.QUEEN;

    Queen(int x, int y, Player p){
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
        Pair square = new Pair(x,y);
        updateSquares();
        return getMove().stream().anyMatch(i-> i.equals(square));
    }

    @Override
    public boolean canTake(int x, int y) {
        return false;
    }

    @SuppressWarnings("unchecked")
    private void updateSquares(){
        getMove().clear();
        //TODO
    }

}
