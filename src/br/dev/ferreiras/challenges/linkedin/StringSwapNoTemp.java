package br.dev.ferreiras.challenges.linkedin;

import java.util.ArrayDeque;
import java.util.Deque;

public class StringSwapNoTemp {

  public static void main(String[] args) {
    String one = "Ricardo";
    String two = "Ferreira";

    Deque<String> queue = new ArrayDeque<>();
    queue.push(one);
    queue.push(two);

    while (!queue.isEmpty()) {
      System.out.printf("%s %s", queue.poll(), queue.poll());
    }
  }
}
