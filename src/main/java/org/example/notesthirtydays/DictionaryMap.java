package org.example.notesthirtydays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryMap {
    public static void main(String []argh){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // Write code here
        Map<String,Integer> myMap = new HashMap<String,Integer>();

        for(int i = 0; i < n; i++){
            String name = scan.next();
            int phone = scan.nextInt();
            // Write code here
            myMap.put(name, phone);
        }
        while(scan.hasNext()){
            String s = scan.next();
            // Write code here
            if(myMap.get(s)==null)
            {
                System.out.println("Not found");
            }
            else
            {
                System.out.println(s+"="+myMap.get(s));
            }
        }
        scan.close();
    }
}
