package com.ps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // crating a scanner to get info from user
        Scanner scanner = new Scanner(System.in);
        // getting info from user for principal
        System.out.println("Enter the loan principal amount: ");
        // using double data type for decimal amounts
        double principal = scanner.nextDouble();

        System.out.println("Enter the annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.println("Enter the loan term (in years): ");
        int years = scanner.nextInt();

        // calculating monthly payments

        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberofPayments = years * 12;


        double factor = 1.0;
        for (int i = 0; i < numberofPayments; i++) {
            factor *= (1 + monthlyInterestRate);
        }
    // calculating monthly payment

    double monthlyPayment = principal * (monthlyInterestRate * factor) / (factor - 1);

        // calculating total interest
        double totalPayment = monthlyPayment * numberofPayments;
        double totalInterest = totalPayment - principal;

        // output to user

        System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);
        System.out.printf("Total Interest Paid: $%.2f%n", totalInterest);

        scanner.close();

    }
}