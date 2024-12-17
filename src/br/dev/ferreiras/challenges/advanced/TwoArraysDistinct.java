package br.dev.ferreiras.challenges.advanced;

import java.util.Arrays;

public class TwoArraysDistinct {


  public static void main(String[] args) {
    int[] a1 = {1, 2, 2, 6, 3, 4, 5, 6, 7, 8, 9};
    int[] a2 = {1, 3, 2, 4, 6, 8};
    int[] intersect = distinctArray(a1, a2);
    for (int num : intersect) {
      System.out.printf("%d ", num);
    }
  }

  public static int[] distinctArray(int[] a1, int[] a2) {

    return Arrays.stream(a1).distinct().filter(x -> Arrays.stream(a2).anyMatch(y -> y == x)).sorted().toArray();
  }
}
