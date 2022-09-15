package org.example.javadaily;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int i = 1; scan.hasNext(); i++)
            System.out.println(i + " " + scan.nextLine());
        scan.close();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
