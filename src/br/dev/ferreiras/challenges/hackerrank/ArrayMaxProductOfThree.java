package br.dev.ferreiras.challenges.hackerrank;

import java.util.Arrays;

/*
A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to
A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).

For example, array A such that:

  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
contains the following example triplets:

(0, 1, 2), product is −3 * 1 * 2 = −6
(1, 2, 4), product is 1 * 2 * 5 = 10
(2, 4, 5), product is 2 * 5 * 6 = 60
Your goal is to find the maximal product of any triplet.

Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A, returns the value of the maximal product of any triplet.

For example, given array A such that:

  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
the function should return 60, as the product of triplet (2, 4, 5) is maximal.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [3..100,000];
each element of array A is an integer within the range [−1,000..1,000].
 */
public class ArrayMaxProductOfThree {
  public static void main(String[] args) {
    int[] triplets = {10,10,10};
    int response = maxTriplet(triplets);
    System.out.println(response);
  }

  public static int maxTriplet(int[] triplets) {
    int size = triplets.length;
    if (size < 3) return 0;
    int left = 0;
    int right = 1;
    int currentProduct = 0;
    int maximumProduct = 0;
    int[] index = new int[3];
    for (; left < size - 2; left++) {

      if (triplets[left] <= triplets[right] && triplets[right] <= triplets[right + 1]) {
        currentProduct = triplets[left] * triplets[right] * triplets[right + 1];
        maximumProduct = Math.max(maximumProduct, currentProduct);
        index[0] = left;
        index[1] = right;
        index[2] = right +1;

        System.out.println(Arrays.toString(index));
      }
      right++;
      currentProduct = 0;
    }


    return maximumProduct;
  }

}
