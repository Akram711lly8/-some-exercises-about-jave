import java.util.Scanner;

public class Q1 {




            public static void main(String[] args) {
            double cel,fah;
            Scanner in = new Scanner(System.in);
            System.out.println("input weather");
            fah = in.nextDouble();
            cel = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
            System.out.println(cel);
        }


}
