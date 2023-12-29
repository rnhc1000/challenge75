package HackerRank;

import java.util.Arrays;

/**
 * @author rferreira
 * Kadane's Algorithm
 * return a non-empty sub-array
 * with the largest sum
 * O(n)
 */

/**
 * SELECT GROUP_CONCAT(NUMBER SEPARATOR '&')
 * FROM (
 *     SELECT @number:=@number+1 as NUMBER FROM
 *     information_schema.tables t1,
 *     information_schema.tables t2,
 *     (SELECT @number:=1) tmp
 * ) TEMPNUMBER
 * WHERE NUMBER<=1000 AND NOT EXISTS(
 *         SELECT * FROM (
 *             SELECT @nu:=@nu+1 as NUMBERX FROM
 *                 information_schema.tables t1,
 *                 information_schema.tables t2,
 *                 (SELECT @nu:=1) tmp1
 *                 LIMIT 1000
 *             ) tatata
 *         WHERE FLOOR(NUMBER/NUMBERX)=(NUMBER/NUMBERX) AND NUMBERX<NUMBER AND NUMBERX>1
 *     )
 */
public class KadaneAlgo {
  public static void main(String[] args) {
    int[] numbers = new int[]{4,-1,-3,-4,5,6,7,8,9};
    System.out.println(largestSumSubArray(numbers));

    int[] max = new int[2];
    max = slidingWindows(numbers);
    System.out.println(Arrays.toString(max));
  }

  public static int[] slidingWindows(int[] numbers) {
    int[] v = new int[]{};
    if(numbers.length == 0) return v;
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
//    int[] numbers = new int[]{4,-1,-3,-4,5,6,7,8,9};
    if (numbers.length == 0) return 0;
    int maxSum=Integer.MIN_VALUE;
    int currentSum = 0;
    for (int number : numbers) {
      // se negativo, currentSum=0;
      currentSum = Math.max(currentSum, 0);
      //currentSum+=number;
      maxSum = Math.max(maxSum, currentSum+=number);
    }
    return maxSum;
  }
  /* 1. x=4, c=0 -> c=4, x=4
     2. x=4, c=3 -> c=3, x=4
     3. x=4, c=0 -> c=0, x=4
     4. x=4, c=-3 -> c=-3, x=4
     5. x=4, c=5 -> c=5, x=4
     6. x=5, c=11 -> c=11, x=5
     7. x=11, c=4 -> c=4, x=11
     8. x=11, c=12 ->c=12, x=11
     9. x=12, c=21 -> c=21, x=11 -> x=21
  2.



   */
}
