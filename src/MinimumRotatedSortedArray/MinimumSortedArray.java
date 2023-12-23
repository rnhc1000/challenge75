package MinimumRotatedSortedArray;

import java.util.Arrays;

public class MinimumSortedArray {

  public static void main(String[] args) {
    int[] numbers = { 7,6,5,3,4};
    System.out.println(findMinimum(numbers));
  }


  public static int[] rotatedByKey(int[] numbers, int key) {
    int size = numbers.length;
    if (key >= size) {
      return new int[]{};
    }
    Arrays.sort(numbers);

    int[] sortedAndRotatedArray = new int[size];
    for (int i = size-1; i >0 ; i--) {
      sortedAndRotatedArray[i-key] = numbers[i];
    }

    System.out.println(Arrays.toString(sortedAndRotatedArray));

    return sortedAndRotatedArray;
  }

  public static int findMinimum(int[] sorted) {
    int minimum = 0;
    int size = sorted.length;
    if (size == 1) return sorted[0];
    if (size == 2) return Math.min(sorted[0], sorted[1]);
    int left = 0;
    int right = size - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      /*
      check the array is decreasing  at mid + 1;
      */
      if (sorted[mid] > sorted[mid + 1]) {
        return sorted[mid + 1];
      }

      /*
      check the array os decreasing at mid
      */
      if (sorted[mid - 1] > sorted[mid]) {
        return sorted[mid];
      }
      /*
      discard the sorted part of the array
      increasing part
       */
      if (sorted[left] < sorted[mid]) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return minimum;
  }
}
