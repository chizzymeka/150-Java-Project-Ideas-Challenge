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

        System.out.println("Please enter the amount you wish to borrow (£)");
        double borrowAmount = scan.nextDouble();

        System.out.println("Please enter the length of the mortgage");
        double mortgageLength = scan.nextDouble();
        double period = mortgageLength * 12;

        System.out.println("Please enter the interest rate (%)");
        double interestRate = scan.nextDouble();
        double rate = (interestRate / 100) / 12;

        System.out.println("Your monthly payments will be £" + borrowAmount * (rate / (1 - Math.pow((1 + rate), -period))));
    }

}


//Mortgage formula reference: http://www.mortgagesexposed.com/Book_Contents/Other_Formula.htm
