package org.example.notesthirtydays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryMap {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> nPhone = new HashMap<String,Integer>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            nPhone.put(name, phone);// Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(nPhone.get(s)==null)
            {
                System.out.println("Not found");
            }
            else
            {
                System.out.println(s+"="+nPhone.get(s));
            }
        }
        in.close();
    }
}
