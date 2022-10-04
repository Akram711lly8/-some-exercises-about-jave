import java.util.Scanner;

public class Ouestions1 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int digit;
        String number;
        System.out.println("enter number :");
        digit = in.nextInt();
        switch (digit)
        {
            case 1:
                number = "Лривет Как Дела ";
                break;
            case 2:
                number = "Hello How are yo";
            break;
            case 3:
                number = " هلا كيف الحال" ;
            break;
            default:
                number = "number is " + digit;

        }
        System.out.print(number);


    }


}
