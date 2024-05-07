package br.dev.ferreiras.challenges.advanced;

public class TryCatchFinally {

  public static int divideOne(int num1, int num2) {
    try {
      return num1 / num2;
    } catch (ArithmeticException ae) {
      System.out.println("ArithmeticException");
      return 0;
    } finally {
      System.out.println("FinallyBlock");
    }
    // unreachable code return -2;
  }

  public static void main(String[] args) {
    int num1 = 10, num2 = 0;
    System.out.println(divideOne(num1, num2));
  }

}

