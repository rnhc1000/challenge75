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
  private final Counter counter;

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

class DecrementingThread implements Runnable {
  private final Counter counter;

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

    Thread one = new Thread(incrementingThread);
    Thread two = new Thread(decrementingThread);

    one.start();
    System.out.println("There are currently -> " + one.getName() + " " + counter.getItems() + " items!");

    try {
      one.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    two.start();
    System.out.println("There are currently -> " + two.getName() + " " + counter.getItems() + " items!");

    try {
      two.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    System.out.println("There are currently -> " + counter.getItems() + " items!");
  }
}
