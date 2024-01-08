package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 * answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
 * answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
 * Note that the integers in the lists may be returned in any order.
 * Example 1:
 * Input: nums1 = [1,2,3], nums2 = [2,4,6]
 * Output: [[1,3],[4,6]]
 * Explanation:
 * For nums1, nums1[1] = 2 is present at index 0 of nums2,
 * whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2.
 * Therefore, answer[0] = [1,3].
 * For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas
 * nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
 * Example 2:
 * Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
 * Output: [[3],[]]
 * Explanation:
 * For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3],
 * their value is only included once and answer[0] = [3].
 * Every integer in nums2 is present in nums1. Therefore, answer[1] = [].
 */
public class ArraysDifference {
  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 4};
    int[] nums2 = {1, 4, 5, 6};
    List<List<Integer>> response = findDifference(nums1, nums2);
    for (List<Integer> list : response) {
      System.out.println(list);
    }
  }

  public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    List<List<Integer>> lists = new ArrayList<>();
    Set<Integer> setOne = new HashSet<>();
    Set<Integer> setTwo = new HashSet<>();
    int sizeOne = nums1.length;
    int sizeTwo = nums2.length;
    int i = 0;
    while (sizeOne > 0 && sizeTwo > 0) {
      if (nums1[i] != nums2[i] && !setOne.contains(nums1[i]) && !setTwo.contains(nums2[i])) {
        setOne.add(nums1[i]);
        setTwo.add(nums2[i]);
      }
      i++;
      sizeOne--;
      sizeTwo--;
    }
    List<Integer> listOne = new ArrayList<>(setOne);
    List<Integer> listTwo = new ArrayList<>(setTwo);
    lists.add(listOne);
    lists.add(listTwo);
    return lists;
  }
}

