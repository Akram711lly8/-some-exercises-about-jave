import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The length of rectangle => ");
        int len= input.nextInt();
        System.out.println(" Enter The width of rectangle ");
        int wid=input.nextInt();
        int area=len*wid;
        System.out.println("The area of Rectangle is ->" +area);
    }
}
