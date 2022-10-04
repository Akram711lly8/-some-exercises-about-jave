import java.util.Scanner;

public class Q7L6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter Decimal number : ");
        int decimal = in.nextInt();

        String binaryString = "";
        int value = decimal;

        while (value!=0) {



            binaryString = value % 2+ binaryString;
            value = value/2;

        }

        System.out.println(decimal+ " s binary represention is  "  );
        System.out.println(binaryString );


    }
}
