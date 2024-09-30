package com.ps;
import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args){
        Scanner scanner = new scanner(System.in);

        // getting user information
        //using double data type for decimal numbers
        System.out.println("Enter the deposit amount: ");
        double principal = scanner.nextDouble();

        System.out.println("enter the annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.println("Enter the number of years: ");
        int years = Scanner.nextInt();

        //calculating future value

        double futureValue = calculatorFutureValue(principal, annualInterestRate, years);
        double totalInterest = futureValue - principal;

        //displaying results to end user




    }
}
