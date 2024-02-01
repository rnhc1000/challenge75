package udemy.dsa.fibonacci;
/**
 * Fibonacci series with no recursion...
 */

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Fibonacci {
  public static void main(String[] args) {
    System.out.print("Input the length of the Fibonacci sequence: ");
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    long start = System.currentTimeMillis();
    List<Integer> fibonacci = Stream.iterate(new int[]{0,1}, p -> new int[]{p[1],p[0]+p[1]})
            .map(p->p[0])
            .limit(size)
            .toList();
    for (Integer i : fibonacci) {
      System.out.print(" " + i);
    }
    input.close();
    long end = System.currentTimeMillis();
    System.out.println("\nTotal: " + (end-start) + " ms");
  }
}
