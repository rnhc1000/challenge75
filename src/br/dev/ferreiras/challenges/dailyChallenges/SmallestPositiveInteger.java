package br.dev.ferreiras.challenges.dailyChallenges;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given an array A of N integers, returns the smallest positive integer
 * (greater than 0) that does not occur in A.
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * Given A = [1, 2, 3], the function should return 4.
 * Given A = [−1, −3], the function should return 1.
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
public class SmallestPositiveInteger {
  public static void main(String[] args) {
    int[] array = {1, 3, 6, 4, 1, 2};
    Integer r = smallestPositive(array);
    System.out.println("\n"+r);
  }

  public static Integer smallestPositive(int[] numbers) {
    Set<Integer> set = new HashSet<>();
    for (int number : numbers) {
      set.add(number);
      System.out.print(number + " ");
    }
    for (int l : set) {
      System.out.print(" " + l);
    }
    int count = 1;
    for (; count <= set.size(); count++) {
      if (!set.contains(count)) {
        return count;
      }
    }
    return count;
  }
}
