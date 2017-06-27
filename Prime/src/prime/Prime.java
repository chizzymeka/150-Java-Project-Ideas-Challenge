/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

import java.util.Scanner;

/**
 *
 * @author Chizzy Meka | 16036630 | MSc. Computing
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    private static int exponent;
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter a positive whole number: ");
        int input = scan.nextInt();
        printPrimeFactors(input);
    }

    public static void printPrimeFactors(int userInput) {
        if (userInput > 2 && userInput < Integer.MAX_VALUE) {
            for (int factor = 2; factor <= userInput; factor++) {

                exponent = 0;

                while (userInput % factor == 0) {
                    userInput = userInput / factor;
                    exponent++;
                }

                if (exponent > 0) {
                    System.out.print(factor + "**" + exponent);
                }
            }
        } else {
            System.out.println("Invalid number! Please try again.");
        }
    }
}
