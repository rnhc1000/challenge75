package br.dev.ferreiras.challenges.leetcode;

/**
 * You are given a 0-indexed integer array nums of even length consisting of an
 * equal number of positive and negative integers.
 * You should rearrange the elements of nums such that the modified array follows
 * the given conditions:
 * Every consecutive pair of integers have opposite signs.
 * For all integers with the same sign, the order in which they were present in
 * nums is preserved.
 * The rearranged array begins with a positive integer.
 * Return the modified array after rearranging the elements to satisfy the aforementioned
 * conditions.
 * Example 1:
 * Input: nums = [3,1,-2,-5,2,-4]
 * Output: [3,-2,1,-5,2,-4]
 * Explanation:
 * The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
 * The only possible way to rearrange them such that they satisfy all conditions is
 * [3,-2,1,-5,2,-4].
 * Other ways such as
 * [1,-2,2,-5,3,-4],
 * [3,1,2,-2,-5,-4],
 * [-2,3,-5,1,-4,2]
 * are incorrect because they do not satisfy one or more conditions.
 * Example 2:
 * Input: nums = [-1,1]
 * Output: [1,-1]
 * Explanation:
 * 1 is the only positive integer and -1 the only negative integer in nums.
 * So nums is rearranged to [1,-1].
 */
public class RearrangeBySign {
  public static void main(String[] args) {
    int[] numbers = {3, 1, -2, -5, 2, -4};
    int[] response = rearrangeArray(numbers);
    System.out.print("[");
    for (int r : response) {
      System.out.print(" " + r);
    }
    System.out.print(" ]");
  }

  public static int[] rearrangeArray(int[] nums) {
    int size = nums.length;
    int positive = 0;
    int negative = 1;
    int[] response = new int[size];
    for (int num : nums) {
      if (num > 0) {
        response[positive] = num;
        positive+=2;
      } else {
        response[negative] = num;
        negative+=2;
      }
    }
    return response;
  }
}

