package br.dev.ferreiras.challenges.medianArrays;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively,
 * return the median of the two sorted arrays.
 * <p>
 * The overall run time complexity should be O(log (m+n)).
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */
public class MedianSortedArray {

  public static void main(String[] args) {
    int[] nums1 = {1, 2};
    int[] nums2 = {3, 4};

    double m = findMedianSortedArrays(nums1, nums2);

    System.out.print(String.format("%.2f", m));
  }

  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    
    if (!nums1.getClass().isArray() || !nums2.getClass().isArray()) {
      throw new IllegalArgumentException("Only arrays are allowed!");
    }

    double median = 0.0d;

    int[] nums = IntStream
            .concat(Arrays.stream(nums1), Arrays.stream(nums2))
            .sorted()
            .toArray();

    Object[] numsOne = Stream
            .of(nums1, nums2)
            .flatMap(Stream::of)
            .toArray();

    int sizeOfMergedArrays = nums.length;

    if (sizeOfMergedArrays % 2 == 0) {
      int i = sizeOfMergedArrays / 2;
      int j = i - 1;
      median = (double) (nums[i] + nums[j]) / 2;
    } else {
      int k = sizeOfMergedArrays / 2;
      median = (double) nums[k];
    }

    return median;
  }
}
