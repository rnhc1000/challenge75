package br.dev.ferreiras.challenges.hackerrank;

import java.util.Arrays;

/*
A non-empty array A consisting of N integers is given.

A permutation is a sequence containing each element from 1 to N once, and only once.

For example, array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
is a permutation, but array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
is not a permutation, because value 2 is missing.

The goal is to check whether array A is a permutation.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

For example, given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
the function should return 1.

Given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
the function should return 0.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [1..1,000,000,000].
 */
public class ArrayPermutationCheck {
  public static void main(String[] args) {
    int[] numbers = {4};
    int response = checkPermutation(numbers);
    System.out.println(response);

  }

  public static int checkPermutation(int[] numbers) {
    int size = numbers.length;
    if (size <= 1) return 0;
    boolean isPermutation = false;
//    Arrays.sort(numbers);
/*
 n*(n+1)/2
 */
    int min = numbers[0];
    int max = numbers[0];
    int sum = 0;

    for (int number : numbers) {

      sum += number;
      if (number < min) {
        min = number;
      }
      if (number > max) {
        max = number;
      }
    }

    int difference = max - min;
    int math = size * (min + max) / 2;
    if (sum == math && difference == size - 1) {
      isPermutation = true;
    }

    System.out.println(min);
    System.out.println(max);
    System.out.println(sum);


    return isPermutation ? 1 : 0;
  }

  boolean areConsecutive(int arr[], int n) {
    //Sort the array
    Arrays.sort(arr);
    // checking the adjacent elements
    for (int i = 1; i < n; i++) {
      if (arr[i] != arr[i - 1] + 1) {
        return false;
      }
    }
    return true;
  }
}
