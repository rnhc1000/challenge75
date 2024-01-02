package BinarySearch;

import java.util.Random;
import java.util.Arrays;

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
    int key = 12;
    System.out.print("\nKey picked: " + key+ "\n");
    int response = binarySearchAlgo(numbers, key);
    if (response < 0) {
      System.out.println("Key Not Found!!!");
    } else {
      System.out.println("Key " + key + " is in the position: " + response);
    }
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
