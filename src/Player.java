/**
 *
 * Enum to store the player.
 *
 * Created by Bill on 2/15/2018.
 */
public enum Player {
    WHITE, BLACK;

    public Player getNext(){
        switch(this){
            case WHITE: return BLACK;
            case BLACK: return WHITE;
            default: throw new IllegalStateException();

        }

    }



}
