package ferreiras.dev.br.challenges.twoSum;

/**
 * ForceBrute solution...
 * Loop over the array summing one element to the next
 * and comparing to the target... when sum == target
 * get the indexes and return them...
 * O(n2).... nested loop
 */

import java.util.Arrays;

public class TwoSum {

  public static void main(String[] args) {
    int[] array = {2,7,3,1,9};
    int target = 16;
    int[] response = twoSumBruteForce(array,target);
    System.out.println(Arrays.toString(response));
  }
  public static int[] twoSumBruteForce(int[] nums, int target) {
    int[] response = new int[2];
    int lenOfNums = nums.length;
    int sum = 0;
    for (int i = 0; i < lenOfNums; i++) {
      for (int j = i; j < lenOfNums; j++) {
        sum = nums[i] + nums[j];
        if (sum == target) {
          response[0] = i;
          response[1] = j;
          break;
        }
      }
    }
    return response;
  }
}
