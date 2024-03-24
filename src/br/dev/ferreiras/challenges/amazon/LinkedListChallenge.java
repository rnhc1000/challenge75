package br.dev.ferreiras.challenges.amazon;
/**
 * Remove n elements of an array that sums to zero and
 * return an array with the values that do not sum up to zero.
 * Input:
 * int[] x = {3, 4, -7, 5, -6, 1, 3, 4, -7, 1, 1, 2, 3, 4, -7};
 * Output:
 * int[] y = { 1, 1, 2, 3, 4, -7}
 */

import java.util.LinkedList;

public class LinkedListChallenge {

  public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    int[] numbers = {3, 4, -7, 5, -6, 1, 3, 4, -7, 1, 1, 2, 3, 4, -7};
    for (int number : numbers) {
      linkedList.add(number);
    }
    System.out.println(linkedList);
    LinkedList<Integer> response = amazonChallenge(linkedList);
    System.out.println(response);
  }

  public static LinkedList<Integer> amazonChallenge(LinkedList<Integer> amazon) {
    LinkedList<Integer> sumToZero = new LinkedList<>();
    int size = amazon.size();
    int left = 0, right = size - 1;
    int next = 1, sum = 0, count = 1;

    for (Integer element : amazon) {
      sum+=element;
      while (right >= 0) {

        if (sum == 0) {

          while (count > 0) {
            sumToZero.add(amazon.get(left));
            left++;
            count--;
          }

        } else {
          next++;
          count++;
          sum += amazon.get(next);
        }
        right--;
        left++;
      }
    }
    return sumToZero;
  }
}
