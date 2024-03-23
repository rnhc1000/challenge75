package br.dev.ferreiras.udemy.threads;

public class GreetingsThread {
  static class Greetings implements Runnable{
    public void start() {
      Thread t = new Thread(this,"threadName");
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

  public static void main(String... args){
    Greetings hello = new Greetings();
    hello.start();
    int a = 10;
     a = 1 >>> a;
  }
}
