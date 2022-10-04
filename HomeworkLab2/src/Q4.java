import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int num1,num2,num3;
       final double AV;
        int ip;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three number : 1 plaeas :");
        num1 = input.nextInt();
        System.out.println("Enter number : 2");
        num2 = input.nextInt();
        System.out.println("Enter number : 3");
        num3 =input.nextInt();
    ;
        AV = (double) (num1+num2+num3)/3;
        ip = (num1*num2*num3);
        System.out.println("Average ="+AV);
        System.out.println("multiplication ="+ip);
    }
}
