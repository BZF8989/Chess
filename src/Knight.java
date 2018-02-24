/**
 *
 * Knight class
 *
 * Created by Bill on 2/19/2018.
 */
public class Knight extends Piece {

    private static int x[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
    private static int y[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

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

    @SuppressWarnings("unchecked")
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
        for(int i =0; i< x.length; i++){
            int temp_x = getXcord() + x[i];
            int temp_y = getYcord() + y[i];
            if(withInBounds(temp_x, temp_y)){
                getMove().add(new Pair(temp_x, temp_y));
            }
        }
    }





}
