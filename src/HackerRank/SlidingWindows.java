package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author rferreira
 * You are given an array of integers nums, there is a sliding window of size k
 * which is moving from the very left of the array to the very right.
 * You can only see the k numbers in the window.
 * Each time the sliding window moves right by one position.
 * Return the max sliding window.
 * Example 1:
 * Input: nums = [1,3,-1,-3,5,3,6,7,8], k = 3
 * Output: [3,3,5,5,6,7]
 * Explanation:
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7  8       3
 *  1 [3  -1  -3] 5  3  6  7  8     3
 *  1  3 [-1  -3  5] 3  6  7  8    5
 *  1  3  -1 [-3  5  3] 6  7  8    5
 *  1  3  -1  -3 [5  3  6] 7  8    6
 *  1  3  -1  -3  5 [3  6  7] 8    7
 *  1  3  -1  -3  5 3  [6  7   8]      7
 */
public class SlidingWindows {

  public static void main(String[] args) {
    int[] x = new int[]{1,2,3,4,5,6,7,8,9};
    int k =3;
    returnMaxWindow(x,k);
  }

  public static int[] returnMaxWindow(int[] numbers, int window) {
    int size = window;
    int[][] slidingWindow = new int[numbers.length-2][size];


    int c =0;
    int temp = window;
    System.out.println(Arrays.toString(slidingWindow));
    for ( int[] m : slidingWindow) {
      while (temp > 0) {
        System.out.println(c +" " + temp);
        m[c] = numbers[c];
        c++;
        temp--;
      }
      c=0;
      temp=window;
      System.out.println(Arrays.toString(m));
    }



    int[] windows = new int[]{};
//    windows = slidingWindow.toArray();
    return windows;
  }
}
