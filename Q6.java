import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        String s = "Hello";
        String t = "World";
        int z=s.length() + t.length();
         String A=s.substring(1,2);
         String c= s.substring(s.length() / 2, s.length());
        System.out.println(z);
        System.out.println(A);
        System.out.println(c);
        System.out.println(s+t);
        System.out.println(t+s);
    }
}
