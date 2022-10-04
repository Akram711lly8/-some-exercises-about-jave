import java.util.Scanner;

public class Q3L6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word please :");
        String word = in.next();
        for (int i = 0; i <word .length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}
