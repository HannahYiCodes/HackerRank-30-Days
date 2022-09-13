package org.example.javadaily;
import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");

        for(int i=0;i<3;i++)
        {
            String s1 = sc.next();
            int x = sc.nextInt();
            String xs = "" + x;

            while(xs.length() < 3)
            {
                xs = "0" + xs;
            }

            while(s1.length() < 15)
            {
                s1 = s1 + " ";
            }

            System.out.print(s1);
            System.out.print(xs);
            System.out.println();
        }
        System.out.println("================================");

    }
}
