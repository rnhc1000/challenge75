package br.dev.ferreiras.galego.datastructures;

public class BinaryStepsReduceNumberToZero {

  public static void main(String[] args) {
    int n = 8;
    int response = numberOfSteps(n);
    System.out.println(response);
  }

  public static int numberOfSteps(int n) {

    int steps = 0;
    while (n > 0) {
      int m = n & 1;
      if (m == 0) {
        n -= 1;
      } else {
        n >>= 1;
        steps++;
      }
    }
    return steps;

  }
}
