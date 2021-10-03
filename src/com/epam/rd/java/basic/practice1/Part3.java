package com.epam.rd.java.basic.practice1;


import java.util.Objects;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.substring;


//Write a class that implements functionality
// of displaying of the command line parameters in console (display using a space between them), the result should not end with a space.

public class Part3 {

    public static void main(String[] args) {
        System.out.println("To stop inputting the values please enter '!' char");
        String value;
        StringBuilder string = new StringBuilder();

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Input the value: ");
            value = in.next();
            string.append(" ").append(value);
        }
        while (!Objects.equals(value, "!"));

        String newstring = string.substring(0, string.length() - 2);
        System.out.println("Result:");
        System.out.println(newstring.trim());

    }
}
