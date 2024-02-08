package br.dev.ferreiras.udemy.dsa.arrays;

/**
 * You have been asked to create a method in Java, maxSubarray, that finds the contiguous subarray
 * (containing at least one number) which has the largest sum and returns its sum.
 * Method Signature
 * public static int maxSubarray(int[] nums)
 * This method takes as input an array of integers nums and returns an integer representing the
 * maximum sum of a contiguous subarray within the input array.
 * Input
 * An array of integers nums
 * Output
 * An integer that represents the maximum sum of a contiguous subarray within the input array.
 * Example
 * <p>
 * For example, if the input array is {-2, 1, -3, 4, -1, 2, 1, -5, 4}, the method should return
 * 6 as the subarray with the maximum sum is {4, -1, 2, 1} which sums to 6.
 * Note
 * A subarray is a contiguous part of an array. In other words, a subarray is a sequence of elements
 * that are in direct succession in the array, with no elements from the array skipped or interspersed.
 * You need to find a contiguous subarray with the largest sum. This subarray could be the entire array,
 * or it could be a smaller part of the array. It could include negative numbers, but the sum of the
 * subarray must be maximized.
 * You can assume that the input array is non-empty and contains at least one number.
 */
import java.util.Arrays;
public class MaxSubArray {
  public static void main(String[] args) {
    // Example 1: Simple case with positive and negative numbers
    int[] inputCase1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int result1 = maxSubarray(inputCase1);
    System.out.println("Example 1: Input: " + Arrays.toString(inputCase1) + "\nResult: " + result1);

    // Example 2: Case with a negative number in the middle
    int[] inputCase2 = {1, 2, 3, -4, 5, 6};
    int result2 = maxSubarray(inputCase2);
    System.out.println("Example 2: Input: " + Arrays.toString(inputCase2) + "\nResult: " + result2);

    // Example 3: Case with all negative numbers
    int[] inputCase3 = {-1, -2, -3, -4, -5};
    int result3 = maxSubarray(inputCase3);
    System.out.println("Example 3: Input: " + Arrays.toString(inputCase3) + "\nResult: " + result3);

    // Example 4: Case with all positive numbers
    int[] inputCase4 = {1, 2, 3, 4, 5};
    int result4 = maxSubarray(inputCase4);
    System.out.println("Example 4: Input: " + Arrays.toString(inputCase4) + "\nResult: " + result4);

    // Example 5: Case with alternating positive and negative numbers
    int[] inputCase5 = {1, -1, 1, -1, 1};
    int result5 = maxSubarray(inputCase5);
    System.out.println("Example 5: Input: " + Arrays.toString(inputCase5) + "\nResult: " + result5);

        /*
            EXPECTED OUTPUT:
            ----------------
            Example 1: Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
            Result: 6
            Example 2: Input: [1, 2, 3, -4, 5, 6]
            Result: 13
            Example 3: Input: [-1, -2, -3, -4, -5]
            Result: -1
            Example 4: Input: [1, 2, 3, 4, 5]
            Result: 15
            Example 5: Input: [1, -1, 1, -1, 1]
            Result: 1
        */

  }

  public static int maxSubarray(int[] nums) {
    if(nums.length == 0) return 0;
    int maxSum = nums[0];
    int currentSum = nums[0];
    for (int i = 1; i < nums.length; i++) {
      currentSum = Math.max(nums[i], currentSum + nums[i]);
      maxSum = Math.max(maxSum,currentSum);
    }
    return maxSum;
  }
}
