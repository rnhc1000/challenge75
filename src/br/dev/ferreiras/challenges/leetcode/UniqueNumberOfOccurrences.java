package br.dev.ferreiras.challenges.leetcode;

import java.util.*;

/**
 * Given an array of integers arr, return true if the number of occurrences
 * of each value in the array is unique or false otherwise.
 * Example 1:
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1.
 * No two values have the same number of occurrences.
 * Example 2:
 * Input: arr = [1,2]
 * Output: false
 * Example 3:
 * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * Output: true
 * Constraints:
 * 1 <= arr.length <= 1000
 * -1000 <= arr[i] <= 1000
 */
public class UniqueNumberOfOccurrences {
  public static void main(String[] args) {
    int[] nums = {-3,0,1,-3,1,1,1,-3,10,0};
    boolean response = uniqueOccurrences(nums);
    if (response) {
      System.out.println(response);
    } else {
      System.out.println(response);
    }
  }

  public static boolean uniqueOccurrences(int[] arr) {
    boolean response = false;
    Map<Integer, Integer> map = new HashMap<>();

    for (int num : arr) {
      if (map.containsKey(num)) {
        map.put(num, map.getOrDefault(num, 0) + 1);
      } else {
        map.put(num, 1);
      }
    }
    int sizeOfValues = map.values().size();
    Set<Integer> set = new HashSet<>(map.values());
    return sizeOfValues == set.size();
  }
}
