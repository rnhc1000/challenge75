package br.dev.ferreiras.challenges.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Run-length encoding is a string compression method that works by replacing consecutive identical
characters (repeated 2 or more times) with the concatenation of the character and the number
marking the count of the characters (length of the run).
For example, to compress the string "aabccc" we replace "aa" by "a2" and replace "ccc" by "c3".
Thus the compressed string becomes "a2bc3".

Notice that in this problem, we are not adding '1' after single characters.

Given a string s and an integer k. You need to delete at most k characters from s such that the run-length
encoded version of s has minimum length.

Find the minimum length of the run-length encoded version of s after deleting at most k characters.



Example 1:

Input: s = "aaabcccd", k = 2
Output: 4
Explanation: Compressing s without deleting anything will give us "a3bc3d" of length 6. Deleting any of the characters 'a' or 'c' would at most decrease the length of the compressed string to 5, for instance delete 2 'a' then we will have s = "abcccd" which compressed is abc3d. Therefore, the optimal way is to delete 'b' and 'd', then the compressed version of s will be "a3c3" of length 4.
Example 2:

Input: s = "aabbaa", k = 2
Output: 2
Explanation: If we delete both 'b' characters, the resulting compressed string would be "a4" of length 2.
Example 3:

Input: s = "aaaaaaaaaaa", k = 0
Output: 3
Explanation: Since k is zero, we cannot delete anything. The compressed string is "a11" of length 3.


Constraints:

1 <= s.length <= 100
0 <= k <= s.length
s contains only lowercase English letters
 */
public class StringCompressionTwo {
  public static void main(String[] args) {

    String s = "aaaaaaaaa";
    int k = 0;
    //Output: 4

    int response = getLengthOfOptimalCompression(s, k);
    System.out.println(response);
  }

  public static int  getLengthOfOptimalCompression(String s, int k) {
    int stringSize = s.length();
    int[][] dp = new int[100][100];
    for (int i = 0; i <= stringSize; i++)
      for (int j = 0; j <= stringSize; j++)
        dp[i][j] = Integer.MAX_VALUE;
    dp[0][0] = 0;

    for (int i = 1; i <= stringSize; i++) {
      for (int j = 0; j <= k; j++) {
        int cnt = 0, del = 0;
        for (int l = i; l >= 1; l--) {
          if (s.charAt(l - 1) == s.charAt(i - 1))
            cnt++;
          else
            del++;

          if (j - del >= 0) {
            dp[i][j] = Math.min(
                    dp[i][j],
                    dp[l - 1][j - del] + 1 + (cnt >= 100 ? 3 : cnt >= 10 ? 2 : cnt >= 2 ? 1 : 0)
            );
          }
        }
        if (j > 0)
          dp[i][j] = Math.min(
                  dp[i][j],
                  dp[i - 1][j - 1]
          );
      }
    }
    return dp[stringSize][k];
  }
  public static int lengthOfOptimalCompression(String s, int k) {

    Map<Character, Integer> map = new LinkedHashMap<>();
    char[] ch = s.toCharArray();
    for (char c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c,0) + 1);
    }

    StringBuilder sb = new StringBuilder();
    for(Map.Entry<Character, Integer> entryMap : map.entrySet()) {
      while (k > 0) {
        if (entryMap.getValue() > 1) {
          sb.append(entryMap.getKey()).append(entryMap.getValue());
        }
        k--;
      }

    }
    System.out.println(map);
    System.out.println(sb.toString());




    return sb.toString().length();
  }
}
