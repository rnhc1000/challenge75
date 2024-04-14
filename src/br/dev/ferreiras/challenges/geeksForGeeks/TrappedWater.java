package br.dev.ferreiras.challenges.geeksForGeeks;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given an array arr[] of N non-negative integers representing the height of blocks.
 * If width of each block is 1, compute how much water can be trapped between the blocks
 * during the rainy season.
 * Example 1:
 * Input:
 * N = 6
 * arr[] = {3,0,0,2,0,4}
 * Output:
 * 10
 * Explanation:
 * Example 2:
 * <p>
 * Input:
 * N = 4
 * arr[] = {7,4,0,9}
 * Output:
 * 10
 * Explanation:
 * Water trapped by above
 * block of height 4 is 3 units and above
 * block of height 0 is 7 units. So, the
 * total unit of water trapped is 10 units.
 */
public class TrappedWater {
  public static void main(String[] args) {
    int[] trapped = {7, 4, 0, 9};
    int n = 4;
    long response = trappedWater(trapped, n);
    System.out.println(response);
  }

  static int[] sorting(int[] nums) {
    int size = nums.length;
    int temp = 0;
    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {
        if (nums[i] > nums[j]) {
          temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
        }
      }
    }
    return nums;
  }

  static long trappingWater(int[] arr, int n) {
//    Arrays.sort(arr);
    int size = arr.length;
    int maxIndex = arr.length - 2;
    int max = arr[size - 2];
    int subTotal = 0;
    int left = 0;
    while (left < maxIndex) {
      if (arr[left] == 0) {
        subTotal += Math.max(arr[left], max);
      } else {
        subTotal += max - arr[left];
      }
      left++;
    }
    return subTotal;
  }

  public static int trappedWater(int[] arr, int n) {
    int[] right = new int[n];
    int[] left = new int[n];
    int response = 0;
    int size = arr.length;
    if (size == 0) return 0;

    left[0] = arr[0];

    for (int i = 1; i < size; i++) {
      left[i] = Math.max(left[i - 1], arr[i]);
    }
    right[size - 1] = arr[size - 1];

    for (int j = size - 2; j >= 0; j--) {
      right[j] = Math.max(right[j + 1], arr[j]);
    }

    for (int k = 0; k < size; k++) {
      response += Math.min(left[k], right[k]) - arr[k];
    }
    return response;
  }
  public static int trapped(int[] arr, int n) {
    int response = 0, left = 0, right = 0, i = 0, j = arr.length-1;
    while (i < j) {
      left =  Math.max(left, arr[i]);
      right = Math.max(right,arr[j]);
      if (left < right) {
        response += left - arr[i];
        i++;
      } else {
        response += right - arr[j];
        j--;
      }
    }
    return response;
  }
  public int trapping_rain_water(int[] A) {
    int N = A.length;
    int res = 0;
    Deque<Integer> stack = new ArrayDeque<Integer>();
    int i = 0;
    while(i < N){
      while (!stack.isEmpty() && A[i] > A[stack.peek()]) {

        int top = A[stack.peek()];
        stack.pop();
        if(stack.isEmpty()){
          break;
        }
        int length =  i - stack.peek() - 1;
        int width = Math.min(A[i], A[stack.peek()]) - A[top];
        res += length * width;

      }
      stack.push(i);
      i = i + 1;
    }
    return res;
  }
}