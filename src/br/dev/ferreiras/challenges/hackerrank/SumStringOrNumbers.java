package br.dev.ferreiras.challenges.hackerrank;

import static java.lang.Integer.parseInt;

public class SumStringOrNumbers {
  public static int sum(String a, String b) {
    try {
      if ((a == null) || (!a.matches("[0-9.]+")) && ((b == null) || (!b.matches("[0-9.]+"))))
        throw new NumberFormatException();
    } catch (Exception ex) {
      ex.getMessage();
      System.out.println("Apenas numeros");
    }
    int x = parseInt(a);
    int y = parseInt(b);
    return x + y;
  }

  public static int sum(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) throws NumberFormatException {

    String a = "10";
    String b = "2";
    int x = 1;
    int y = 2;

    try {
      System.out.println(sum(a, b));
    } catch (NumberFormatException ex) {
      ex.getMessage();
      System.out.println("Apenas numeros!");
    } finally {
      System.out.println(sum(x, y));
    }
  }

}
