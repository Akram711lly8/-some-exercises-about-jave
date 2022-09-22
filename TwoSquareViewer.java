import javax.swing.*;
import  java.awt.*;
public class TwoSquareViewer {

    public static void main(String[] args) {


        JFrame f=new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        TwoSquareComponent  p = new TwoSquareComponent();

        f.add(p);
        f.setVisible(true);
    }
}
