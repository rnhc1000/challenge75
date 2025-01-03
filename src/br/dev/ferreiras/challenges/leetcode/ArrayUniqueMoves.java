package br.dev.ferreiras.challenges.leetcode;

import java.util.*;

/*
You are given an integer array nums. In one move, you can pick an index i where 0 <= i < nums.length
and increment nums[i] by 1.

Return the minimum number of moves to make every value in nums unique.

The test cases are generated so that the answer fits in a 32-bit integer.

Example 1:

Input: nums = [1,2,2]
Output: 1
Explanation: After 1 move, the array could be [1, 2, 3].
Example 2:

Input: nums = [3,2,1,2,1,7]
Output: 6
Explanation: After 6 moves, the array could be [3, 4, 1, 2, 5, 7].
It can be shown with 5 or less moves that it is impossible for the array to have all unique values.


Constraints:

1 <= nums.length <= 105
0 <= nums[i] <= 105
 */
public class ArrayUniqueMoves {
  public static void main(String[] args) {
    int[] nums = {3,2,1,2,1,7};
    int response = minIncrementForUnique(nums);
    System.out.println(response);
  }
  public static int minIncrementForUnique(int[] nums) {
    int numberOfMoves = 0, uniqueValue = 0;
    Arrays.sort(nums);
    List<Integer> list = new LinkedList<>();
    for (int num : nums) {
      uniqueValue = Math.max(uniqueValue, num);
      numberOfMoves += uniqueValue - num;
      list.add(uniqueValue);
      uniqueValue+=1;
    }
    System.out.println(list);
    return numberOfMoves;
  }
}
