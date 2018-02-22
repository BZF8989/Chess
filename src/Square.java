import java.awt.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * A single square on the board
 *
 *
 * Created by Bill on 2/15/2018.
 */
public class Square {

    private final static String PROPERTY_NAME = Square.class.getName();

    private final PropertyChangeSupport listeners;

    private final Color c;

    private final int X_CORD;

    private final int Y_CORD;

    /**
     * clicking this square will switch this boolean
     *
     */
    private boolean selected;

    private Piece p;

    Square(int x, int y){
        X_CORD = x;
        Y_CORD = y;
        if((x+y)%2 == 0){
            c = Color.BLACK;
        }else {
            c = Color.WHITE;
        }
        selected = false;
        listeners = new PropertyChangeSupport(this);
    }

    public void addListener(PropertyChangeListener l){
        listeners.addPropertyChangeListener(l);
        fireEvent();
    }

    private void fireEvent(){
        listeners.firePropertyChange(PROPERTY_NAME, null, this);
    }

    /**
     * adds a piece to the board. This method only used
     * during creation of the board
     * @param p
     */
    public void addPiece(Piece p){
        if(p != null)
            this.p = p;
    }

    /**
     * determines if this square has a piece
     *
     * @return true if there is already a piece on this square, false otherwise
     */
    public boolean hasPiece(){
        return p != null;
    }

    /**
     * move a piece from current square to
     * square, s
     *
     * @param s
     */
    public void movePiece(Square s){
        if(s.hasPiece()){
            s.removePiece();
        }
        s.addPiece(p);
        removePiece();

    }

    /**
     * removes current piece from the square
     * @return current piece on square
     */
    public Piece removePiece(){
        Piece temp = p;
        p = null;
        return temp;
    }

    public Piece getPiece(){
        return p;
    }

    public void clicked(){
        if(selected){
            selected = false;
        }else{
            selected = true;
        }
    }



}
