import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        String x= "water";
        String y="tea";
        String temp;
        temp=x;
        x=y;
        y=temp;

        System.out.println("x =>"+x);
        System.out.println("y =>" +y);
    }
}
