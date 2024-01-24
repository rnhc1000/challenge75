package dailyChallenges;

/**
 * Implement integer exponentiation.
 * Can not use the naive method of  repeated multiplication
 */
public class Power {
  public static void main(String[] args) {
    int base = 2;
    int exponent = 10;
    long result = power(base, exponent);
    System.out.println(result);
    System.out.println(fib(10));
  }
  public static long power(long base, long exponent) {
    if (exponent == 0) return 1;
    return base * power(base, exponent-1);
  }

  public static int fib(int n) {
    if (n <= 2) return 1;
    return fib(n-1) + fib(n-2);
  }
}
