package br.dev.ferreiras.galego.datastructures;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] toBeSorted = {1, 2, 3,4,5};
    int[] response = bubbleSort(toBeSorted);
    System.out.println(Arrays.toString(response));
  }
  public static int[] bubbleSort(int[] numbers) {

    int size = numbers.length;
    boolean isSorted = false;
    for (int number : numbers) {
      System.out.println(Arrays.toString(numbers));
      for (int j = 0; j < size - 1; j++) {

        if(numbers[j] > numbers[j + 1]) {
          numbers[j] = numbers[j] ^ numbers[j+1];
          numbers[j+1] = numbers[j] ^ numbers[j+1];
          numbers[j] = numbers[j] ^ numbers[j + 1];
        }
      }

    }

    return numbers;
  }
}
