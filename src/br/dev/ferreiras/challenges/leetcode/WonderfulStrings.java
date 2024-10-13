package br.dev.ferreiras.challenges.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
A wonderful string is a string where at most one letter appears an odd number of times.

For example, "ccjjc" and "abab" are wonderful, but "ab" is not.
Given a string word that consists of the first ten lowercase English letters ('a' through 'j'),
return the number of wonderful non-empty substrings in word.
If the same substring appears multiple times in word, then count each occurrence separately.

A substring is a contiguous sequence of characters in a string.



Example 1:

Input: word = "aba"
Output: 4
Explanation: The four wonderful substrings are underlined below:
- "aba" -> "a"
- "aba" -> "b"
- "aba" -> "a"
- "aba" -> "aba"
Example 2:

Input: word = "aabb"
Output: 9
Explanation: The nine wonderful substrings are underlined below:
- "aabb" -> "a"
- "aabb" -> "aa"
- "aabb" -> "aab"
- "aabb" -> "aabb"
- "aabb" -> "a"
- "aabb" -> "abb"
- "aabb" -> "b"
- "aabb" -> "bb"
- "aabb" -> "b"
Example 3:

Input: word = "he"
Output: 2
Explanation: The two wonderful substrings are underlined below:
- "he" -> "h"
- "he" -> "e"


Constraints:

1 <= word.length <= 105
word consists of lowercase English letters from 'a' to 'j'.

 */
public class WonderfulStrings {
  public static void main(String[] args) {
    String word = "aabb";
    long response = wonderfulSubstrings(word);
    System.out.println(response);
  }
  public static long wonderfulSubstrings(String word) {
    Map<Integer, Integer> count = new HashMap<>();
    count.put(0, 1);
    long result = 0;
    int bitmask = 0;

    for (char ch : word.toCharArray()) {
      int charIndex = ch - 'a';
      bitmask ^= 1 << charIndex;
      result += count.getOrDefault(bitmask, 0);
      // limite a thru j, ten positions
      for (int i = 0; i < 10; i++) {
        result += count.getOrDefault(bitmask ^ (1 << i), 0);
      }
      count.put(bitmask, count.getOrDefault(bitmask, 0) + 1);
    }

    return result;
  }
}
