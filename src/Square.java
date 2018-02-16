import java.awt.*;

/**
 *
 * A single square on the board
 *
 *
 * Created by bill on 2/15/2018.
 */
public class Square {

    private final Color c;

    private final int X_CORD;

    private final int Y_CORD;

    private boolean selected;

    private boolean viableMove;

    Square(int x, int y){
        X_CORD = x;
        Y_CORD = y;
        if((x+y)%2 == 0){
            c = Color.BLACK;
        }else {
            c = Color.WHITE;
        }
        selected = false;
        viableMove = false;
    }



}
