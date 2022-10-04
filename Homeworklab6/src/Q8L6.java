import java.util.Scanner;

public class Q8L6 {
     public static void main(String[] args) {
          System.out.println(" Enter an antger number :");
          Scanner in = new Scanner(System.in);
          int limit = in.nextInt();

          System.out.println("printing prime  number :" + limit);
          for (int i=2; i<=limit; i++){
               if (isPrime(i)){
                    System.out.println(i);
               }
          }


     }
     public static boolean isPrime(int number){
          for (int i = 2; i*i <=number ; i++){
               if (number % i ==0){
                    return false;
               }
          }
          return true;
     }


}










