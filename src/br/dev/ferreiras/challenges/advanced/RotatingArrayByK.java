package br.dev.ferreiras.challenges.advanced;


public class RotatingArrayByK {

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int k = 3;
    int[] rotated = rotatingArray(numbers, k);
    for (int rotate : rotated) System.out.printf("%d ", rotate);
  }

  public static int[] rotatingArray(int[] numbers, int rotations) {

    int size = numbers.length;
    int currentIndex = 0;
    int normalized = rotations % size;
    int[] newArray = new int[size];
    for (int i = 0; i < size; i++) {

      currentIndex = (i + normalized) % size;

      newArray[currentIndex] = numbers[i];

    }

    return newArray;

  }
}
