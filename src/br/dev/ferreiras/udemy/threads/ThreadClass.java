package br.dev.ferreiras.udemy.threads;

public class ThreadClass {
  public static void main(String[] args) {
    Thread threadZero = new NewThread();
    Thread threadOne = new NewThread();
    threadZero.setName("T-Zero");
    threadOne.setPriority(Thread.MAX_PRIORITY);
    threadOne.setName("T-One");
    threadZero.start();
    threadOne.start();
  }

  public static class NewThread extends Thread {
    @Override
    public void run() {
      System.out.println("Hello from " + this.getName());
    }
  }
}
