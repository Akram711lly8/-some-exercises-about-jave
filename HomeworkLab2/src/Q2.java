import java.util.Scanner;

public class Q2 {
    public static void main(String[] args)
    {

        float radius;
        double area , circum;
        System.out.println("enter radius plaese :");
        Scanner user_input =new Scanner(System.in);
        radius = user_input.nextFloat(); 
        area= (double)  3.14*radius*radius;
        circum=(double) 3.14*2*radius;
        System.out.println(" area circle is :" +area);
        System.out.println(" circumference of circle is :" +circum);





    }







}
