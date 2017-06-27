/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package next.prime.number;

import java.util.Scanner;

/**
 *
 * @author Chizzy Meka | 16036630 | MSc. Computing
 */
public class NextPrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter any positive number");
            try {
                int number = scan.nextInt();

                // mechanism for ending the checks
                int endCheck = number;
                if (endCheck == 0) {
                    System.out.println("Good bye!");
                    break;
                }

                // initialise a counter
                int count = 0;

                // iterate from 1 through to the entered number
                for (int i = 1; i < number + 1; i++) {
                    //check the modulus of the entered number and the iterated numbers along the way and increase counter by one if each time the modulus equals zero
                    if (number % i == 0) {
                        count++;
                    }
                }

                // if count equals 2 at the endCheck of the iteration, the the entered number must be a prime number because the value 2 would have come from the number been divded by one and itself
                if (count == 2) {
                    System.out.println(number + " is a prime number");
                    // if the count value is anything else, then the number cannot be a prime number
                } else {
                    System.out.println(number + " is not a prime number");
                }
            } catch (Exception e) {
                System.out.println("Please ensure you input a positive number");
            }
        } while (true);
    }
}
