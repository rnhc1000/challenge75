package StringToInteger;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Implement the myAtoi(string s) function, which converts a string to a
 * 32-bit signed integer (similar to C/C++'s atoi function).
 * <p>
 * The algorithm for myAtoi(string s) is as follows:
 * <p>
 * Read in and ignore any leading whitespace.
 * Check if the next character (if not already at the end of the string)
 * is '-' or '+'. Read this character in if it is either.
 * This determines if the final result is negative or positive respectively.
 * Assume the result is positive if neither is present.
 * Read in next the characters until the next non-digit character or the end
 * of the input is reached. The rest of the string is ignored.
 * Convert these digits into an integer (i.e. "123", 123, "0032", 32).};
 * <p>
 * for (int y : x {
 * ll.add(y;
 * }
 * If no digits were read, then the integer is 0.
 * Change the sign as necessary (from step 2).
 * If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
 * Return the integer as the final result.
 * Note:
 * <p>
 * Only the space character ' ' is considered a whitespace character.
 * Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 */
public class StringToInteger {
  public static void main(String[] args) {
    String s = "....___ _ words and 123456";
    int r = myAtoi(s);
    System.out.println(r);
    System.out.println(revertAtoi(r));
  }

  public static int myAtoi(String s) {
    String response = "";
    String regex = "\\+?-?[0-9]+";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(s);
    while (matcher.find()) {
      response = matcher.group();
    }
    return Integer.parseInt(response);
  }

  public static int revertAtoi(int number) {
    int remainder = 0;
    int reverse = 0;

    while (number != 0) {
      remainder = number % 10;
      reverse += remainder;
      reverse *= 10;
      number = number / 10;
    }
    return reverse / 10;
  }



}
