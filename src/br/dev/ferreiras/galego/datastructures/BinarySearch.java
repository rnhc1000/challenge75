package br.dev.ferreiras.galego.datastructures;

public class BinarySearch {


  public static void main(String[] args) {
    int[] numbers = {1,2, 3,4,5,6,7,8,9,10};
    int key = 3;
    int found = stepsToFindNumber(numbers, key);
    System.out.println(found);
  }
  public static int stepsToFindNumber(int[] numbers, int numberToBeFound) {
    int steps = 0;
    int left = 0;
    int right = numbers.length-1;

    while (left < right) {

      steps+=1;
      int  middle = left + (right-left) / 2;
      if (numbers[middle] == numberToBeFound) {
        return steps;
      } else if (numbers[middle] < numberToBeFound) {
        left=middle+1;

      } else {
        right = middle;

      }
    }
    return - 1;

  }
}
