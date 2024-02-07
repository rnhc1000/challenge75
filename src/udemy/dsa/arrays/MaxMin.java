package udemy.dsa.arrays;

/**
 * In this problem, you are given an array of integers, and the task is to write a method
 * that finds the maximum and minimum numbers in the array.
 *
 * The method should return these two numbers as an array with the maximum number at the
 * first index and the minimum number at the second index.
 * Method Signature
 * public static int[] findMaxMin(int[] myList)
 * This method accepts an integer array myList as the input and returns an integer array of size two.
 * Example:
 * Input: myList = [5, 3, 8, 1, 6, 9]
 * Output: [9, 1]
 * The function should iterate through the array to find the maximum and minimum numbers.
 * In this case, the maximum number is 9, and the minimum number is 1.
 * Hence, the method should return [9, 1].
 * Additional Notes
 * The main method provides some test cases to check the solution's correctness.
 * It is important to note that the method should work correctly with negative numbers and zeros.
 * Also, if the array contains duplicate numbers, the function should still be able to correctly
 * identify the maximum and minimum numbers.
 */

import java.util.Arrays;
public class MaxMin {

  public static void main(String[] args) {
    int[] myList1 = {5, 3, 8, 1, 6, 9};
    int[] result1 = findMaxMin(myList1);
    System.out.println("Test case 1: MaxMin: " + Arrays.toString(result1)); // prints "[9, 1]"

    int[] myList2 = {-5, -3, -8, -1, -6, -9};
    int[] result2 = findMaxMin(myList2);
    System.out.println("Test case 2: MaxMin: " + Arrays.toString(result2)); // prints "[-1, -9]"

    int[] myList3 = {0, 0, 0, 0, 0};
    int[] result3 = findMaxMin(myList3);
    System.out.println("Test case 3: MaxMin: " + Arrays.toString(result3)); // prints "[0, 0]"

    int[] myList4 = {100, 200, 300, 400, 500};
    int[] result4 = findMaxMin(myList4);
    System.out.println("Test case 4: MaxMin: " + Arrays.toString(result4)); // prints "[500, 100]"

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: MaxMin: [9, 1]
            Test case 2: MaxMin: [-1, -9]
            Test case 3: MaxMin: [0, 0]
            Test case 4: MaxMin: [500, 100]
        */

  }

  public static int[] findMaxMin(int[] myList) {
    int[] response = new int[2];
    int max = Integer.MIN_VALUE;
    int min = myList[0];

    for (int number : myList) {
      if (number > max) {
        max = number;
      } else if (number < min){
        min = number;
      }
    }
    response[0] = max;
    response[1] = min;
    return new int[] {max, min};
  }
}
