/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mortgage.calculator;

import java.util.Scanner;

/**
 *
 * @author Chizzy Meka | 16036630 | MSc. Computing
 */
public class MortgageCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Obtain the borrow amount
        System.out.println("Please enter the amount you wish to borrow (£)");
        double borrowAmount = 0;
        try {
            borrowAmount = scan.nextDouble();
        } catch (Exception e) {
            System.out.println("Please ensure you enter a positive value");
            return;
        }
        if (borrowAmount < 5000) {
            System.out.println("The borrow amount is too low");
        }
        if (borrowAmount < 1) {
            System.out.println("The borrow amount cannot be negative");
        }

        // Obtain the length of the mortgage
        System.out.println("Please enter the length of the mortgage (years)");
        double mortgageLength = 0;
        try {
            mortgageLength = scan.nextDouble();
        } catch (Exception e) {
            System.out.println("Please ensure you enter a positive value");
            return;
        }
        if (mortgageLength > 35) {
            System.out.println("The mortgage length is too long");
        }
        if (mortgageLength < 1) {
            System.out.println("The mortgage length cannot be negative");
        }
        double period = mortgageLength * 12;

        // Obtain the interest rate
        System.out.println("Please enter the interest rate (%)");
        double interestRate = 0;
        try {
            interestRate = scan.nextDouble();
        } catch (Exception e) {
            System.out.println("Please ensure you enter a positive value");
            return;
        }
        if (interestRate < 1) {
            System.out.println("The interest rate cannot be negative");
        } else if (interestRate > 100) {
            System.out.println("The interest rate cannot be above 100%");
        }
        double rate = (interestRate / 100) / 12;

        System.out.println("Your monthly payments will be £" + borrowAmount * (rate / (1 - Math.pow((1 + rate), -period))));
    }

}


//Mortgage formula reference: http://www.mortgagesexposed.com/Book_Contents/Other_Formula.htm
