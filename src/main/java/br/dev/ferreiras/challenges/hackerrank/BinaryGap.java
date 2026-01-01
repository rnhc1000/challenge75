package br.dev.ferreiras.challenges.hackerrank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryGap {

  public static void main(String[] args) {
    int number = 1041;
    int response = largestGap(number);
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
    Deque<Integer> queue = new ArrayDeque<>();
    StringBuilder sb = new StringBuilder();
    while(N > 0) {
      queue.push(N % 2);
      N /= 2;
    }

    boolean gap = false;
    int maxGap = 0;
    int currentGap = 0;
    int size = queue.size();
    while (size > 0) {
      sb.append(queue.pop());
      size--;
    }

    String binary = sb.reverse().toString();

    for (int i = 0; i < binary.length(); i++) {

      if (binary.charAt(i) == '1') {
        if(gap) {
          maxGap = Math.max(maxGap, currentGap);
          currentGap = 0;
        }
        gap = true;
      } else if(gap) {
        currentGap++;
      }
    }

    return maxGap;
  }

  public static int largestGap(int number) {

    String binary = Integer.toBinaryString(number);
    boolean gap = false;
    int maxGap = 0;
    int currentGap = 0;

    for (int i=0; i<binary.length(); i++) {
      if(binary.charAt(i) == '1') {

        if(gap) {
          maxGap = Math.max(currentGap, maxGap);
          currentGap=0;
        }
        gap = true;
      }else if (gap) {
        currentGap++;
      }
    }

    return maxGap;
  }
}

/*
        for (int i = 0; i < binary.length(); i++) {
            // If the character is '1'
            if (binary.charAt(i) == '1') {
                // If we were counting a gap, check if it's the longest one found so far
                if (counting) {
                    maxGap = Math.max(maxGap, currentGap);
                    currentGap = 0; // Reset current gap
                }
                counting = true; // Start counting for the next gap
            } else if (counting) {
                // If the character is '0' and we are inside a gap
                currentGap++;
            }
        }
 */