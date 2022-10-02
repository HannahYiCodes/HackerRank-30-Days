package org.example.threemonths;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SparseArrays {

        /*
         * Complete the 'matchingStrings' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts following parameters:
         *  1. STRING_ARRAY strings
         *  2. STRING_ARRAY queries
         */

        public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
            // Write your code here
            List<Integer> result = new ArrayList<>();
            for (String query : queries) {
                int occur = strings.stream().filter(string -> string.equals(query)).collect(Collectors.toList()).size();
                result.add(occur);
            }
            return result;
        }
}
