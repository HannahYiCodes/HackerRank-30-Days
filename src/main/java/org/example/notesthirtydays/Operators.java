package org.example.notesthirtydays;

// 3
class Operators {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void main(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double total = (meal_cost/100 * tip_percent) + ((double)tax_percent/100 * meal_cost) + meal_cost;
        System.out.println(Math.round(total));

    }

}
