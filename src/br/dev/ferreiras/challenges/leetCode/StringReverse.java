package br.dev.ferreiras.challenges.leetCode;

/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.



Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]


Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.
 */
public class StringReverse {

  public static void main(String[] args) {
    char[] ch = { 'H', 'a', 'n', 'n', 'a', 'h' };
    reverseString(ch);
  }

  public static void reverseString(char[] s) {

    int right = s.length - 1, left = 0;

    while (left < right) {
      char c = s[right];
      s[right] = s[left];
      s[left] = c;
      left++;
      right--;
    }
    for (char c : s) {
      System.out.printf("%c ", c);
    }
  }
}
