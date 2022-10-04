import java.util.Scanner;

public class Q2L6 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i<=100; i++) {

            if (i %2==0) {

                System.out.println(i);

                sum +=i;
            }
        }
        System.out.println("Sum of even numbers between 2 to 100 is     ");
        System.out.println(    +sum);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number , a:");
        int numa = in.nextInt();
        int a=numa;
        System.out.println("Enter number , b:");

        int numb = in.nextInt();
        int b=numb;
        int oddSum = 0;


        while (numa <= numb) {
            if ((numa % 2) > 0) {
                oddSum += numa;
            }
            numa++;
        }
        System.out.println("The sum of all odd numbers between "    + numa+   "  and  " + numb+ "   is "    + oddSum);

      Scanner input=new Scanner(System.in);
        int number ,digit,sum1=0;
        System.out.println("Enter Number A:");
       number=input.nextInt();

        System.out.println("Enter Number digit:");
     digit=in.nextInt();

      while (number>0){
          digit=number %10;
          if (digit%2==1)
              sum1+=digit;
          number/=10;
      }
        System.out.println(sum1);





    }

}




