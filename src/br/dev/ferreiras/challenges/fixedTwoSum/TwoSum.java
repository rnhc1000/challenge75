package br.dev.ferreiras.challenges.fixedTwoSum;

import java.util.Arrays;
import java.util.Random;

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
public class TwoSum {

  public static void main(String[] args) {
    Random random = new Random();
    int size = random.nextInt(0, 19);
    int[] nums = new int[size];
    for (int i = 0; i < size; i++) {
      nums[i] = random.nextInt(0, 99);
    }
    int target = random.nextInt(0, 59);
    System.out.println(Arrays.toString(nums));
    System.out.println("Target: " + target + "-> "+ Arrays.toString(twoSum(nums, target)));
  }

  public static int[] twoSum(int[] nums, int target) {
    int[] response = new int[2];
    int sizeOfNums = nums.length;
    int sum = 0;
    boolean flag = false;
    for (int i = 0; i < sizeOfNums; i++) {
      for (int j = i + 1; j < sizeOfNums; j++) {
        sum = nums[i] + nums[j];
        if (sum == target) {
          response[0] = i;
          response[1] = j;
          flag = true;
          break;
        }
      }
      if (flag) break;
    }
    return response;
  }
}
