package org.example.notesthirtydays;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Create a scanner object to read the input from stdin.
        Scanner sc = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable, userInput.
        String userInput = sc.nextLine();

        // Close the scanner object, because we've finished reading the input from stdin.
        sc.close();

        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");
        System.out.println(userInput);
    }
}
