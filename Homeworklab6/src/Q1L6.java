package com.company;
import java.util.Scanner;

public class Q1L6 {
    private static Math math;

    public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
        System.out.println("Enter Initial Ivestment");
        double investment =in.nextDouble();
        System.out.println("Enter Rate as decimals :");
        double rate = in.nextDouble();
        System.out.println("Enter Future value :");
        double FutureValue=in.nextDouble();
        double years=0;
        double endValue= investment ;
        while (endValue < FutureValue){
            years++;
          endValue=investment  * math.pow((1+rate),years);
            if (investment * math.pow((1+rate),years) == FutureValue);

        }
        System.out.println("The number of year it to accumulate $" + FutureValue + "is "+years+"Years");
    }}
