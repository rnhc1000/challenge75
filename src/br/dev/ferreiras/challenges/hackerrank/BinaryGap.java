package br.dev.ferreiras.challenges.hackerrank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryGap {

  public static void main(String[] args) {
    int number = 1041;
    int response = binaryGap(number);
    System.out.println("\nResult-1 -> " + response);
    response = solution(number);
    System.out.println("\nResult-2 -> " + response);
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
    return longestSequence;
  }

  public static int solution(int N) {
    Deque<Integer> queue = new ArrayDeque<>();;
    StringBuilder sb = new StringBuilder();
    int countZeroes = 0;
    while(N > 0) {

      queue.push(N % 2);
      N /= 2;

    }

    int size = queue.size();
    while (size > 0) {
      sb.append(queue.pop());
      size--;
    }



    for (char ch : sb.toString().toCharArray()) {

      if (ch == '0') countZeroes++;
    }




    return countZeroes;


  }
}
