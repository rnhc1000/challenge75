package br.dev.ferreiras.udemy.review;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicThread {

  public static void main(String... args) {

    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("Starting thread!");
      }
    };

    Thread thread = new Thread(runnable);
    thread.start();
  }
  public static <K,V> void mapping() {

    Map<K,V> map = new HashMap<>();
  }
}

class MyRunnable implements Runnable {
  @Override
  public void run() {

    System.out.println("Thread starting...");
  }
}
