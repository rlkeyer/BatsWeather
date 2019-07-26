package com.company;

import java.util.Scanner;

public class DisplayMenu {
    public static int DisplayMenu() {
        //Display a menu for the user and capture the user's input for later use
        System.out.println("----------------------------");
        System.out.println("Louisville Bats weather data");
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("1. View Louisville Bats games with average weather");
        System.out.println("2. Exit");
        System.out.println();

        System.out.print("Enter your choice: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        return input;
    }
}
