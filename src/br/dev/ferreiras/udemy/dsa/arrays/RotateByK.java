package br.dev.ferreiras.udemy.dsa.arrays;

/**
 * You are tasked with implementing a method, rotate, that rotates an array to the right by k steps,
 * where k is a non-negative integer.
 * Method Signature
 * public static void rotate(int[] nums, int k)
 * This method takes as input an array of integers nums and a non-negative integer k, and rotates the
 * array in-place.
 * Input
 * An array of integers nums (you can assume the array is not empty)
 * A non-negative integer k, which represents the number of steps the array should be rotated.
 * Output
 * This function does not return anything. It modifies the input array nums in-place to rotate
 * it to the right by k steps.
 * Example
 * For example, if the input array is {1, 2, 3, 4, 5, 6, 7} and k = 3, the method should rotate
 * the array to become {5, 6, 7, 1, 2, 3, 4}.
 * Note
 * Rotation is performed in steps. For each step, the last element of the array is moved to the front,
 * and all other elements are moved one step to the right.
 * The number of rotations is equal to k mod n, where n is the length of the array.
 * This is because after n rotations, the array would return to its original state.
 * The rotation should be performed in-place, i.e., without making a copy of the original array
 * (except for temporary variables).
 * Your solution should run efficiently, ideally with a linear time complexity and constant space
 * complexity.
 * This algorithm uses the principle of reversing parts of the array to achieve the rotation effect
 * in a time complexity of O(n) where n is the size of the array, and constant space complexity (O(1))
 * since no additional data structures are used.
 */

import java.util.Arrays;

public class RotateByK {
  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
    int k1 = 3;
    System.out.println("Array to rotate: " + Arrays.toString(nums1) + " by: " + k1 + " times!");
    rotate(nums1, k1);
    System.out.println("Test case 1: Rotated array: " + Arrays.toString(nums1));  // prints "Rotated array: [5, 6, 7, 1, 2, 3, 4]"

    int[] nums2 = {-1, -100, 3, 99};
    int k2 = 2;
    System.out.println("Array to rotate: " + Arrays.toString(nums2) + " by: " + k2 + " times!");
    rotate(nums2, k2);

    System.out.println("Test case 2: Rotated array: " + Arrays.toString(nums2));  // prints "Rotated array: [3, 99, -1, -100]"
    int[] nums3 = {1, 2};
    int k3 = 3;
    System.out.println("Array to rotate: " + Arrays.toString(nums3) + " by: " + k3 + " times!");
    rotate(nums3, k3);
    System.out.println("Test case 3: Rotated array: " + Arrays.toString(nums3));  // prints "Rotated array: [2, 1]"

    int[] nums4 = {1};
    int k4 = 0;
    System.out.println("Array to rotate: " + Arrays.toString(nums4) + " by: " + k4 + " times!");
    rotate(nums4, k4);
    System.out.println("Test case 4: Rotated array: " + Arrays.toString(nums4));  // prints "Rotated array: [1]"

    int[] nums5 = {1, 2, 3, 4, 5, 6};
    int k5 = 6;
    System.out.println("Array to rotate: " + Arrays.toString(nums5) + " by: " + k5 + " times!");
    rotate(nums5, k5);
    System.out.println("Test case 5: Rotated array: " + Arrays.toString(nums5));  // prints "Rotated array: [1, 2, 5, 4, 5, 6]"

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: Rotated array: [5, 6, 7, 1, 2, 3, 4]
            Test case 2: Rotated array: [3, 99, -1, -100]
            Test case 3: Rotated array: [2, 1]
            Test case 4: Rotated array: [1]
            Test case 5: Rotated array: [1, 2, 3, 4, 5, 6]
        */

  }

  public static void rotate(int[] nums, int k) {
    int size = nums.length;
    int rotations = k % size;

    int end = size - rotations - 1;
    int start = 0;
    swap(nums, start, end);

    start = size - rotations;
    end = size - 1;
    swap(nums, start, end);

    start = 0;
    end = size - 1;
    swap(nums, start, end);
  }

  public static void swap(int[] array, int start, int end) {
    while (start < end) {
      int temp = array[start];
      array[start] = array[end];
      array[end] = temp;
      start++;
      end--;
    }
  }
}

