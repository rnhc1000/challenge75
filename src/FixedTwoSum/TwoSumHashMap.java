package FixedTwoSum;

import java.util.*;

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * You can return the answer in any order.
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * Constraints:
 * <p>
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 */
public class TwoSumHashMap {

  public static void main(String[] args) {
    int[] nums= {3,2,4};
    int target = 6;
    System.out.println(Arrays.toString(twoSum(nums,target)));
  }
  public static int[] twoSum(int[] nums, int target) {

    int size = nums.length;
    int [] response=new int [2];
    Map<Integer,Integer> map = new HashMap<>();
    int complement = target;
    for (int i=0; i<size; i++){
      complement = target-nums[i];
      if(map.containsKey(complement)) {
        response[0] = map.get(complement);
        response[1] = i;
      }
      map.put(nums[i], i);
    }
    return response;
  }
}
