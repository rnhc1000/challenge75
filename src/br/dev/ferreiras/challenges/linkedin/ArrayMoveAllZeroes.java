package br.dev.ferreiras.challenges.linkedin;

import java.util.*;

public class ArrayMoveAllZeroes {

  public static void main(String[] args) {
    int[] numbers = { 1,2,0,4,0,5,6,7,0};

    int[] number = moveZerosRight(numbers);

    for (int response : number) {

      System.out.printf("%d " , response);

    }
  }

  public static int[] moveZerosRight(int[] numbers) {

    int size = numbers.length;

    List<Integer> indices = new ArrayList<>();
    Queue<Integer> queue = new PriorityQueue<>();

    for (int i = 0; i < size; i++) {

      if(numbers[i] == 0) {
        indices.add(i);
      } else {
        queue.add(numbers[i]);
      }

    }
    System.out.println(queue);

    List<Integer> zeroAtRight = new LinkedList<>(queue);


    System.out.println(indices);
    for ( int index  : indices) {

      zeroAtRight.add(numbers[index]);

    }

    System.out.println(zeroAtRight);

    return zeroAtRight.stream().mapToInt(x -> x).toArray();
  }
}
