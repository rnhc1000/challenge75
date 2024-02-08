package br.dev.ferreiras.udemy.dsa.advanced.recursion;

/**
 * Recursion optimization in Java
 * In the previous lecture we talked about the crucial differences between head recursion and tail recursion.
 *
 * tail recursion is very similar to iteration - and usually it is transformed into an iteration
 *
 * head recursion is a bit more complex because the function calls must be tracked - this is why these function calls are pushed onto the stack (call-stack)
 *
 * BUT JAVA DOES NOT OPTIMIZE TAIL RECURSION !!!
 *
 * Current mainstream C++ compilers perform tail call optimization. But on the other hand, Java does not
 * support tail recursion optimization.
 * An important question is WHY IS IT POSSIBLE TO USE TAIL RECURSION OPTIMIZATION?
 * Because there is a fundamental difference between head recursion and tail recursion.
 * tail recursion related function calls (and the stack frames) do not depend on each other
 * - there is no so-called "downward dependence" in the stack memory regarding the stack frames
 * head recursion related function calls DO depend on each other - they use values returned from
 * other function calls
 * This is exactly why we can optimize tail recursion because the function calls and stack frames
 * are totally independent of each other.
 * tail recursion, used by C++ compilers
 * At the stack we have
 * acc = 24
 * n = 1, acc = 24
 * n = 2, acc = 12
 * n = 3, acc = 4
 * n = 4, acc = 1
 */
public class RecursionTypes {

  public static void main(String[] args) {
    int n = 4;
    int acc  = 1;
    int response = headFatorial(n);
    System.out.println(response);
//    response = factorial(4);
//    System.out.println(response);
  }
  public static int fatorial(int n, int accumulator) {

    if (n == 1) {
      return accumulator;
    }
    return fatorial(n-1, n * accumulator);
  }

  public static int factorial(int n) {
    if (n == 1) {
      return n;
    }
    return n * factorial(n-1);
  }

  public static int headFatorial(int n) {
    if ( n == 1) return 1;

    int result =  headFatorial(n-1);

    return result * n;

  }
}
