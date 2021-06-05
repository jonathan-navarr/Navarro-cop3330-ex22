package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Navarro
 */
public class ComparingNumbers {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter the first number: ");
        num1 = scnr.nextInt();
        System.out.print("Enter the second number: ");
        num2 = scnr.nextInt();
        System.out.print("Enter the third number: ");
        num3 = scnr.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.print("The largest number is " + num1);
        }
        else if(num2 > num1 && num2 > num3){
            System.out.print("The largest number is " + num2);
        }
        else{
            System.out.print("The largest number is " + num3);
        }
    }
}
