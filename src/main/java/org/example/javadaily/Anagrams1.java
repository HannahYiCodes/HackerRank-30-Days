package org.example.javadaily;

import java.io.*;
import java.util.*;

public class Anagrams1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean check = isAnagram(a, b);
        System.out.println((check) ? "Anagrams" : "Not Anagrams");
    }

    public static boolean isAnagram(String a, String b) {
        String aArray = a.toLowerCase();
        String bArray = b.toLowerCase();

        if (aArray.length()!=bArray.length()) {
            return false;
        }

        char a1[] = aArray.toCharArray();
        char b1[] = bArray.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        return Arrays.equals(a1,b1);
    }
}

