import java.util.Scanner;

public class Q4L6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word please :");
        String word = in.next();
        for (int i = word.length() -1;i>=0;i-- ){
            System.out.println(word.charAt(i));
        }

    }
}
