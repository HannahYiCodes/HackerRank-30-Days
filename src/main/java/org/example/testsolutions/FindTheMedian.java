package org.example.testsolutions;

import java.util.Collections;
import java.util.List;

//redo without collections
public class FindTheMedian {
    public static double findMedian(List<Integer> arr)
    {
        Collections.sort(arr);
        int a= (0+arr.size()-1)/2;
        return arr.get(a);
    }
}
