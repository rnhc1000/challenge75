package br.dev.ferreiras.udemy.review;

import java.util.logging.Logger;

public class ThreadDemo {


  static int counter = 10;
  static int count = 0;

  public static Logger logger = Logger.getLogger(ThreadDemo.class.getName());
  public static void main(String[] args) {

    WorkerThread workerThread = new WorkerThread();
    Thread threadOne = new Thread(workerThread);
    threadOne.setPriority(Thread.MIN_PRIORITY);
    threadOne.start();

    ThreadWorker threadWorker = new ThreadWorker(threadOne);
    Thread threadTwo = new Thread(threadWorker);
    threadTwo.setPriority(Thread.MAX_PRIORITY);
    threadTwo.start();


    for (count = 0; count < counter; count+=1) {
      logger.info(String.format("Executing main thread #%d", count));
    }
  }

   static class WorkerThread extends Thread {

    public void run() {
      synchronized (WorkerThread.class) {
        for (count = 1; count < counter; count += 2) {
          logger.info(String.format("Executing threadOdd #%d", count));
          Thread.yield();
        }
      }
    }
  }

   static class ThreadWorker implements Runnable {

    Thread t;
    public ThreadWorker() {}
    public ThreadWorker(Thread t) {
      this.t = t;
    }
    @Override
    public void run() {

      try {
        t.join();
      } catch (InterruptedException ex) {
        logger.info(String.format("Interruption caused by %s", ex));
      }

      synchronized (ThreadWorker.class) {
        for (int count = 0; count < counter; count += 2) {
          logger.info(String.format("Executing threadEven #%d", count));
        }
      }
    }
  }
}
