package org.example.notesthirtydays;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // This syntax creates a scanner object to read the input from stdin.
        Scanner sc = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable, userInput.
        String userInput = sc.nextLine();
        // Scanner Methods:
        // scan.next(); // returns the next token of input
        // scan.hasNext(); // returns true if there is another token of input (false otherwise)
        // scan.nextLine() // returns the next LINE of input
        // scan.hasNextLine; // returns true if there is another line of input

        // Close the scanner object, because we've finished reading the input from stdin.
        // You should always close it to avoid a resource leak.
        sc.close();

        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");
        System.out.println(userInput);
    }
}
