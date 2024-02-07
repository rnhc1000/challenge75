package ferreiras.dev.br.challenges.handlingStrings;

/**
 * Given a string s, return the longest
 * palindromic substring  in s.
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 * Using Manacher's algorithm to find the longest
 * palindromic substring efficiently.
 */
public class LongestPalindromicSubString {

  public static void main(String[] args) {
    String s = "abcbb";
    System.out.println(longestPalindrome(s));
  }

    public static String longestPalindrome(String s) {
      if (s == null || s.isEmpty()) return "";


      // Transform the input string to include special characters
      StringBuilder modifiedS = new StringBuilder("#");
      for (char c : s.toCharArray()) {
        modifiedS.append(c).append("#");
      }

      System.out.println(modifiedS);


      int n = modifiedS.length();
      int[] P = new int[n]; // Array to store the length of palindromes at each position
      int C = 0; // Center of the current palindrome
      int R = 0; // Right boundary of the current palindrome

      int maxLen = 0; // Maximum length of a palindrome found
      int maxCenter = 0; // Center of the palindrome with maximum length

      for (int i = 0; i < n; i++) {
        if (i < R) {
          int mirror = 2 * C - i; // Mirror position of i
          P[i] = Math.min(R - i, P[mirror]);
        }

        // Expand around the current character
        int a = i + (1 + P[i]);
        int b = i - (1 + P[i]);
        while (a < n && b >= 0 && modifiedS.charAt(a) == modifiedS.charAt(b)) {
          P[i]++;
          a++;
          b--;
        }

        // Update the center and right boundary if needed
        if (i + P[i] > R) {
          C = i;
          R = i + P[i];
        }

        // Update the maximum length and its center
        if (P[i] > maxLen) {
          maxLen = P[i];
          maxCenter = i;
        }
      }

      int start = (maxCenter - maxLen) / 2; // Start index of the longest palindrome
      int end = start + maxLen; // End index of the longest palindrome

      return s.substring(start, end);
    }


  public static boolean isPalindrome(String s) {

    char[] c=s.toCharArray();
    int size=s.length();
    int k=size-1;
    for (int i = 0; i < size; i++) {
      if (c[i] != c[k]) {
        return false;
      } else {
        k--;
      }
    }
    return true;
  }
}
