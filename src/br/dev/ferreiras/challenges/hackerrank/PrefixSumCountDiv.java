package br.dev.ferreiras.challenges.hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Write a function:

class Solution { public int solution(int A, int B, int K); }

that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

{ i : A ≤ i ≤ B, i mod K = 0 }

For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by
2 within the range [6..11], namely 6, 8 and 10.

Write an efficient algorithm for the following assumptions:

A and B are integers within the range [0..2,000,000,000];
K is an integer within the range [1..2,000,000,000];
A ≤ B.
 */
public class PrefixSumCountDiv {

  public static void main(String[] args) {
    int one = 6;
    int two = 11;
    int key = 2;
    int response = countDivisibleBy(one, two, key);
    System.out.println(response);
  }

  public static int countDivisibleBy(int one, int two, int key) {
    int interval = two - one + 1; // one <= interval <= two
    if (two <= one || key == 0) return 0;
    int[] numbers = new int[interval];
    for (int i = 0; i < interval; i++) {

      if ( one % key == 0) {
        numbers[i] = one;
      }
      one++;

    }
    Set<Integer> set = new HashSet<>();

    System.out.println(Arrays.toString(numbers));
    for (int number : numbers) {
      if(number != 0)
        set.add(number);
    }

    System.out.println(set);
    return set.size();

  }
}
