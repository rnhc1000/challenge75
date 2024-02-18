package br.dev.ferreiras.udemy.threads;

import java.util.List;
import java.util.ArrayList;

public class MultiExecutor {

  private List<Runnable> tasks;

  /*
   * @param tasks to executed concurrently
   */
  public MultiExecutor(List<Runnable> tasks) {

    this.tasks = tasks;

  }

  /**
   * Starts and executes all the tasks concurrently
   */
  public static void executeAll() {
    Thread threadOne = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println(Thread.currentThread().getName());
      }
    });
    threadOne.setName("Cutting carrots");
    Thread threadTwo = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println(Thread.currentThread().getName());
      }
    });
    threadTwo.setName("Cooking eggs");

    Thread threadThree = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println(Thread.currentThread().getName());
      }
    });
    threadThree.setName("Washing dishes");

    List<Runnable> threads = new ArrayList<>();
    threads.add(threadOne);
    threads.add(threadTwo);
    threads.add(threadThree);

    for (Runnable task : threads) {
      ((Thread) task).start();
    }
  }
  public static void main(String[] args) {
    executeAll();
  }
}
