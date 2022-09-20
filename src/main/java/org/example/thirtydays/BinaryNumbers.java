package org.example.thirtydays;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BinaryNumbers {
    public static void formula(int n){
        String binaryCode = Integer.toBinaryString(n);
        int totalCount = 0;
        int maxiumCount= 0;
        for (int i = 0; i < binaryCode.length(); i++) {
            char character = binaryCode.charAt(i);
            if (character == '1'){
                totalCount++;
                if (maxiumCount < totalCount)
                    maxiumCount = totalCount;
            } else {
                totalCount = 0;
            }
        }
        System.out.println(maxiumCount);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        formula(n);
        bufferedReader.close();
    }
}
