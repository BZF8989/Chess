/**
 *
 * piece type constants
 *
 * Created by Bill on 2/15/2018.
 */
public enum PieceTypes {

    PAWN(1), ROOK(2), KNIGHT(3), BISHOP(4), QUEEN(5), KING(6);

    private final int value;

    PieceTypes(int v){
        value = v;
    }

    int getPieceType(){
        return value;
    }


}
