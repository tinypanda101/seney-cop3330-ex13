/*
 *   UCF COP 3330 Summer 2021 Assignment 1 Solution
 *   Copyright 2021 Ryan Seney
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DeterminingCompoundInterest {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial amount: ");
        int initial = scanner.nextInt();

        System.out.print("Enter the rate of interest in percentage: ");
        double ratePercentage = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int year = scanner.nextInt();

        System.out.print("Enter the number of times the interest is compounded per year: ");
        int periodsPerYear = scanner.nextInt();

        double rateDecimal = ratePercentage / 100;

        double finalAmount = calculation(initial, rateDecimal, periodsPerYear, year);

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println("$" + initial + " invested at " + ratePercentage + "% for " + year + " years compounded " + periodsPerYear +
                " times per year is $" + df.format(finalAmount));

    }

    public static double calculation(int initial, double rateDecimal, int periodsPerYear, int year){
        double finalAmount;
        double step1;
        double step2;
        double step3;
        step1 = (1 + (rateDecimal / periodsPerYear));

        step2 = (periodsPerYear * year);

        step3 = Math.pow(step1, step2);

        finalAmount = initial * step3;

      return finalAmount;
    }
}
