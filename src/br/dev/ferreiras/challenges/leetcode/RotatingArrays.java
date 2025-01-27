package br.dev.ferreiras.challenges.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotatingArrays {

  public static void main(String[] args) {
    String[] strings = {"Ricardo", "Alves", "Ferreira", "Silva"};
    int[] numbers = {3, 8, 9, 7, 6};
    int k = 3;
    String[] responseOne = rotatingArrays(strings, k);
    int[] responseTwo = rotatingArraysRight(numbers, k);
    System.out.println(Arrays.toString(responseOne));
    System.out.println(Arrays.toString(responseTwo));

  }

  public static String[] rotatingArrays(String[] strings, int k) {

    int currentIndex = 0;
    int size = strings.length;

    String[] rotate = new String[size];
    int index = 0;

    List<String> temp = new ArrayList<>();
    for (int i = 0; i < size; i++) {

      currentIndex = (i + k) % size;
      System.out.println(currentIndex);
      temp.add(strings[currentIndex]);
    }


    for (String s : temp) {
      System.out.print(s + " ");
    }
    //System.out.println(Arrays.toString(rotate));

    return temp.toArray(new String[0]);
  }

  public static int[] rotatingArraysRight(int[] numbers, int k) {


    int currentIndex = 0;
    int size = numbers.length;

    if (size == 0 || k % size == 0) return numbers;

    int rotations = k % size; // normalize number of rotations
    long start = System.currentTimeMillis();
    List<Integer> temp = new ArrayList<>();
    for (int i = 0; i < size; i++) {

      currentIndex = (i + rotations) % size;
      System.out.println(currentIndex);
      temp.add(numbers[currentIndex]);

    }


    for (Integer s : temp) {
      System.out.print(s + " ");
    }
    //System.out.println(Arrays.toString(rotate));
    long end = System.currentTimeMillis();
    long diff = end - start;
    System.out.println("\n" + diff + " ms");
    return temp.stream().mapToInt(x -> x).toArray();
  }
}
