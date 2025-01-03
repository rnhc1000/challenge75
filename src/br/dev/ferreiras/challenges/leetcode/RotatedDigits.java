package br.dev.ferreiras.challenges.leetcode;

/*
An integer x is a good if after rotating each digit individually by 180 degrees, we get a valid number
that is different from x. Each digit must be rotated - we cannot choose to leave it alone.


A number is valid if each digit remains a digit after rotation. For example:

0, 1, and 8 rotate to themselves,
2 and 5 rotate to each other (in this case they are rotated in a different direction, in other words,
2 or 5 gets mirrored),
6 and 9 rotate to each other, and
the rest of the numbers do not rotate to any other number and become invalid.
Given an integer n, return the number of good integers in the range [1, n].



Example 1:

Input: n = 10
Output: 4
Explanation: There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.
Example 2:

Input: n = 1
Output: 0
Example 3:

Input: n = 2
Output: 1


Constraints:

1 <= n <= 104

 */
public class RotatedDigits {
  public int rotatedDigits(int n) {
    int goodNumbers = 0;
    for (int i = 1; i <= n; i++)
      if (hasGoodNumbers(i))
        goodNumbers++;
    return goodNumbers;
  }

  public boolean hasGoodNumbers(int number) {
    boolean flag = false;
    while (number > 0) {
      int checkNumber = number % 10;
      if (checkNumber == 2 || checkNumber == 5 || checkNumber == 6 || checkNumber == 9)
        flag = true;
      if (checkNumber == 3 || checkNumber == 4 || checkNumber == 7)
        return false;
      number /= 10;
    }
    return flag;
  }
}

