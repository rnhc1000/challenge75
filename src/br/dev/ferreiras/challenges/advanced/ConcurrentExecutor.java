package br.dev.ferreiras.challenges.advanced;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentExecutor {

  public static void main(String[] args) {

    try {
      ExecutorService executor = Executors.newCachedThreadPool();

      for (int i = 0; i < 3; i++) {
        executor.execute( () ->
            System.out.println(Thread.currentThread().getName()));
      }
    } catch(Exception ex) {

      throw new SecurityException("Exception triggered!");

    }

  }
}
