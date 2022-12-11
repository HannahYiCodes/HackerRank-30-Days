package notesthirtydays.queuesstacks;
import java.io.*;
import java.util.*;

public class QueuesStacks {

    public class Solution {
        // Write your code here.

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            scan.close();

            // Convert input String to an array of characters:
            char[] s = input.toCharArray();

            // Create a Solution object:
            Solution p = new Solution();

            // Enqueue/Push all chars to their respective data structures:
            for (char c : s) {
                p.pushCharacter(c);
                p.enqueueCharacter(c);
            }

            // Pop/Dequeue the chars at the head of both data structures and compare them:
            boolean isPalindrome = true;
            for (int i = 0; i < s.length/2; i++) {
                if (p.popCharacter() != p.dequeueCharacter()) {
                    isPalindrome = false;
                    break;
                }
            }

            //Finally, print whether string s is palindrome or not.
            System.out.println( "The word, " + input + ", is "
                    + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
        }
    }
}

// ANOTHER SOLUTION
//    StringBuilder stackVar =  new StringBuilder();
//    int stackHead = -1;
//    StringBuilder queueVar = new StringBuilder();
//    int queueHead = 0;
//
//    void pushCharacter(char c){
//        stackHead++;
//        stackVar.append(c);
//    }
//
//    void enqueueCharacter(char c){
//        queueVar.append(c);
//    }
//
//    char popCharacter(){
//        return stackVar.charAt(stackHead--);
//    }
//
//    char dequeueCharacter(){
//        return queueVar.charAt(queueHead++);
//    }