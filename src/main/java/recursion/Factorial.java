package recursion;

public class Factorial {
    static int factorial(int n) {
        // base case
        if (n<=1) {
            return n;

        } // recursive case
            return n * factorial(n-1);
        }

    public static void main(String[] args) {
        System.out.println(factorial(7));
    }
}
