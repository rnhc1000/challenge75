package br.dev.ferreiras.challenges.leetCode;

import java.util.LinkedList;
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

  public static boolean isPalindrome(String s, int left, int right) {
    while (left <= right) {
      if (s.charAt(left) != s.charAt(right)) {
        return false;
      } else {
        left++;
        right--;
      }
    }
    return true;
  }

  public List<List<String>> partition(String s) {
    List<List<String>> lists = new LinkedList<>();

    char[] ch = s.toCharArray();
    List<String> list = new LinkedList<>();

    int upper = ch.length - 1;
    for (char c : ch) {
      list.add(String.valueOf(c));
    }

    lists.add(list);

    return lists;
  }
}
