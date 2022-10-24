package notesthirtydays.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        for(int i=1;i<=10;i++){
            int result;
            result= n*i;
            System.out.println(n+" "+"x"+" "+i+" "+"="+" "+result);
        }
        bufferedReader.close();
    }
}
