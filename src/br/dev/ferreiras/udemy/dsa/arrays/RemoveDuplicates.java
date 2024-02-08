package br.dev.ferreiras.udemy.dsa.arrays;
import java.util.Arrays;
public class RemoveDuplicates {
  public static void main(String[] args) {

    int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int newLength1 = removeDuplicates(nums1);
    System.out.println("Test case 1: New length: " + newLength1);
    System.out.println("Test case 1: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, newLength1)));

    int[] nums2 = {1, 1, 2};
    int newLength2 = removeDuplicates(nums2);
    System.out.println("Test case 2: New length: " + newLength2);
    System.out.println("Test case 2: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, newLength2)));

    int[] nums3 = {-1, 0, 0, 0, 3, 3};
    int newLength3 = removeDuplicates(nums3);
    System.out.println("Test case 3: New length: " + newLength3);
    System.out.println("Test case 3: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, newLength3)));

    int[] nums4 = {};
    int newLength4 = removeDuplicates(nums4);
    System.out.println("Test case 4: New length: " + newLength4);
    System.out.println("Test case 4: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums4, 0, newLength4)));

    int[] nums5 = {1, 1, 1, 1, 1};
    int newLength5 = removeDuplicates(nums5);
    System.out.println("Test case 5: New length: " + newLength5);
    System.out.println("Test case 5: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, newLength5)));

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: New length: 5
            Test case 1: Unique values in list: [0, 1, 2, 3, 4]
            Test case 2: New length: 2
            Test case 2: Unique values in list: [1, 2]
            Test case 3: New length: 3
            Test case 3: Unique values in list: [-1, 0, 3]
            Test case 4: New length: 0
            Test case 4: Unique values in list: []
            Test case 5: New length: 1
            Test case 5: Unique values in list: [1]
        */

  }

  public static int removeDuplicates(int[] nums) {
    int size = nums.length;
    if (size == 0) return 0;
    int rightPointer = 1;

    for (int leftPointer = 1; leftPointer < size; leftPointer++) {
      if(nums[leftPointer] != nums[leftPointer-1]) {
        nums[rightPointer] = nums[leftPointer];
        rightPointer++;
      }
    }
    return rightPointer;
  }
}
