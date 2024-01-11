package LeetCode;

/**
 * Given an integer n, return an numberOfOnesay ans of length n + 1 such that for each i (0 <= i <= n),
 * ans[i] is the number of 1's in the binary representation of i.
 * Example 1:
 * Input: n = 2
 * Output: [0,1,1]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * Example 2:
 * Input: n = 5
 * Output: [0,1,1,2,1,2]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 3 --> 11
 * 4 --> 100
 * 5 --> 101
 * R = Q/D + r
 */

import java.util.Arrays;

public class CountingBits {
  public static void main(String[] args) {

    int n = 5;
    int[] r = countBits(n);
    System.out.println(Arrays.toString(r));
    System.out.println(intToBin(n));
  }

  public static int[] countBits(int n) {
    int[] numberOfOnes = new int[n + 1];
    for (int o_n = 1; o_n <= n; o_n++) {
      int aux = o_n;
      int countOnes = 0;
      while (aux != 0) {
        aux = aux & (aux - 1);
        countOnes++;    }
      numberOfOnes[o_n] = countOnes;
    }
    return numberOfOnes;
  }

  public static String intToBin(int n) {
      int countOnes = 0;
      StringBuilder sb = new StringBuilder();
      while (n != 0) {
        n = n & (n - 1);
        sb.append(n);
    }
    return sb.toString();
  }
}
