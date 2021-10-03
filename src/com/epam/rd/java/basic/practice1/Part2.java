package com.epam.rd.java.basic.practice1;

import java.util.Scanner;

//Write a class that implements functionality of addition of numbers passed to the application as the command line parameters.


public class Part2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the total quantity of numbers that you want to add: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input your number: ");
            int a = in.nextInt();
            arr[i] = a++;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum= " + sum);

    }

}
