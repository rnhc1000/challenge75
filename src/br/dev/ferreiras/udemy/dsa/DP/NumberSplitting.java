package br.dev.ferreiras.udemy.dsa.DP;

import java.util.Arrays;

public class NumberSplitting {

  public static void main(String[] args) {
    int number = 6;
    int response = numberSplitting(number);
    System.out.println(response);

  }
  public static int numberSplitting(int number) {

    int[] maxProduct = new int[number + 1];
    Arrays.fill(maxProduct, Integer.MIN_VALUE);
    maxProduct[1] = 0;
    maxProduct[2] = 1;
    for (int i = 3; i <= number; i++) {
      for (int j = 1; j < i -1; j++) {
        maxProduct[i] = Math.max( j * maxProduct[i-j], Math.max(j * (i - j), maxProduct[i]) );
      }
    }

    return maxProduct[number];
  }
}
