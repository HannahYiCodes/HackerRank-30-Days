package org.example.notesthirtydays;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int i_2 = scan.nextInt();
        double d_2 = scan.nextDouble();
        scan.nextLine();
        String s_2 = scan.nextLine();

        System.out.println(i + i_2);
        System.out.println(d + d_2);
        System.out.println(s + s_2);
        scan.close();
    }
}
