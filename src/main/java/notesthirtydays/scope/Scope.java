package notesthirtydays.scope;
import java.util.Scanner;

public class Scope {
    class Difference {
        private int[] elements;
        public int maximumDifference;

        // Add your code here
        public Difference(int[] a){
            this.elements = a;
            maximumDifference = 0;
        }

        public void computeDifference(){
            int minNumber = elements[0];
            int maxNumber = elements[0];
            for(int x = 0; x < elements.length; x++){
                maxNumber = (elements[x] > maxNumber) ? elements[x] : maxNumber;
                minNumber = (elements[x] < minNumber) ? elements[x] : minNumber;
            }
            maximumDifference = maxNumber-minNumber;
        }

    } // End of Difference class

    public class Solution {

        public void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            sc.close();

            Difference difference = new Difference(a);

            difference.computeDifference();

            System.out.print(difference.maximumDifference);
        }
    }
