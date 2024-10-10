package br.dev.ferreiras.challenges.hackerrank;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryGap {

  public static void main(String[] args) {
    int number = 1024;
    int response = binaryGap(number);
    System.out.println("\nResult -> " +response);
  }
  public static int binaryGap(int number) {

    Queue<Integer> queue = new LinkedList<>();

    while (number > 0) {

      queue.add(number % 2);
      number /= 2;

    }
    int size = queue.size();
    StringBuilder sb = new StringBuilder();
    while (size > 0) {
      sb.append(queue.remove());
      size--;
    }
    String binary = sb.reverse().toString();
    int countZeroes =0, countOnes = 0;
    for (char c : binary.toCharArray()) {
      if (c == '0') countZeroes++;
      else countOnes++;
    }

    int longestSequence = 0 , currentSequence = 0;

    for (char ch : binary.toCharArray()) {

      if (ch == '0') {
        currentSequence+=1;
        longestSequence = Math.max(longestSequence, currentSequence);
      } else {
        currentSequence = 0;
      }
    }

    System.out.println(countZeroes);
    System.out.println(countOnes);
    System.out.println(binary);
    System.out.println(currentSequence);
    System.out.println(longestSequence);
    return 1;
  }
}
