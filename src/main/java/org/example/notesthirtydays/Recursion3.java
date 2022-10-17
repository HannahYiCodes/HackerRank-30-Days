package org.example.notesthirtydays;

import javax.xml.transform.Result;
import java.awt.print.Book;
import java.io.*;
import java.util.Scanner;

public class Recursion3 {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
