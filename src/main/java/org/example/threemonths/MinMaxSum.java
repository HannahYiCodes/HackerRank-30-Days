package org.example.threemonths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MinMaxSum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void main(List<Integer> arr) {
        // Write your code here
        ArrayList<Long> array = new ArrayList<Long>();

        long sum = 0;

        for (int i=0; i < arr.size(); i++) {
            sum = arr.get(i) + sum;
        }
        int num = 0;
        for(int i=0; i<arr.size(); i++) {
            long sub = arr.get(num++);
            long calc = sum - sub;
            array.add(calc);
        }
        Collections.sort(array);
        long min = Collections.min(array);
        long max = Collections.max(array);
        System.out.println(min + " " + max);
    }
}
