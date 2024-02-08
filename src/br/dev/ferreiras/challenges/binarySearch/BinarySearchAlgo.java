package br.dev.ferreiras.challenges.binarySearch;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchAlgo {
  public static void main(String[] args) {
    Random random = new Random();
    int size = random.nextInt(1, 20);
    int[] numbers = new int[size];
    for (int i = 0; i < size; i++) {
      numbers[i] = random.nextInt(0, 99);
    }
    Arrays.sort(numbers);

    for (int i : numbers) {
      System.out.print(" " + i);
    }
    int key = 57;
    System.out.print("\nKey picked: " + key + "\n");
    int[] response = binarySearch(numbers, key);
/*    if (response < 0) {
      System.out.println("Key Not Found!!!");
    } else {
      System.out.println("Key " + key + " is in the position: " + response);
    }
    */

    System.out.print("Value: " + response[0] + " Key: " + response[1]);

  }

  public static int[] binarySearch(int[] numbers, int keyToBeFound) {
    int[] response = {0, 0};
    int left = 0, right = 0, middle = 0;
    right = numbers.length - 1;
    while (left <= right) {
      middle = left + (right - left) / 2;
      if (numbers[middle] == keyToBeFound) {
        response[0] = numbers[middle];
        response[1] = middle;
        return response;
      } else if(numbers[middle] < keyToBeFound) {
        left=middle+1;
      } else {
        right=middle-1;
      }
    }
    return response;
  }

  public static int binarySearchAlgo(int[] numbers, int key) {
    int size = numbers.length;
    int low = 0, middle = 0, high = 0;
    low = 0;
    high = size - 1;
    middle = low + (high - low) / 2;
    if (key == numbers[middle]) return middle;
    if (key > numbers[middle]) {
      low = middle + 1;
      middle = low + (high - low) / 2;
      for (int i = low; i < size; i++) {
        if (key == numbers[i]) {
          return i;
        }
      }
    } else {
      high = middle - 1;
      for (int i = 0; i < high; i++) {
        middle = high / 2;
        if (key == numbers[i]) {
          return i;
        }
      }
    }
    return -1;
  }
}
