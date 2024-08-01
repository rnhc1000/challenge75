package br.dev.ferreiras.udemy.dsa.advancedThreading;

public class HelloWorld {


  private static String result = "";
  private static void hello() {

    try {
      Thread.sleep((5000));
      result = result.concat("Hello");
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }

  }


  private static void world() {

    try {
      Thread.sleep(10000);
      result = result.concat(" World!");
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
  }
  public static void main(String[] args) throws InterruptedException {

    Thread threadOne = new Thread(HelloWorld::hello);
    Thread threadTwo = new Thread(HelloWorld::world);

    threadOne.start();
    threadTwo.start();

    threadOne.join();
    threadTwo.join();

    System.out.println(result);
  }
}
