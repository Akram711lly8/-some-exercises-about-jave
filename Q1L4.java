import java.awt.*;

public class Q1L4 {


    public static void main(String[] args) {

        Rectangle box=new Rectangle(500,400);

        box.getWidth();
        box.getHeight();
        double rec=box.getHeight()*box.getWidth();
        System.out.println(box.getHeight());
        System.out.println("expected answer 400");
        System.out.println(box.getWidth());
        System.out.println("ecpected answer 500");
        System.out.println(rec);
        System.out.println("expect answer 200.000");

    }
}
