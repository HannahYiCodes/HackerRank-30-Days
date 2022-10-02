package org.example.threemonths;

import java.util.List;

class LonelyInteger {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int theLonelyInteger(List<Integer> a) {
        // Write your code here
        int loneInt = a.get(0);
        for(int i=1; i < a.size();i++) {
            loneInt = loneInt ^ a.get(i);
        }
        return loneInt;

    }

}
