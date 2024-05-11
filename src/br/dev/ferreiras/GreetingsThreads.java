package br.dev.ferreiras;
public class GreetingsThreads {
  static class Greetings implements Runnable {
    public void start() {
      Thread t = new Thread(this, "threadName");
      t.start();
    }

    @Override
    public void run() {
      System.out.print("Hello, ");
      try {
        Thread.sleep(1000);
        System.out.print("Everybody!");
      } catch (InterruptedException e) {
        throw new RuntimeException();
      }
    }
  }

  public static void main(String[] args) {
    Greetings hi = new Greetings();
    hi.start();
  }
}
