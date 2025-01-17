package br.dev.ferreiras.challenges.leetcode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.

You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.



Example 1:

Input: nums = [1,2,1,3,7,9,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.
Example 2:

Input: nums = [-1,0]
Output: [-1,0]
Example 3:

Input: nums = [0,1]
Output: [1,0]


Constraints:

2 <= nums.length <= 3 * 104
-231 <= nums[i] <= 231 - 1
Each integer in nums will appear twice, only two integers will appear once.
 */
public class ArraySingleNumberThree {
  public static void main(String[] args) {
    int[] nums = {1,2,1,3,2,5};
    int[] result = singleNumber(nums);
    System.out.println(Arrays.toString(result));

  }
  public static int[] singleNumber(int[] nums) {

    long start = System.nanoTime();
    int[] result =new int[2];
    Map<Integer, Integer> map = new LinkedHashMap<>();

    for (int num : nums) {
      map.put(num, map.getOrDefault((num),0) +1);
    }
    int index= 0;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

      if (entry.getValue() == 1) {
        result[index] = entry.getKey();
        index++;

      }
    }
    long end = System.nanoTime();
    System.out.println((end-start)/1_000L + " us");
    return result;

  }
}
