package br.dev.ferreiras.oca;

public class Generic {
  public static <T> void printEverything(T parameter) {
    System.out.println(parameter + "!!!!!!");
  }

  public static <T extends Comparable<T>> T getMax(T x, T y) {
    return (x.compareTo(y) > 0) ? x : y;
  }

  public static void main(String[] args) {
    String s1 = "OCAJP";
    printEverything(s1);
    printEverything(5);
    System.out.println(getMax(10,20));
    System.out.println(getMax("Ricardo", "Ferreira"));
  }
}
