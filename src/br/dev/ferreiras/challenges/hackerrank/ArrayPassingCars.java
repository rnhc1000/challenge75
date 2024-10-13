package br.dev.ferreiras.challenges.hackerrank;

import java.util.LinkedList;
import java.util.List;

/*
A non-empty array A consisting of N integers is given. The consecutive elements of array A
represent consecutive cars on a road.

Array A contains only 0s and/or 1s:

0 represents a car traveling east,
1 represents a car traveling west.
The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N,
is passing when P is traveling to the east and Q is traveling to the west.

For example, consider array A such that:

  A[0] = 0
  A[1] = 1
  A[2] = 0
  A[3] = 1
  A[4] = 1
We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).

Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A of N integers, returns the number of pairs of passing cars.

The function should return −1 if the number of pairs of passing cars exceeds 1,000,000,000.

For example, given:

  A[0] = 0
  A[1] = 1
  A[2] = 0
  A[3] = 1
  A[4] = 1
the function should return 5, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer that can have one of the following values: 0, 1.
 */
public class ArrayPassingCars {

  public static void main(String[] args) {
    int[] arr = {0, 1, 0, 1, 1};
    List<List<Integer>> response = pairOfCars(arr);
    for (List<Integer> list : response) {
      System.out.println(list);
    }
  }

  public static  List<List<Integer>> pairOfCars(int[] cars) {


    int size = cars.length;
    if( size <= 1) return new LinkedList<>();
    List<List<Integer>> list = new LinkedList<>();

    for (int i = 0; i < size; i++) {
        if (cars[i] == 0) {
          for (int j = i + 1; j < size; j++) {
            if (cars[j] == 1) {
              List<Integer> listZero = new LinkedList<>();
              listZero.add(i);
              listZero.add(j);
              list.add(listZero);
            }
        }
      }

    }
    System.out.println(list.size());
    return list;

  }

  public static int[] calculatePrefixSum(int[] numbers) {
    int n = numbers.length;
    int[] prefixSum = new int[n];
    prefixSum[0] = numbers[0];
    for (int i = 1; i < n; i++) {
      prefixSum[i] = prefixSum[i - 1] + numbers[i];
    }
    return prefixSum;
  }
}
