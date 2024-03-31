package br.dev.ferreiras.challenges.linkedin;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
This problem was asked by Lyft.

Given a list of integers and a number K, return which contiguous elements of the list sum to K.

For example, if the list is [1, 2, 3, 4, 5] and K is 9, then it should return [2, 3, 4],
since 2 + 3 + 4 = 9.
 */
public class SumArrayK {

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5};
    int k = 9;
    int[] response = sumArrayToK(nums,k);
    System.out.println(Arrays.toString(response));

  }
  public static int[] sumArrayToK(int[] nums, int k) {
    int size = nums.length;
    int left = 0, right = 0, sum = 0;
    List<Integer> list = new LinkedList<>();

    for(; left < size; left++) {
      sum += nums[left];
      while (sum < k && right <= left) {
        sum += nums[right];
        right++;
      }
      list.add(nums[right]);
    }

    return list.stream().mapToInt(x -> x).toArray();
  }
}
