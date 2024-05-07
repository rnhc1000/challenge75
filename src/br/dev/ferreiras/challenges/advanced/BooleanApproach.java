package br.dev.ferreiras.challenges.advanced;

public class BooleanApproach {
  public static void main(String[] args) {
    int num1 = 1;
    int num2 = 8;
    boolean flag = !(!(num1 != num2 ) && (num2 > 7));
    flag = num1 != num2 || num2 <= 7;

    /*
    !(!(num1 != num2 ) && (num2 > 7)) -> !(num1 != num2) = (num1 == num2)
    !((num1 == num2 ) && (num2 > 7))
    !(num1 == num2 ) || !(num2 > 7)
    num1 != num2 || num2 <= 7
     */
    System.out.println(flag);
  }
}
