package br.dev.ferreiras.challenges.reverseInteger;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer
 * range [-231, 231 - 1], then return 0.
 */

class IntegerReverse {
  public int revertInteger(int number) {
    boolean flag = number < 0;
    boolean integerMinValue = false;
    if (flag) number = Math.abs(number);
    if (number == Integer.MIN_VALUE ) integerMinValue=true;
    String prepareNumber = String.valueOf(number);
    prepareNumber = Integer.toString(number);
    char[] digits = prepareNumber.toCharArray();
    int lenOfDigits = digits.length;
    int right = lenOfDigits - 1;
    char[] reverse = new char[lenOfDigits];
    for (int left = 0; left < lenOfDigits; left++) {
      reverse[left] = digits[right];
      right--;
    }
    StringBuilder sb = new StringBuilder();

    for (char c : reverse) {
      sb.append(c);
    }

    if (integerMinValue) {
      int index=sb.indexOf("-");
      sb.deleteCharAt(index);
    }

    long response = Long.parseLong(sb.toString());
    if (flag) {
      response*=(-1);
    }

    if ((response > Integer.MAX_VALUE) || (response < Integer.MIN_VALUE)) {
      return 0;
    } else return (int) response;
  }

  public int integerReverted(int number) {
    int lastDigit=0;
    long finalNumber=0;
    while (number != 0) {
      lastDigit = number % 10;
      finalNumber+=lastDigit;
      finalNumber*=10;
      number/=10;
    }
    finalNumber/=10;
    if ((finalNumber > Integer.MAX_VALUE) || (finalNumber < Integer.MIN_VALUE)) {
      return 0;
    } else return (int) finalNumber;
  }
}

public class ReverseInteger {

  public static void main(String[] args) {
    int n = -1957;
    IntegerReverse integerReverse = new IntegerReverse();
    int r = integerReverse.integerReverted(n);
    System.out.println(r);
  }
}
