/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpassignment;

import java.util.Scanner;

/**
 *
 * @219296219Tim Davids
 */
public class Calculators {
     public static void main(String args[]){
         int num1;
         int num2;
         try (Scanner sc = new Scanner(System.in)
         // create scanner object
         ) {
             System.out.print("Enter the first number: ");
             num1 = sc.nextInt();
//this method reads value for num1 providing by user
System.out.print("Enter the second number: ");
             num2 = sc.nextInt();
//this method reads value for num2 providing by user
             //closing the scanner class
         }
sumNum(num1,num2); //calling the method
}
//sum method
      public static void sumNum(int num1,int num2){
       int sum=0;
       sum = num1+num2;
       System.out.println("Sum of two numbers  "+sum);
}
}

