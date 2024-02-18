package br.dev.ferreiras.udemy.threads;

public class RunnableInterface {
  public static void main(String[] args) {
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("We are now in " + Thread.currentThread().getName());
        System.out.println("The priority is: " + Thread.currentThread().getPriority());
      }
    });
    thread.setName("T-One");
    thread.setPriority(Thread.MAX_PRIORITY);
    System.out.println("We are in thread: " + Thread.currentThread().getName() + " before starting a new thread");
    thread.start();
    System.out.println("We are in thread: " + Thread.currentThread().getName() + " after starting a new  thread");

    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
