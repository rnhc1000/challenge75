package br.dev.ferreiras.challenges.leetCode;

import java.awt.color.ICC_Profile;
import java.util.ArrayList;
import java.util.List;

/*
Given an integer array nums that does not contain any zeros, find the largest positive
integer k such that -k also exists in the array.

Return the positive integer k. If there is no such integer, return -1.

Example 1:

Input: nums = [-1,2,-3,3]
Output: 3
Explanation:
3 is the only valid k we can find in the array.
Example 2:

Input: nums = [-1,10,6,7,-7,1]
Output: 7
Explanation:
Both 1 and 7 have their corresponding negative values in the array. 7 has a larger value.
Example 3:

Input: nums = [-10,8,6,7,-2,-3]
Output: -1
Explanation: T
here is no a single valid k, we return -1.


Constraints:

1 <= nums.length <= 1000
-1000 <= nums[i] <= 1000
nums[i] != 0
 */
public class ArrayLargestPositiveNegative {
  public static void main(String[] args) {
//    int[] nums = {-1,10,6,7,-7,1};
    int[] nums = {-1,2,-3,3};
    int response = findMaxK(nums);
    System.out.println(response);
  }
  public static int findMaxK(int[] nums) {

    List<Integer> list = new ArrayList<>();

    int max = Integer.MIN_VALUE;


    for (int i = 0; i < nums.length; i++) {

      for (int j = i + 1; j < nums.length; j++) {

        if (nums[i] == -nums[j])
          list.add(nums[i]);
      }
    }

    for (int i : list) {
      max = Math.max(max, i);
    }
    System.out.println(list);
    return Math.abs(max);

  }
}
