package org.example.threemonths;

class TimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        int hour = Integer.parseInt(s.substring(0, 2));
        char x = s.charAt(s.length()-2);
        String ans = "";

        if (Character.toLowerCase(x) == 'p') {
            hour = hour += 12;
            String newHour = String.valueOf(hour);
            ans = (newHour + s.substring(2, s.length()));
        } else if ((Character.toLowerCase(x) == 'a') && (s.substring(0, 2) == "12")) {
            ans = ("00" + s.substring(2, s.length()));
        } else {
            ans = s;
        }
        ans = ans.substring(0, ans.length()-2);
        return ans;
    }
}
