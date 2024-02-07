package ferreiras.dev.br.udemy.dsa.sort;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] nums = {2, 4, 5, 1, 9, 6};
//    System.out.println(arraysOne.toString(nums));
//    bubbleSort(nums);
//    System.out.println(arraysOne.toString(nums));
    nums = new int[]{23, 56, 11, 12, 100};
    selectionSort(nums);
    System.out.println(Arrays.toString(nums));
//    System.out.println("# ------");
//    nums = new int[]{4, 2, 6, 1, 5, 3};
//    insertionSort(nums);
//    System.out.println(arraysOne.toString(nums));

  }

  public static void bubbleSort(int[] array) {
    int size = array.length;
    for (int i = size - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }

  public static void selectionSort(int[] array) {
    int size = array.length;
    int[] base = Arrays.copyOf(array,size);
//    System.arraycopy(array, 0, base,0, size);;
    for (int i = 0; i < size; i++) {
      int minIndex = i;
      for (int j = i + 1; j < size; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }
      if (i != minIndex) {
        int temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
      }
    }
    System.out.println(Arrays.toString(base));
  }

  public static void insertionSort(int[] nums) {
    int size = nums.length;
    for (int i = 1; i < size; i++) {
      int temp = nums[i];
      int previous = i - 1;
      while (previous > -1 && temp < nums[previous]) {
        nums[previous+1] = nums[previous];
        nums[previous] = temp;
        previous--;
      }
    }
  }

}
