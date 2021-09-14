package org.example;

import java.text.NumberFormat;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexandra Ramlogan
 */
public class App 
{
    public static void main( String[] args )
    {
        //objective : calculate tac
        Scanner scan = new Scanner(System.in);
        double subtotal, total, tax = 5.5/100;
        String state;
        String compare = "WI";
        NumberFormat round = NumberFormat.getCurrencyInstance();

        System.out.print("What is the order amount? ");
        subtotal = scan.nextDouble();
        System.out.print("What is the state? ");
        state = scan.next();
        if (state.compareTo(compare) == 0)
        {
            System.out.println("The subtotal is " +round.format(subtotal));
            tax = tax * subtotal;
            System.out.println("The tax is " +round.format(tax));
            total = tax + subtotal;
            System.out.println("The total is " +round.format(total));
            System.exit(0);
        }
        System.out.println("The total is " +round.format(subtotal));

    }
}
