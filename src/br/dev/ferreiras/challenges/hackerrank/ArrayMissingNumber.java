package br.dev.ferreiras.challenges.hackerrank;

import java.util.Arrays;

/*
An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)],
which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].

 */
public class ArrayMissingNumber {

  public static void main(String[] args) {
    int[] numbers = { 9, 6, 4, 2, 3, 5, 7, 1 };
    int k = 10;
    int response = missingNumber(numbers);
    System.out.println(response);

  }
  public static int missingNumber(int[] numbers) {

    int size = numbers.length;
    if (size == 0)
      return 0;
    Arrays.sort(numbers);
    int missing = 0;
    for (int i = 1; i < numbers.length; i++) {

      if (numbers[i] - numbers[i - 1] != 1) {
        missing = numbers[i] - 1;
        break;
      }

    }
    return missing;
  }

  public static int missingNumber(int[] numbers, int k) {
    int size = numbers.length;
    int missing = size;

    if (size == 0) return 0;
    for (int i = 0; i < size; i++) {
      missing ^= i ^ numbers[i];

    }

    return missing;
  }
}
