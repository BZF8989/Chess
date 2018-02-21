import javax.swing.*;
import java.awt.*;

/**
 *
 *
 *
 * Created by Bill on 2/21/2018.
 */
public class Game {

    public static void main(String[] args) {
        boolean isWhite = true;
        Player white = new Player(isWhite);
        Player black = new Player(!isWhite);
        Board b = new Board(white, black);
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(b);
        f.setMinimumSize(new Dimension(800,800));
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);

    }

}
