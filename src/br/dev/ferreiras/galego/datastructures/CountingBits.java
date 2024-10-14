package br.dev.ferreiras.galego.datastructures;

import java.util.Arrays;

/*
Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
ans[i] is the number of 1's in the binary representation of i.



Example 1:

Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
Example 2:

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101


Constraints:

0 <= n <= 105
 */
public class CountingBits {
  public static void main(String[] args) {
    int n = 8;
    int[] response = countBits(n);
    System.out.println(Arrays.toString(response));
  }

  public static int[] countBits(int n) {
    int[] response = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      int index = i;
      int oneCounter = 0;
      while (index != 0) {
        index &= (index - 1);
        oneCounter++;
      }
      response[i] = oneCounter;
    }

    return response;
  }
}
