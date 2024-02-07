package ferreiras.dev.br.challenges.hackerRank;
/**
 * @author rferreira
 * Kadane's Algorithm
 * return a non-empty sub-array
 * with the largest sum
 * O(n)
 */
import java.util.Arrays;

public class KadaneAlgo {
  public static void main(String[] args) {
    int[] numbers = new int[]{4, -1, -3, -4, 5, 6, 7, 8, 9};
    System.out.println(largestSumSubArray(numbers));
    int[] max = new int[2];
    max = slidingWindows(numbers);
    System.out.println(Arrays.toString(max));
  }

  public static int[] slidingWindows(int[] numbers) {
    int[] v = new int[]{};
    if (numbers.length == 0) return v;
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;
    int maxLeft = 0;
    int maxRight = 0;
    int left = 0;
    int[] max = new int[2];
    for (int right : numbers) {
      if (currentSum < 0) {
        currentSum = 0;
        left = right;
      }
      currentSum += right;
      if (currentSum > maxSum) {
        maxSum = currentSum;
        maxLeft = left;
        maxRight = right;
      }
      max[0] = maxLeft;
      max[1] = maxRight;
    }
    return max;
  }

  public static int largestSumSubArray(int[] numbers) {
    if (numbers.length == 0) return 0;
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;
    for (int number : numbers) {
      currentSum = Math.max(currentSum, 0);
      maxSum = Math.max(maxSum, currentSum += number);
    }
    return maxSum;
  }
}

