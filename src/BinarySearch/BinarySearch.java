package BinarySearch;
/**
 * Divide the search space into two halves by finding the middle index “mid”.
 * Compare the middle element of the search space with the key.
 * If the key is found at middle element, the process is terminated.
 * If the key is not found at middle element, choose which half will be used as the next search space.
 * If the key is smaller than the middle element, then the left side is used for next search.
 * If the key is larger than the middle element, then the right side is used for next search.
 * This process is continued until the key is found or the total search space is exhausted.
 * Generate two lists of even and odd numbers non duplicate
 * Generate a target even and a target odd
 * Iterate over both list to find out the index of each target
 * using Binary Search...
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class SearchBinary {
  public int binarySearch(List<Integer> list, int target) {
    int left = 0, right = 0, middle = 0;
    right = list.size() - 1;
    while (left <= right) {
      middle = left + (right - left) / 2;
      if (list.get(middle) == target) {
        return middle;
      }
      if (list.get(middle) < target) {
        left = middle + 1;
      } else {
        right = middle - 1;
      }
    }
    return -1;
  }

  public List<List<Integer>> numbers() {
    Random random = new Random();
    int size = random.nextInt(1, 60);
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      list.add(random.nextInt(1, 60));
    }
    List<Integer> even = list.stream().filter(x -> x % 2 == 0).sorted().toList();
    List<Integer> evenNonDuplicates = new ArrayList<>();
    for (Integer i : even) {
      if (!evenNonDuplicates.contains(i)) {
        evenNonDuplicates.add(i);
      }
    }
    List<Integer> odd = list.stream().filter(x -> x % 2 == 1).sorted().toList();
    List<Integer> oddNonDuplicates = new ArrayList<>();
    for (Integer k : odd) {
      if (!oddNonDuplicates.contains(k)) {
        oddNonDuplicates.add(k);
      }
    }
    System.out.println(evenNonDuplicates);
    System.out.println(oddNonDuplicates);
    return List.of(evenNonDuplicates, oddNonDuplicates);
  }

  public int[] target() {
    Random random = new Random();
    int targetEven = 0, targetOdd = 0;
    do {
      targetEven = random.nextInt(1, 60);
    }
    while (targetEven % 2 == 1);

    do {
      targetOdd = random.nextInt(1, 60);
    }
    while (targetOdd % 2 == 0);
    System.out.println("Target even: " + targetEven + " Target odd: " + targetOdd);
    return new int[]{targetEven, targetOdd};
  }
}
  public class BinarySearch {
    public static void main(String[] args) {
      SearchBinary searchBinary = new SearchBinary();
      List<List<Integer>> lists = searchBinary.numbers();
      int[] target = searchBinary.target();
      int[] response = new int[2];
      int i = 0;
      for (List<Integer> list : lists) {
        response[i] = searchBinary.binarySearch(list, target[i]);
        i++;
      }
      for (int num : response) {
        if (num == -1) {
          System.out.print("Number Not Found!!!\n");
        } else {
          System.out.println("\nIndex of target is: [ " + num + " ]");
        }
      }
    }
  }

