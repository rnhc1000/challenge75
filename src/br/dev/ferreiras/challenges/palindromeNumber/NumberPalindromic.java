package br.dev.ferreiras.challenges.palindromeNumber;

public class NumberPalindromic {

  public static void main(String[] args) {
    int n = 77577;
    System.out.println(isPalindrome(n));
  }

  public static boolean isPalindrome(int n) {

    boolean response = false;
    int number = n;
    if (number < 0) {
      return response;
    }
    int left = 0;
    long reverse = 0L;
    while (number != 0) {
      left = number % 10;
      reverse += left;
      reverse *= 10;
      number /= 10;
    }
    reverse /= 10;

    return reverse == n;
  }
}
