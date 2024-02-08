package br.dev.ferreiras.udemy.dsa.heap;

/**
 * Implement a method in Java named findKthSmallest.
 * This method takes two parameters as input: an array of integers
 * nums and an integer k. The array nums can have both positive and
 * negative integers and can be of any size.
 * The integer k is guaranteed to be in the range of 1 to the length
 * of the array inclusive.
 * Your task is to find the kth smallest element in the array nums.
 * In other words, if the elements of the array were sorted in ascending order,
 * the element at the kth position (1-indexed) is the output.
 * Here's the method signature you'll be implementing:
 * public static int findKthSmallest(int[] nums, int k);
 * Input:
 * The first parameter is an array of integers, nums. The array may contain
 * duplicate elements.
 * The second parameter is an integer, k (1 ≤ k ≤ nums.length).
 * This is the position of the element to return if the array was sorted
 * in ascending order.
 * Output:
 * The function must return the kth smallest element in nums.
 * Constraints:
 * You must use a MaxHeap to solve this problem.
 * A Heap class is already provided for you, and you can use its methods
 * to add elements to the heap (insert), remove the maximum element (remove),
 * and get the current size of the heap (getHeap().size()).
 * Your solution should aim for a time complexity better than O(n log n),
 * which would be the case if you sorted the array.
 * Example:
 * Here's a quick example of what we're looking for:
 * int[] nums = {7, 10, 4, 3, 20, 15};
 * int k = 3;
 * System.out.println(findKthSmallest(nums, k));  // Output: 7
 *
 * In the above example, the kth smallest element is 7, which is the 3rd
 * smallest number in the array.
 * Note: You should consider whether your solution handles edge cases,
 * such as an array of length 1 or when all elements in the array are the same.
 */
public class KthSmallestElement {
  public static Integer findKthSmallest(int[] nums, int k) {
    int size = nums.length;
    if (size == 1) return nums[0];
    int count = 0;
    for (int i = 0; i < size-1; i++){
      if (nums[i] == nums[i+1]) {
        count++;
      }
    }
    if (count == size) return nums[0];

    Heap heap = new Heap();

    for (int i : nums) {
      heap.insert(i);
      if (heap.getHeap().size() > k) heap.remove();
    }
    int r = heap.remove();
    return r;
  }
  public static void main(String[] args) {
    // Test case 1
    int[] nums1 = {7, 10, 4, 3, 20, 15};
    int k1 = 3;
    System.out.println("Test case 1:");
    System.out.println("Expected output: 7");
    System.out.println("Actual output: " + findKthSmallest(nums1, k1));
    System.out.println();

    // Test case 2
    int[] nums2 = {2, 1, 3, 5, 6, 4};
    int k2 = 2;
    System.out.println("Test case 2:");
    System.out.println("Expected output: 2");
    System.out.println("Actual output: " + findKthSmallest(nums2, k2));
    System.out.println();

    // Test case 3
    int[] nums3 = {9, 3, 2, 11, 7, 10, 4, 5};
    int k3 = 5;
    System.out.println("Test case 3:");
    System.out.println("Expected output: 7");
    System.out.println("Actual output: " + findKthSmallest(nums3, k3));
    System.out.println();


        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1:
            Expected output: 7
            Actual output: 7

            Test case 2:
            Expected output: 2
            Actual output: 2

            Test case 3:
            Expected output: 7
            Actual output: 7

        */

  }

}
