package org.example.notesthirtydays;

import javax.xml.transform.Result;
import java.awt.print.Book;
import java.io.*;
import java.util.Scanner;

public class Recursion3 {
    abstract class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
