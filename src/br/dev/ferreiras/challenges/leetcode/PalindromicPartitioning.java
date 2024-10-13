package br.dev.ferreiras.challenges.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
Given a string s, partition s such that every substring of the partition is a palindrome.
Return all possible palindrome partitioning of s.

Example 1:
Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
Example 2:

Input: s = "a"
Output: [["a"]]


Constraints:

1 <= s.length <= 16
s contains only lowercase English letters.
 */
public class PalindromicPartitioning {
  public static void main(String[] args) {
    String s = "aab";
    List<List<String>> response = partition(s);
    for (List<String> list : response) {
      System.out.println(list);
    }
  }

  public static boolean isPalindrome(String s, int left, int right) {
    while (left <= right) {
      if (s.charAt(left++) != s.charAt(right--)) {
        return false;
      }
    }
    return true;
  }

  private static void backtrack(String s, int start, List<String> path, List<List<String>> result) {
    // If we've reached the end of the string, add the current partition to the result list
    if (start == s.length()) {
      result.add(new ArrayList<>(path));
      return;
    }
    // Explore all possible partitions
    for (int end = start + 1; end <= s.length(); end++) {
      // If the current substring is a palindrome, add it to the current path
      if (isPalindrome(s, start, end - 1)) {
        path.add(s.substring(start, end));
        // Recur to find other partitions
        backtrack(s, end, path, result);
        // Backtrack to explore other partitions
        path.remove(path.size() - 1);
      }
    }
  }
  public static List<List<String>> partition(String s) {
    List<List<String>> result = new ArrayList<>();
    backtrack(s, 0, new ArrayList<>(), result);
    return result;
  }
}
