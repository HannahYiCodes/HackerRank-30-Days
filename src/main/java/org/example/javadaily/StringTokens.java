package org.example.javadaily;

import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        scan.close();

        String string[] = n.split("[!,?._'@ ]+");
        System.out.println(string.length);

        for(int i=0;i<string.length;i++){
            System.out.println(string[i]);
        }
    }
}

