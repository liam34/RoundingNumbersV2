package com.javaClass.Assignment;

import java.util.Scanner;

public class RoundingNumbersV2 {
    public static void main(String[] args) {
        double x;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter A Number: ");
        x = keyboard.nextDouble();

        System.out.println("Input Number: " + x + " Round: "
                +String.valueOf(Math.round(x + .5)));

        System.exit(0);
    }
}
