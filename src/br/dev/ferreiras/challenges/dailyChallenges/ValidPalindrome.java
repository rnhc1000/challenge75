package br.dev.ferreiras.challenges.dailyChallenges;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters and removing all non-alphanumeric characters, it reads
 * the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * Example 3:
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 */
public class ValidPalindrome {
  public static void main(String[] args) {
    String s = " A man, a plan, _a canal: Panama ";

    boolean response = isPalindrome(s);
    System.out.println(response);


  }
  public static boolean isPalindrome(String s) {
    s = s.toLowerCase();
    String regex = "[^a-zA-Z0-9]";
    String x = s.replaceAll(regex,"");
    System.out.println(x);
    char[] c = x.toCharArray();
    int right = c.length-1;
    for (int left = 0; left < c.length; left++) {
      if(c[left] != c[right] ){
        return false;
      }
      right--;
    }
  return true;
  }
}
