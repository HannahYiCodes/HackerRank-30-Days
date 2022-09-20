package org.example.thirtydays;

import java.util.*;

public class DataType1 {
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            double d = sc.nextDouble();
            String s = "HackerRank";

            int i_2 = sc.nextInt();
            double d_2 = sc.nextDouble();
            sc.nextLine();
            String s_2 = sc.nextLine();

            System.out.println( i + i_2);
            System.out.println(d + d_2);
            System.out.println(s + s_2);
    }
}