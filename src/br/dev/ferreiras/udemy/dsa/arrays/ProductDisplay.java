package br.dev.ferreiras.udemy.dsa.arrays;

class Test {
  static void arrayDisplay(int[] a) {
    a[0] = 50;
  }
}

public class ProductDisplay {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    Test.arrayDisplay(array);
    for (int arr : array) {
      System.out.print(" " + arr);
    }

  }
}

/*
 50 2 3 4 5
 */
