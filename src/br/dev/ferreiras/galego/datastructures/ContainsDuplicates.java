package br.dev.ferreiras.galego.datastructures;

import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Given an integer array nums and an integer k, return true if there are two distinct indices i and j
in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false


Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105
 */
public class ContainsDuplicates {
  public static void main(String[] args) {
   int[] numbers = {1,2,3,1,2,3};
   int k = 2;
   boolean response = containsNearByDuplicate(numbers, k);
    System.out.println(response);
  }
  public static boolean containsNearByDuplicate(int[] numbers, int key) {

    if (numbers == null || numbers.length < 2 || key < 0 ) return false;

    int size = numbers.length;
    Map<Integer, Integer> map = new LinkedHashMap<>();

    for (int i = 0; i < size; i++) {
      if(map.containsKey(numbers[i]) && i - map.get(numbers[i]) <= key) {
        return true;
      } else {
        map.put(numbers[i], i);
      }
    }

    Map<String, String> test = new LinkedHashMap<>();
    test.put("currentTime", Instant.now().toString());
    System.out.println(test);
   return false;
  }
}
