package notesthirtydays.scope;
import java.util.Scanner;

public class Scope {
    static class Difference {
        private int[] _elements;
        public int maximumDifference;

        Difference(int[] _elements) {
            this._elements = _elements;
        }

        public void computeDifference() {
            for (int index1 = 0; index1 < _elements.length; index1++) {
                for (int index2 = index1 + 1; index2 < _elements.length; index2++) {
                    int absoluteValue = Math.abs(_elements[index1] - _elements[index2]);
                    if (maximumDifference < absoluteValue) {
                        maximumDifference = absoluteValue;
                    }
                }
            }
            System.out.println(maximumDifference);
        }

    }

    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            scanner.nextLine();
            int[] _elements = new int[N];
            for(int index = 0; index < _elements.length; index++) {
                _elements[index] = scanner.nextInt();
            }
            Difference difference = new Difference(_elements);
            difference.computeDifference();
        }
    }
}
