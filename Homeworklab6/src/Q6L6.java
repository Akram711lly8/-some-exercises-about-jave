import java.util.Scanner;

public class Q6L6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int base;
        int numpower;
        System.out.println("Enter number baes :");
        base=in.nextInt();
        System.out.println("Enter the number of numpower :");
        numpower=in.nextInt();
        in.close();
        double val;
        for (int i =0; i<numpower; i++)
        {
            val = Math.pow(base,i);
            System.out.println(base+ "^" +i+ "=" +val);
        }

    }
}
