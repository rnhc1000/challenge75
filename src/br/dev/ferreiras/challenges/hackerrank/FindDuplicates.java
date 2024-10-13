package br.dev.ferreiras.challenges.hackerrank;
/*
Floyd's Tortoise and Hare algo
slow and fast pointers
 */
public class FindDuplicates {

  public static void main(String[] args) {
    int[] numbers = {1,2,3,4,5,6,7,8,1,12, 13, 14, 15,17, 26, 32, 13};
    int duplicate = findDuplicate(numbers);
    System.out.println(duplicate);
  }

  public static int findDuplicate(int[] numbers) {

    long start = System.currentTimeMillis();
    int slowPointer = numbers[0];
    int fastPointer = numbers[0];

    do {
      slowPointer = numbers[slowPointer];
      fastPointer = numbers[numbers[fastPointer]];
    } while (slowPointer != fastPointer);

    slowPointer = numbers[0];

    while (slowPointer != fastPointer) {

      slowPointer = numbers[slowPointer];
      fastPointer = numbers[fastPointer];

    }
    long end = System.currentTimeMillis();
    System.out.println("Time -> " + (end - start) / 1000 + " ms");
  return slowPointer;
  }
}
