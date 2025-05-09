package br.dev.ferreiras.challenges.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 * Example 1:
 * Input: nums = [3,0,1]
 * Output: 2
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in the
 * range [0,3]. 2 is the missing number in the range since it does not appear in nums.
 * Example 2:
 * Input: nums = [0,1]
 * Output: 2
 * Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
 * 2 is the missing number in the range since it does not appear in nums.
 * Example 3:
 * Input: nums = [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9].
 * 8 is the missing number in the range since it does not appear in nums.
 * Constraints:
 * n == nums.length
 * 1 <= n <= 104
 * 0 <= nums[i] <= n
 * All the numbers of nums are unique.
 * Bit Manipulation (XOR):
 * In this approach, you use bitwise XOR operation to find the missing number.
 * XOR operation on a number with itself results in 0. So, if you XOR all the numbers
 * from 0 to n and all the numbers in the array, the result will be the missing number.
 * <p>
 * Initialize missing to 0.
 * Iterate over the array and XOR each number with missing.
 * After the iteration, the value in missing will be the missing number.
 * Complexity
 * ⏱️ Time Complexity: O(n) - for XORing all the numbers
 * <p>
 * 🚀 Space Complexity: O(1)
 */
public class MissingNumber {

  public static void main(String[] args) {
    int[] numbers = {1, 3, 6, 4, 2};
    int n = numbers.length;
    int r = missNumber(numbers);
    System.out.println(r);
  }

  public static int missNumber(int[] nums) {
    long missing = 0;
    int size = nums.length;

    missing = (size + 1L) * (size + 2L) / 2;

    for(int num : nums) {
      missing-=num;
    }

    return (int)missing;
  }

  public static int missingNumber(int[] nums) {
    Arrays.sort(nums);
    int missing = 0;
    int count = nums[0];
    for (int num : nums) {
      if (num != count) {
        missing = count;
      }
      count++;
    }
    return missing;
  }

  //1,N -> range for the code below
  public static int missingOneNumber(int[] numbers, int n) {
    int i;
    int[] temp = new int[n + 1];
    for (int j = 1; j < n; j++) {
      temp[numbers[j] - 1] = 1;
    }
    int response = 0;
    for (int j = 0; j <= n; j++) {
      if (temp[j] == 0) {
        response = j + 1;
      }
    }
    return response;
  }

  public static int missingNumbers(int[] numbers) {
    int size = numbers.length;
    int missing = numbers[size - 1] + 1;
    Set<Integer> set = new HashSet<>();
    System.out.println(Arrays.toString(numbers));
    for (int i = 0; i < numbers.length; i++) {
      set.add(numbers[i]);
    }
    System.out.println(set);
    for (int i = 0; i < numbers.length; i++) {
      if (!set.contains(numbers[i])) {
        missing = i;
        System.out.println("Missing" + missing);

      }
    }
    System.out.println("Missing -> " + missing);
    return missing;
  }


}
