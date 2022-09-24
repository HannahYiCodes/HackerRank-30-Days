package org.example.threemonths;

import java.util.Scanner;

public class CamelCase4 {
    Scanner scan = new Scanner(System.in);
    String userInput = scan.nextLine();
    String userInput_arr[];

    while (true) {
        if (userInput.charAt(0)=='S') {
            userInput_arr = userInput.substring(4).replaceAll("[^A-Za-z]","").split("(?=\\p{Upper})");
            System.out.print(userInput_arr[0].toLowerCase());
            for (int i = 1; i < userInput_arr.length; ++i) {
                System.out.print(" " + userInput_arr[i].toLowerCase());
            }
            System.out.println();
        }
        else {
            userInput_arr = userInput.substring(4).split(" ");
            if (userInput.charAt(2) == 'V') {
                System.out.print(userInput_arr[0]);

                for (int i = 1; i < userInput_arr.length; ++i) {
                    System.out.print(userInput_arr[i].substring(0,1).toUpperCase() + userInput_arr[i].substring(1));
                }
                System.out.println();
            }
            else if (userInput.charAt(2) == 'C') {
                for (int i = 0; i < userInput_arr.length; ++i) {
                    System.out.print(userInput_arr[i].substring(0,1).toUpperCase() + userInput_arr[i].substring(1));
                }
                System.out.println();
            }
            else {
                System.out.print(userInput_arr[0]);
                for (int i = 1; i < userInput_arr.length; ++i) {
                    System.out.print(userInput_arr[i].substring(0,1).toUpperCase() + userInput_arr[i].substring(1));
                }
                System.out.println("()");
            }
        }
        if (!scan.hasNextLine()) break;
        userInput = scan.nextLine();
    }
}
