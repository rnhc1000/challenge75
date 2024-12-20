package br.dev.ferreiras.challenges.leetcode;
/*
Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it can trap after raining.

Example 1
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation:
The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
In this case, 6 units of rain water (blue section) are being trapped.

Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9

Constraints:

n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105
 */
public class TrappingRainWater {
  public static void main(String[] args) {
    int[] trapping = {4,2,0,3,2,5};
    int response = trap(trapping);
    System.out.println(response);
  }
  public static int trap(int[] height) {
    int response = 0, left = 0, right = 0, i = 0, j = height.length-1;
    while (i < j) {
      left =  Math.max(left, height[i]);
      right = Math.max(right,height[j]);
      if (left < right) {
        response += left - height[i];
        i++;
      } else {
        response += right - height[j];
        j--;
      }
    }
    return response;
  }
}
