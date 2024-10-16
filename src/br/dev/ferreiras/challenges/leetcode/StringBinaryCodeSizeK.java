package br.dev.ferreiras.challenges.leetcode;

import java.util.HashSet;
import java.util.Set;

/*
Given a binary string s and an integer k, return true if every binary code of length k is a substring of s.
Otherwise, return false.



Example 1:

Input: s = "00110110", k = 2
Output: true
Explanation:
The binary codes of length 2 are "00", "01", "10" and "11".
They can be all found as substrings at indices 0, 1, 3 and 2 respectively.
Example 2:

Input: s = "0110", k = 1
Output: true
Explanation:
The binary codes of length 1 are "0" and "1", it is clear that both exist as a substring.
Example 3:

Input: s = "0110", k = 2
Output: false
Explanation:
The binary code "00" is of length 2 and does not exist in the array.


Constraints:

1 <= s.length <= 5 * 105
s[i] is either '0' or '1'.
1 <= k <= 20

just check whether the substrings can make values in decimal from 0 to 2^k
 */
public class StringBinaryCodeSizeK {

  public static void main(String[] args) {
    String s = "00110110";
    int k = 2;
    boolean response = hasAllCodes(s,k);
    System.out.println(response);
  }

  public static boolean hasAllCodes(String s, int k) {


    Set<String> set = new HashSet<>();
    for (int i = k; i <= s.length(); i++) {
      set.add(s.substring(i-k, i));
    }

    return set.size() == Math.pow(2, k);
  }
}
