package br.dev.ferreiras.udemy.dsa.DP;

import java.util.Arrays;

public class RangeSum {

  public static void main(String[] args) {
    int[] nums = { 1,-2, 3, 10, -8, 0 };
    int j = 0, k = 4;
    int response = rangeSum(nums, j, k);
    System.out.println(response);

  }

  public static int rangeSum(int[] nums, int j, int k ) {

    int size = nums.length;
    int[] tempSum = new int[size];
    tempSum[0] = nums[0];
    int temp = 0;
    for (int i = 1; i < size; i++) {

      tempSum[i] = tempSum[i-1] + nums[i];

    }

    System.out.println(Arrays.toString(tempSum));
    if (k >= size) {
      return Integer.MIN_VALUE;
    }
    if (j == 0) return tempSum[k];
    return tempSum[j] - tempSum[k];

  }
}
