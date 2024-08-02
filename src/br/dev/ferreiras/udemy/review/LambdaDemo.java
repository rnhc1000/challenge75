package br.dev.ferreiras.udemy.review;

public class LambdaDemo {
  public static void main(String[] args) {


//Runnable runnable = new Runnable() {
//      @Override
//      public void run() {
//        System.out.println("Thread started!!!");
//      }
//    }
      Runnable runnable =
            () -> {
              System.out.println("Thread started!!!");
            };

      Thread thread = new Thread(runnable);

      thread.start();

  }
}

//class CustomRunnable implements Runnable {
//
//  @Override
//  public void run() {
//
//    System.out.println("Thread started!!!");
//
//  }
//}
