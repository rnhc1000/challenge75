package udemy.dsa.recursion;

public class Factorial {
  public static void main(String[] args) {
    long number = 4;
    long response = factorial(number);
    System.out.println("The factorial of " + number + " is: " + response);
  }
  public static long factorial(long number) {
    if (number == 1) return 1;
    return number * factorial(number-1);
  }
}
