package br.dev.ferreiras.udemy.threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadGreetings {
  public static void executeAll() {
    Thread threadOne = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.print("Hello, ");
      }
    });
    Thread threadTwo = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.print("Everybody!");
      }
    });

    List<Runnable> threads = new ArrayList<>();
    threads.add(threadOne);
    threads.add(threadTwo);

    for (Runnable task : threads) {
      ((Thread) task).start();
    }
  }
  public static void main(String[] args) {
    executeAll();
  }
}

