package org.example.threemonths;

public class DivisibleSumPairs {
//    int t = 0; int[] ans = new int[k]; for (Integer integer : ar) { ans[integer % k] += 1; } if (ans[0] > 1) { t = (ans[0]*(ans[0]-1))/2; } for (int count = 1; count <= (k-1)/2; count++) { t += ans[count]ans[k-count]; } if (k%2 == 0) { if (ans[k/2] > 1) { t += (ans[k/2](ans[k/2]-1))/2; } } return t;

}
