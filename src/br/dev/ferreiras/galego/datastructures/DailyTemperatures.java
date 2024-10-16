package br.dev.ferreiras.galego.datastructures;

import java.util.*;

public class DailyTemperatures {
  public static void main(String[] args) {
    int[] temperatures = { 73,74,75,71,69,72,76,73};
    int[] response = dailyTemperatures(temperatures);
    System.out.println(Arrays.toString(response));
  }

  public static int[] dailyTemperatures(int[] temperatures) {
   int[] list = new int[temperatures.length];
   Deque<Integer> deque = new ArrayDeque<>();
    System.out.println(deque);
   deque.push(1);
   int size = temperatures.length;
    for (int i = 0; i < size; i++) {
      while(!deque.isEmpty() && temperatures[deque.peek()] < temperatures[i]) {
        int temp = deque.pop();
        list[temp] = (i - temp);
      }
      deque.push(i);

    }
    return list;
  }
}
