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

  public static void execute() throws InterruptedException {

    Thread threadOne = new Thread(() -> {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      Thread.currentThread().setName("thread-hello");
      Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
      System.out.print("Hello, ");
    });

    Thread threadTwo = new Thread(() -> {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      Thread.currentThread().setName("thread-everybody");
      Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
      System.out.print("Everybody!!!");
    });

    threadOne.start();
    threadOne.join();
    threadTwo.start();

  }
  public static void main(String... args) throws InterruptedException {
    execute();
  }
}

