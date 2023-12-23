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
    /*
//    String s = ".             +42words  .___";
    String s = "words and 123456";
    int r = myAtoi(s);
    //int t = Integer.parseInt(r);
    System.out.println(r);
    System.out.println(revertAtoi(r));
    int[] employees = {10, 40, 200, 1000, 60, 30};
    int[] bonus = atlasianChallenge(employees);
    System.out.println(Arrays.toString(bonus));
    */
    LinkedList<Integer> ll = new LinkedList<>();
    int[] x = {3, 4, -7, 5, -6, 1, 3, 4, -7, 1, 1, 2, 3, 4, -7};
    for (int y : x) {
      ll.add(y);
    }
    LinkedList<Integer> response = amazonChallenge(ll);
    System.out.println(response);
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

  public static int[] atlasianChallenge(int[] linesOfCode) {
    int[] bonus = new int[linesOfCode.length];
    int size = linesOfCode.length;
    for (int j = 0; j < size; j++) {
      if (linesOfCode[j] >= 10 && linesOfCode[j] <= 39) {
        bonus[j] = 1;
      } else if (linesOfCode[j] >= 40 && linesOfCode[j] <= 199) {
        bonus[j] = 2;
      } else if (linesOfCode[j] >= 200 && linesOfCode[j] <= 999) {
        bonus[j] = 3;
      } else {
        bonus[j] = 4;
      }
    }
    return bonus;
  }

  public static LinkedList<Integer> amazonChallenge(LinkedList<Integer> amazon) {
    LinkedList<Integer> sumToZero = new LinkedList<>();
    System.out.println(amazon);

    int size = amazon.size();
    int left = 0;
    int right = size - 1;
    int next = 1;
    int sum = 0;
    int count = 0;
    while (right >= 0) {
      sum = amazon.get(left) + amazon.get(next);
      if (sum != 0) {
        next++;
        sum += amazon.get(next);
        count++;
      }
      if (sum == 0) {
        count++;
        while (count >= 0) {
          amazon.remove(left);
          count--;
        }
        right = amazon.size();
      }
      count = 0;
      next = 1;
      right--;
    }
    return amazon;
  }
}
