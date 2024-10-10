package br.dev.ferreiras.udemy.review;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadDemo {


  static int counter = 10;
  static int count = 0;

  public static final Logger logger = Logger.getLogger(ThreadDemo.class.getName());

  public static void main(String[] args) {

    WorkerThread workerThread = new WorkerThread();
    Thread threadOne = new Thread(workerThread);
    threadOne.setPriority(Thread.MIN_PRIORITY);
    threadOne.start();

    ThreadWorker threadWorker = new ThreadWorker(threadOne);
    Thread threadTwo = new Thread(threadWorker);
    threadTwo.setPriority(Thread.MAX_PRIORITY);
    threadTwo.start();


    for (count = 0; count < counter; count += 1) {
      if(logger.isLoggable(Level.INFO)) {
        logger.info(String.format("Executing main thread #%d", count));
      }
    }
  }

  static class WorkerThread extends Thread {

    @Override
    public void run() {
      synchronized (WorkerThread.class) {
        for (count = 1; count < counter; count += 2) {
          if (logger.isLoggable(Level.INFO)) {
            logger.info(String.format("Executing threadOdd #%d", count));
          }
          Thread.yield();
        }
      }
    }
  }

  static class ThreadWorker implements Runnable {
    Thread thread;
    public ThreadWorker() {
    }

    public ThreadWorker(Thread thread) {
      this.thread = thread;
    }

    @Override
    public void run() {

      try {
        thread.join();
      } catch (InterruptedException ex) {
        logger.info(String.format("Interruption caused by %s", ex));
        Thread.currentThread().interrupt();
      }

      synchronized (ThreadWorker.class) {
        for (int count = 0; count < counter; count += 2) {
          if (logger.isLoggable(Level.INFO)) {
            logger.info(String.format("Executing threadEven #%d", count));
          }
        }
      }
    }
  }
}
