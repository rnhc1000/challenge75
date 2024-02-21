package br.dev.ferreiras.udemy.threads;


class Counter {
  private int items = 0;

  final Object lock = new Object();
  public  void  increment() {
    synchronized (this.lock) {
      items++;
    }
  }

  public  void decrement() {
    synchronized (this.lock) {
      items--;
    }
  }

  public  int getItems() {
    synchronized (this.lock) {
      return items;
    }
  }
}

class IncrementingThread extends Thread {
  private Counter counter;

  public IncrementingThread(Counter counter) {
    this.counter = counter;
  }

  @Override
  public void run() {

    for (int i = 0; i < 10000; i++) {
      counter.increment();
    }
  }
}

class DecrementingThread extends Thread {
  private Counter counter;

  public DecrementingThread(Counter counter) {
    this.counter = counter;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
      counter.decrement();
    }
  }
}

public class CountingThreads {

  public static void main(String[] args) {
    Counter counter = new Counter();
    IncrementingThread incrementingThread = new IncrementingThread(counter);

    DecrementingThread decrementingThread = new DecrementingThread(counter);
    incrementingThread.start();
    System.out.println("There are currently -> " + counter.getItems() + " items!");

    try {
      incrementingThread.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    decrementingThread.start();
    System.out.println("There are currently -> " + counter.getItems() + " items!");

    try {
      decrementingThread.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    System.out.println("There are currently -> " + counter.getItems() + " items!");
  }
}
