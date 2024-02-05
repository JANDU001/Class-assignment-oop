/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.motorvehicleprofit;

import java.util.Scanner;

/**
 *
 * @author chery
 */
public class MotorVehicleProfit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input amount
        System.out.print("Enter the buying price of the motor vehicle: ");
        double buyingPrice = scanner.nextDouble();

        System.out.print("Enter the selling price of the motor vehicle: ");
        double sellingPrice = scanner.nextDouble();

        // Calculate the profit for selling motor vehicles
            double profit = sellingPrice - buyingPrice;
            // Display the output
            System.out.println("Buying Price: $" + buyingPrice);
            System.out.println("Selling Price: $" + sellingPrice);
            System.out.println("Profit: $" + profit);
         
        }
}
