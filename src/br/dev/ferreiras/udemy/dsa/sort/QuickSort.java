package br.dev.ferreiras.udemy.dsa.sort;
/**
 * This code defines a method called pivot, which is a helper function used in the Quick Sort algorithm.
 * The purpose of this method is to rearrange the elements of a given array such that all elements less
 * than the pivot are to the left of the pivot, and all elements greater than the pivot are to the right
 * of the pivot. The method takes three parameters: the input array, the pivotIndex (the index of the pivot
 * element), and the endIndex (the last index of the current subarray being processed).
 * Here's a step-by-step explanation of the code:
 * int swapIndex = pivotIndex;:
 * Initialize the swapIndex to the value of pivotIndex.
 * The swapIndex represents the boundary between elements that are smaller than the pivot and elements that
 * are greater than or equal to the pivot.
 * for (int i = pivotIndex + 1; i <= endIndex; i++):
 * Iterate through the elements in the range [pivotIndex + 1, endIndex].
 * if (array[i] < array[pivotIndex]):
 * Check if the current element array[i] is less than the pivot element array[pivotIndex].
 * If the current element is less than the pivot: a. swapIndex++;:
 * Increment the swapIndex. b. swap(array, swapIndex, i);:
 * Swap the current element array[i] with the element at the swapIndex.
 * This moves the current element to the left side of the boundary (the smaller-than-pivot side),
 * while moving the element at the swapIndex to the right side of the boundary
 * (the greater-than-or-equal-to-pivot side).
 * After the loop ends, swap(array, pivotIndex, swapIndex);:
 * Swap the pivot element with the element at the swapIndex.
 * This places the pivot element in its correct position in the sorted array.
 * return swapIndex;:
 * Return the final position of the pivot element in the array.
 * This value will be used to determine the boundaries for the next recursive
 * calls of the Quick Sort algorithm.
 */

import java.util.Arrays;

public class QuickSort {
  public static void main(String[] args) {
    int[] numbers = {4, 6, 1, 7, 3, 2, 5};
    System.out.println(Arrays.toString(numbers) + "\n");
    quickSort(numbers);
    System.out.println(Arrays.toString(numbers) + "\n");


  }

  public static void swap(int[] array, int firstIndex, int secondIndex) {
    int temp = array[firstIndex];
    array[firstIndex] = array[secondIndex];
    array[secondIndex] = temp;
  }

  public static int pivot(int[] array, int pivotIndex, int endIndex) {
    int swapIndex = pivotIndex;
    for (int i = pivotIndex + 1; i <= endIndex; i++) {
      if (array[i] < array[pivotIndex]) {
        swapIndex++;
        swap(array, swapIndex, i);
      }
    }
    swap(array, pivotIndex, swapIndex);
    return swapIndex;
  }

  public static void quickSortHelper(int[] array, int left, int right) {
    if (left < right) {
      int pivotIndex = pivot(array, left, right);
      quickSortHelper(array, left, pivotIndex - 1);
      quickSortHelper(array, pivotIndex + 1, right);
    }
  }
  public static void quickSort(int[] array) {
    quickSortHelper(array, 0, array.length-1);
  }
}
