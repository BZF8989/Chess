import javax.swing.*;
import java.awt.*;

/**
 *
 *
 *
 * Created by Bill on 2/21/2018.
 */
public class Game {

    private static final int SIZE = 800;

    private static final int DISPLAY = 20;

    public static void main(String[] args) {
        Board b = new Board(Player.WHITE, Player.BLACK);
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(b);
        f.setMinimumSize(new Dimension(SIZE,SIZE+DISPLAY));
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);

    }

}
