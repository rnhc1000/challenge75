package br.dev.ferreiras.udemy.dsa.hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of integers nums and a target integer target, write a method
 * called subarraySum that finds the indices of a contiguous subarray in nums
 * that add up to the target sum using a hash table (HashMap).
 * Your function should take two arguments:
 * nums: an array of integers representing the input array
 * target: an integer representing the target sum
 * Your function should return a list of two integers representing the starting
 * and ending indices of the subarray that adds up to the target sum.
 * If there is no such subarray, your function should return an empty list.
 * For example:
 * int[] nums = [1, 2, 3, 4, 5]
 * int target = 9
 * int[] result1 = subarraySum(nums1, target1);
 * // This should print [1, 3]
 * System.out.println("[" + result1[0] + ", " + result1[1] + "]");
 * Note that there may be multiple subarrays that add up to the target sum, but
 * your method only needs to return the indices of any one such subarray.
 * Also, the input array may contain both positive and negative integers.
 * A HashMap sumIndex is created to store the cumulative sum of the elements in the
 * array as keys and their corresponding indices as values.
 * The initial key-value pair (0, -1) is added to the HashMap, representing the cumulative
 * sum before the first element of the array.
 * A variable currentSum is initialized to 0 to store the cumulative sum of the elements
 * as we iterate through the array.
 * A for loop iterates through the array nums with index i.
 * Inside the loop, currentSum is incremented by the current element, nums[i].
 * If the HashMap sumIndex contains the key currentSum - target, it means that there is a
 * subarray whose sum is equal to the target value. In this case, we return an array containing
 * the start index (the value associated with the key currentSum - target in the HashMap incremented by 1)
 * and the end index i.
 * If the HashMap does not contain the key currentSum - target, we add the key-value pair (currentSum, i)
 * to the HashMap and continue to the next iteration.
 * If the loop completes without finding a subarray with the target sum, an empty array is returned.
 */
public class SubArraySum {
  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 4, 5};
    int target1 = 9;
    int[] result1 = subarraySum(nums1, target1);
    System.out.println("[" + result1[0] + ", " + result1[1] + "]");

    int[] nums2 = {-1, 2, 3, -4, 5};
    int target2 = 0;
    int[] result2 = subarraySum(nums2, target2);
    System.out.println("[" + result2[0] + ", " + result2[1] + "]");

    int[] nums3 = {2, 3, 4, 5, 6};
    int target3 = 3;
    int[] result3 = subarraySum(nums3, target3);
    System.out.println("[" + result3[0] + ", " + result3[1] + "]");

    int[] nums4 = {};
    int target4 = 0;
    int[] result4 = subarraySum(nums4, target4);
    System.out.println("[]");

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 3]
            [0, 3]
            [1, 1]
            []

        */

  }

  public static int[] subarraySum(int[] nums, int target){
    int[] response = new int[2];
    Map<Integer, Integer> map = new HashMap<>();

    map.put(0,-1);
    int currentSum = 0;
    for (int i=0; i<nums.length; i++){
      currentSum+=nums[i];
      if(map.containsKey(currentSum-target)) {
        return new int[]{map.get(currentSum-target)+1,i};
      } else {
        map.put(currentSum,i);
      }
    }
    return new int[]{};
  }
}
