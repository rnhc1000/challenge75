package br.dev.ferreiras.challenges.searchRotatedArray;

public class SearchSortedRotatedArray {


  public static void main(String[] args) {
    int[] nums = { 6,7,8,3,4,5};
    int target = 3;
    System.out.println(search(nums,target));

  }
  public static int search(int[] numbers, int target) {
    int leftPointer = 0;
    int rightPointer = numbers.length - 1;
    int response = 0;
    while (leftPointer <= rightPointer) {
      int middle = leftPointer + (rightPointer - leftPointer) / 2;
      if (numbers[middle] == target) return middle;
      if (numbers[leftPointer] <= numbers[middle]) { //left part is sorted
        if (numbers[leftPointer] <= target && target < numbers[middle]) {
          rightPointer = middle - 1;
        } else {
          leftPointer = middle + 1;
        }
      } else { // right part is sorted
        if (numbers[middle] < target && target < numbers[rightPointer]) {
          leftPointer = middle + 1;
        } else {
          rightPointer = middle - 1;
        }
      }
    }
    return -1;
  }
}