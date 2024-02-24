package br.dev.ferreiras.challenges.codility;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A of N integers, returns the smallest positive integer
 * (greater than 0) that does not occur in A.
 * <p>
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * <p>
 * Given A = [1, 2, 3], the function should return 4.
 * <p>
 * Given A = [−1, −3], the function should return 1.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range
 * [−1,000,000..1,000,000].
 */
public class MissingNumber {
  public static void main(String[] args) {
    int[] numbers = {-1, -3};
//    int[] numbers = {1, 3, 6, 4, 1, 2};
    int r = getMissingNo(numbers);
    System.out.println(r);
  }

  public static int getMissingNo(int[] numbers) {
    int sum = 0;
    int n = numbers.length;
    for (int number : numbers) {
      if (number < 0) {
        number = -number;
        sum += number;
      } else {
        sum += number;
      }
    }
    return ((n * (n + 1)) / 2 - sum) + 1;
  }

  public static int solution(int[] A) {

    int missing = 0;
    Set<Integer> set = new HashSet<>();
    int size = A.length;
    for (int i = 0; i < A.length; i++) {
      set.add(A[i]);
    }

    for (int i = 0; i < A.length; i++) {
      if (!set.contains(i)) {
        missing = i;
      } else {
        missing = A[size - 1] + 1;
      }
    }
    return missing;
  }

  /**
   * stream can not have duplicate elements
   *
   * @param numbers
   * @return
   */
  public static int missNumber(int[] nums) {
    int miss = nums.length;
    for (int i = 0; i < nums.length; i++) {
      miss ^= i ^ nums[i];
    }
    return miss;
  }

  public static int solutions(int[] numbers) {

    int[] n = IntStream.of(numbers).sorted().toArray();
    int missingNumber = -1;
    for (int index = 0; index < numbers.length; index++) {
      if (numbers[index] != index + 1) {
        missingNumber = index + 1;
        break;
      }
    }
    return missingNumber;
  }

  public static int missingNumber(int[] numbers) {
    List<Integer> list = new ArrayList<>();

    list = Arrays.stream(numbers).boxed().toList();
    Set<Integer> set = new HashSet<>(list);
    System.out.println(set);
    int size = set.size() + 1;
    int expectedSum = (size * (size + 1)) / 2;
    int actualSum = set.stream().reduce((0), (x, y) -> x + y);
    System.out.println(expectedSum);
    System.out.println(actualSum);
    return expectedSum - actualSum;
  }

  public static int missedNumber(int[] numbers) {

    int size = numbers.length;
    int xorValue = IntStream.rangeClosed(1, size + 1).reduce(0, (a, b) -> a ^ b);
    return Arrays.stream(numbers).reduce(xorValue, (x, y) -> x ^ y);

  }

  public static int numberMissing(int[] numbers) {

    int size = numbers.length;
    boolean[] helper = new boolean[size + 1];
    int missingNumber = -1;
    for (int i = 0; i < size; i++) {
//      if (number < 0) number*=-1;
      helper[numbers[i]] = true;
    }
//    Arrays.stream(numbers).forEach(number -> helper[number - 1] = true);
    for (int index = 0; index < size; index++) {

      if (!helper[index]) {
        missingNumber = index + 1;
        break;

      }
    }
    return missingNumber;
  }


// Java code to implement the approach

  // Function to find the missing number
  public static int findMissing(int[] arr) {
    int i;
    int size = arr.length;
    int[] temp = new int[size + 1];
    for (i = 0; i <= size; i++) {
      temp[i] = 0;
    }

    for (i = 0; i < size; i++) {
      temp[arr[i] - 1] = 1;
    }

    int ans = 0;
    for (i = 0; i <= size; i++) {
      if (temp[i] == 0)
        ans = i + 1;
    }
    return ans;
  }
}

