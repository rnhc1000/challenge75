package LeetCode;

import java.util.*;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string by
 * deleting some (can be none) of the characters without disturbing the relative positions
 * of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * Example 1:
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * Example 2:
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 */
public class IsSubsequence {

  public static void main(String[] args) {
    String s = "abc";
    String t = "ahbgdec";
    boolean response = isSubsequence(s, t);
    if (response) {
      System.out.println("String s is a subsequence os String t");
    } else {
      System.out.println("String s is NOT a subsequence os String t");
    }
  }

  public static boolean isSubsequence(String s, String t) {
    boolean response = false;
    char[] sOne = s.toCharArray();
    char[] sTwo = t.toCharArray();
    List<Integer> index = new ArrayList<>();
    int size = sOne.length;
    int j = 0;
    if (sOne.length > sTwo.length) return false;

    Map<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < sTwo.length; i++) {
      map.put(sTwo[i], i);
    }
    while (size > 0) {
      for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        char key = sOne[j];
        if (entry.getKey() == key) {
          index.add(entry.getValue());
          break;
        }
      }
      j+=1;
      size--;
    }
    System.out.println(index);
    List<Integer> check = new ArrayList<>(index);
    Collections.sort(check);

    return check.equals(index);
  }
}
