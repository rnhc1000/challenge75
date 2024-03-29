package br.dev.ferreiras.challenges.fibonacciSeries;

import java.util.List;
import java.util.stream.Stream;

/**
 * Fibonacci series is a sequence of integer numbers
 * where the next number is the sum of the two preceding numbers
 * {0,1,1,2,3,5,8,13,21,....}
 * recursion is the key here but O(2expN)...
 * Iterating over an array is O(n)...
 */
public class Fibonacci {

  public static void main(String[] args) {
    int n = 10;
    for (int i = 0; i < n; i++) {
      System.out.print(fibonacci(i) + " ");
    }
    System.out.println();
    int[] series = fibonacciSeries(n);
    for (int i : series) {
      System.out.print(i + " ");
    }
    System.out.println();
    List<Long> fibo = fibonacciStream(n);
    for (long i : fibo) {
      System.out.print( i + " ");
    }
  }

  public static List<Long> fibonacciStream(long n) {
    return Stream
            .iterate(new long[]{0L,1L}, p -> new long[]{p[1], p[0] + p[1]})
            .map(p -> p[0])
            .limit(n)
            .toList();
  }
  public static int fibonacci(int n) {
    if (n <= 1) return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static int[] fibonacciSeries(int n) {
    int[] m = {0,1};
    if (n <=2) {
      return m;
    }
    int[] series = new int[n];
    series[0] = 0;
    series[1] = 1;
    int sum=0;
    for (int i=2; i<n;i++) {
      sum = series[i-1] + series[i-2];
      series[i]=sum;
    }
    return series;
  }
}
