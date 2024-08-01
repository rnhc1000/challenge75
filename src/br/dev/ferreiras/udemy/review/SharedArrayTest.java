package br.dev.ferreiras.udemy.review;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest {
  public static void main(String[] args) {

    SimpleArray sharedSimpleArray = new SimpleArray(6);

    ArrayWriter writerOne = new ArrayWriter(1, sharedSimpleArray);
    ArrayWriter writerTwo = new ArrayWriter(11, sharedSimpleArray);

    ExecutorService executor = Executors.newCachedThreadPool();
    executor.execute(writerOne);
    executor.execute(writerTwo);

    executor.shutdown();

    try {
      boolean tasksEnded = executor.awaitTermination(1, TimeUnit.MINUTES);
      if (tasksEnded) {
        System.out.println(sharedSimpleArray);
      } else {
        System.out.println("Interrupted while waiting the tasks to finish");
      }
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }

    System.out.println(Runtime.getRuntime().availableProcessors());

    ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());

  }
}
