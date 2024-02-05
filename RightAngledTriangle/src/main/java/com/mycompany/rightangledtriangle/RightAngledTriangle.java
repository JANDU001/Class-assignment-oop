/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rightangledtriangle;

/**
 *
 * @author chery
 */
public class RightAngledTriangle {

    public static void main(String[] args) {
       //initialize variables
       int base=10,height=7,hypotenuse=12;
       
       //calculate area and perimeter
       double area = 0.5 * base*height;
       double perimeter = base + height + hypotenuse;
       
       //display output
       System.out.println("The area of the triangle is "+area);
       System.out.println("The perimeter of the triangle is "+perimeter);
    }
}
