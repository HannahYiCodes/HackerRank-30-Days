package org.example.testsolutions;

import java.util.List;

public class FlippingTheMatrix {
    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int matrixSize = matrix.size();
        int total = 0;

        for(int i = 0; i < matrixSize/2; i++) {
            for(int j = 0; j < matrixSize/2; j++) {
                int count = matrix.get(i).get(j);
                count = Integer.max(count, matrix.get(i).get(matrixSize - 1 - j));
                count = Integer.max(count, matrix.get(matrixSize - 1 - i).get(j));
                count = Integer.max(count, matrix.get(matrixSize - 1 - i).get(matrixSize - 1 - j));
                total += count;
            }
        }
        return total;
    }
}

