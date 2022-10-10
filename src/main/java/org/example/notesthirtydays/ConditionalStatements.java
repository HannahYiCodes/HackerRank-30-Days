package org.example.notesthirtydays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionalStatements {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if (N%2 == 1){
            System.out.println("Weird");
        }
        else{
            if ((N>=2 && N<=5) || N>20){
                System.out.println("Not Weird");
            }

            if(N>=6 && N<=20){
                System.out.println("Weird");
            }
        }
        bufferedReader.close();
    }
}
