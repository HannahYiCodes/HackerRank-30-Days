import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class TwoDArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        //  {
        // {1,2,3,4,5},
        // {1,2,3,4,5},
        // {1,2,3,4,5},
        // {1,2,3,4,5},
        // {1,2,3,4,5},
        // {1,2,3,4,5},
        // }
        int a,b,c,d,e,f,g;
        int maxSum=-100;
        int sum;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                a=arr.get(i).get(j);
                b=arr.get(i).get(j+1);
                c=arr.get(i).get(j+2);
                d=arr.get(i+1).get(j+1);
                e=arr.get(i+2).get(j);
                f=arr.get(i+2).get(j+1);
                g=arr.get(i+2).get(j+2);
                sum=a+b+c+d+e+f+g;
                if(maxSum<sum) maxSum=sum;
            }
        }
        System.out.println(maxSum);
        bufferedReader.close();
    }
}