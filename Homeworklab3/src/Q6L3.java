import java.util.Scanner;

public class Q6L3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,y,a;
        System.out.print("Enter the first number:");
        x=in.nextInt();
        System.out.print("Enter the second number:");
        y=in.nextInt();
        System.out.print("Enter the third number:");
        a=in.nextInt();
        if (x<y && x<a)
            System.out.println("Increasing");
        else if (x>y && x>a )
            System.out.println("Decreasing");
         else if (x<y || x>a || a<y || y<a)
            System.out.println("Neither");}
}
