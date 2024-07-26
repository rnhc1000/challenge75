package br.dev.ferreiras.challenges.dataStructures;

import java.util.Arrays;

/*
Bubble sort
O(n2)
 */
public class ArraySortBubble {
  public static void main(String[] args) {
    int[] numbers = {3, 5, 1, 9, 8, 2, 4, 7, 6};
    int[] response = bubbleSort(numbers);
    System.out.println(Arrays.toString(numbers));

  }

  public static int[] bubbleSort(int[] array) {

    int size = array.length;
    int countInner = 0, countOuter = 0;

    for (int i = size - 1; i >= 0; i--) {
      for (int j = 0; j < i; j++) {
        if (array[j + 1] < array[j]) {
          array[j] =     array[j]     ^     array[j + 1];
          array[j + 1] = array[j + 1] ^     array[j];
          array[j] =     array[j]     ^     array[j + 1];
        }
        countInner++;
      }
      System.out.print(" " + countInner);
      countInner = 0;
      countOuter++;

    }
    System.out.print("\n" + " " + countOuter + "\n");
    return array;
  }
}
