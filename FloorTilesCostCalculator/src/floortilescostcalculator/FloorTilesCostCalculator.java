/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floortilescostcalculator;

import java.util.Scanner;

/**
 *
 * @author Chizzy Meka | 16036630 | MSc. Computing
 */
public class FloorTilesCostCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How much does one of the tiles cost in £?");
        double costPerTile = scan.nextDouble();

        System.out.println("What is the width of the tile in cm?");
        double tileWidth = scan.nextDouble();

        System.out.println("What is the length of the tile in cm?");
        double tileLength = scan.nextDouble();

        System.out.println("What is the width of the floor in cm?");
        double floorWidth = scan.nextDouble();

        System.out.println("What is the length of the floor in cm?");
        double floorLength = scan.nextDouble();

        double totalTilingCost = (((floorWidth * floorLength) / (tileWidth * tileLength)) * costPerTile);

        System.out.println("It would cost £" + (Math.round(totalTilingCost * 100)/100) + " to tile a floor of that dimension");
    }
}
