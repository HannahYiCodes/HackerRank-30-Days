package org.example.algorithms;

import java.util.List;

public class SimpleArraySum1 {
    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        Integer a=0;
        for (Integer i=0; i<ar.size(); i++) {
            a += ar.get(i);
        }
        return a;
    }
}