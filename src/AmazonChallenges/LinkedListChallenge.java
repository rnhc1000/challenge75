package AmazonChallenges;

import java.util.LinkedList;

public class LinkedListChallenge {

  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();
    int[] x = {3, 4, -7, 5, -6, 1, 3, 4, -7, 1, 1, 2, 3, 4, -7};
    for (int y : x) {
      ll.add(y);
    }
    LinkedList<Integer> response = amazonChallenge(ll);
    System.out.println(response);
  }
  public static LinkedList<Integer> amazonChallenge(LinkedList<Integer> amazon) {
    LinkedList<Integer> sumToZero = new LinkedList<>();
    System.out.println(amazon);

    int size = amazon.size();
    int left = 0;
    int right = size - 1;
    int next = 1;
    int sum = 0;
    int count = 0;
    while (right >= 0) {
      sum = amazon.get(left) + amazon.get(next);
      if (sum != 0) {
        next++;
        sum += amazon.get(next);
        count++;
      }
      if (sum == 0) {
        count++;
        while (count >= 0) {
          amazon.remove(left);
          count--;
        }
        right = amazon.size();
      }
      count = 0;
      next = 1;
      right--;
    }
    return amazon;
  }
}
