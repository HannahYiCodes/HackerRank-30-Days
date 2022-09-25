package org.example.javadaily;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String A=scan.next();


        int length = A.length();
        String reverse = "";

        for (int i = length-1; i >= 0; i--) {

            reverse += A.charAt(i);

        }


        if(A.equals(reverse)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
