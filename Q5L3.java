import java.util.Scanner;

public class Q5L3 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.printf("Enter nmuber 1 :");
        int num1 = input.nextInt();
        System.out.printf("Enter nmuber 2 :");
        int num2 = input.nextInt();
        System.out.printf("Enter nmuber 3 :");
        int num3 = input.nextInt();

        if (num1 == num2 & num2 == num3) {

            System.out.print(num1);
            System.out.print(" \t" + num2);
            System.out.print(" \t" + num3);


        }
        if (num1 == num2 & num1 != num3) {
            System.out.print(num1);
            System.out.print(" \t" + num2);
        }
        if (num1 != num2 & num2 == num3) {
            System.out.print(" \t" + num2);
            System.out.print(" \t" + num3);
        }

          if (num1 != num2 & num2 != num3)
          {
                System.out.println("Neither");

        }








    }














}
