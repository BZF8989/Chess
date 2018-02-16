/**
 *
 * Class to store the player.
 *
 * Created by Bill on 2/15/2018.
 */
public class Player {

    private String player;

    Player(boolean player){
        if(player){
            this.player = "White";
        }else {
            this.player = "Black";
        }
    }

    @Override
    public String toString(){
        return player;
    }



}
