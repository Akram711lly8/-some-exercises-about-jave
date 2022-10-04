import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class Q9L6 {
    private int size;
    public  Q9L6 (int s){
        size =s;
    }
    public void draw(Graphics2D g2) {
        int xleft;
        int ytop;
        int row;
        int col;
        for (row = 0; row < 8; row++) {
            for (col = 0; col < 8; col++) {
                xleft = col * 20;
                ytop = row * 20;
                if ((row % 2) == (col % 2))
                    g2.setColor(Color.white);
                else
                    g2.setColor(Color.black);
                g2.fillRect(xleft, ytop, 20, 20);

            }
        }
    }
}
