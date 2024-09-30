package com.ps;
import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // getting user information
        //using double data type for decimal numbers
        System.out.println("Enter the deposit amount: ");
        double principal = scanner.nextDouble();

        System.out.println("enter the annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.println("Enter the number of years: ");
        int years = scanner.nextInt();

        //calculating future value

        double futureValue = calculatorFutureValue(principal, annualInterestRate, years);
        double totalInterest = futureValue - principal;

        //displaying results to end user
        //using print && format

        System.out.printf("Future Value: $%.2f%n", futureValue);
        System.out.printf("Total Interest Earned: $%.2f%n", totalInterest);

        scanner.close();
    }
    //method to calculate future values
    public static double calculatorFutureValue(double principal, double annualInterestRate, int years) {

        int daysInYear = 365;
        double dailyInterestRate = annualInterestRate / 100 / daysInYear;

        int totalDays = years * daysInYear;

        double futureValue = principal;

        //daily interest rate
        for (int day = 0; day < totalDays; day++) {
            futureValue += futureValue * dailyInterestRate;
        }
        return futureValue;
    }
}
