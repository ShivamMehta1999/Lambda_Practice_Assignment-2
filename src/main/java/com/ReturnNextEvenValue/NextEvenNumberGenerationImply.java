package com.ReturnNextEvenValue;

import java.util.Scanner;
// public class Created as implementing NextEvenNumberT
public class NextEvenNumberGenerationImply {

    public static void main(String[] args) {

        // Lambda Expression to Return next even value.
        com.ReturnNextEvenValue.NextEvenNumberInterface lambda= num-> (num%2!=0) ? num+1:num+2 ;
        Scanner scanner = new Scanner(System.in);

        // Enter Input to perform above Lambda Function
        System.out.println("\n Enter integer value :");
        long number = (long) Double.parseDouble(scanner.next());

        // result show :
        System.out.println("\n Value of next even number entered is:");
        System.out.println(lambda.nextEven(number));
    }
}
