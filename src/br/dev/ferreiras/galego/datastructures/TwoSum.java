package br.dev.ferreiras.galego.datastructures;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */
public class TwoSum {
  public static void main(String[] args) {
    int[] numbers = {2, 7, 11, 15};
    int target = 17;
    int[] response = twoSum(numbers, target);
    System.out.println(Arrays.toString(response));

  }

  public static int[] twoSum(int[] nums, int target) {

    Map<Integer, Integer> map = new LinkedHashMap<>();
    int[] response = new int[2];
    int size = nums.length;
    for (int i = 0; i < size; i++) {
      int temp = target - nums[i];
      if (map.containsKey(temp)) {
        response[0] = i;
        response[1] = map.get(temp);
        return response;
      } else {
        map.put(nums[i], i);
      }

    }

    return response;
  }
}
