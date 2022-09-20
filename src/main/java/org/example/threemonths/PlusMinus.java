package org.example.threemonths;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class PlusMinus {

    public static void plusMinus(List<Integer> arr) {

        double pos = 0;
        double neg = 0;
        double zeros = 0;
        double total = arr.size();

        if(total > 0 && total <= 100){
            for(int i = 0; i < arr.size(); i++){
                if(arr.get(i)>=-100 || arr.get(i)<=100){
                    if(arr.get(i)<0){
                        neg++;
                    } else if (arr.get(i)==0){
                        zeros++;
                    } else {
                        pos++;
                    }
                } else { System.out.println("Follow the constraints"); }
            }
        } else {
            System.out.println("No numbers or too many numbers");
        }

        double plusF = (double)pos/(double)total;
        double minusF = (double)neg/(double)total;
        double zeroF = (double)zeros/(double)total;

        System.out.printf("%.6f\n", plusF);
        System.out.printf("%.6f\n", minusF);
        System.out.printf("%.6f\n", zeroF);
    }
}