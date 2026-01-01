package br.dev.ferreiras.challenges.hackerrank;

import java.util.HashSet;
import java.util.Set;

/*
that, given an array A consisting of N integers, returns the number of distinct values in array A.

For example, given array A consisting of six elements such that:

 A[0] = 2    A[1] = 1    A[2] = 1
 A[3] = 2    A[4] = 3    A[5] = 1
the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].

 */
public class ArrayDistinct {

  public static void main(String[] args) {
    int[] numbers = { 1, 1,1,2,3,1};
    int response = distinctNumbers(numbers);
    System.out.println(response);
  }

  public static int distinctNumbers(int[] numbers) {
    int size = numbers.length;
    if (size == 0) return 1;
    Set<Integer> set = new HashSet<>();
    for (int number : numbers) {
      set.add(number);
    }
    return set.size();
  }
}
