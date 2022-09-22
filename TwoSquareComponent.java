import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.GradientPaint;
public class TwoSquareComponent  extends JComponent {

    public void paint(Graphics g) {
        super.paint(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.PINK);
        g.fill3DRect(50,50,50,50,true);




        g.setColor(Color.cyan);
        g.fill3DRect(10,15,50,50,true);


    }}

