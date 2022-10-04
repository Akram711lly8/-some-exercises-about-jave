import java.util.Scanner;

public class Q5L6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word please :");
        String word = in.next();
        word = word.toLowerCase();

        for (int i =0; i<word.length();i++){
            if (word.charAt(i)=='a'||word.charAt(i)=='e' || word.charAt(i)=='i'||word.charAt(i)=='o'|| word.charAt(i)=='u'){
                int s = 0;
                s++;
                System.out.println(word.charAt(i));
            }


        }

        }
}
