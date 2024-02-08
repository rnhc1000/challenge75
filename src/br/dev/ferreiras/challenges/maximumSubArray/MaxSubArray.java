package br.dev.ferreiras.challenges.maximumSubArray;

/**
 * Given an integer array numbers, find the sub array with
 * the largest sum, and return ist sum
 */
public class MaxSubArray {

  public static void main(String[] args) {
    int[] numbers = {-2,-1,0,1,2};
    System.out.println(maxSubArray(numbers));
  }
  public static int maxSubArray(int[] numbers) {
    int sum = 0;
    int size = numbers.length;
    int current = numbers[0];
    int maximum = Integer.MIN_VALUE;
    for (int i = 1; i < size; i++) {
      current = Math.max(numbers[i], numbers[i] + current);
      maximum = Math.max(maximum, current);
    }
    return maximum;
  }
}
