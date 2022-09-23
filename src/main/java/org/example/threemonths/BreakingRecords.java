package org.example.threemonths;

import java.util.ArrayList;
import java.util.List;

class BreakingRecords {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        List<Integer> array = new ArrayList<Integer>();
        array.add(0);
        array.add(0);

        if (scores.size() == 1) {
            return array;
        }

        int minScore = scores.get(0);
        int maxScore = scores.get(0);
        int minRecord = 0;
        int maxRecord = 0;

        for (int i=0; i<scores.size(); i++) {
            if (scores.get(i) > maxScore) {
                maxScore = scores.get(i);
                maxRecord++;
            }
            else if (scores.get(i) < minScore) {
                minScore = scores.get(i);
                minRecord++;
            }
        }

        array.set(0, maxRecord);
        array.set(1, minRecord);
        return array;
    }

}