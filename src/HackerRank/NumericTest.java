package HackerRank;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumericTest {

  static public boolean isNumeric(String s) {
    String regex = "[0-9]+";
    return s == null || s.matches(regex);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input numbers only!: ");
    String s = input.nextLine();
    if (isNumeric(s)) {
      int i = Integer.parseInt(s);
      System.out.println("Number: " + i);
    } else {
      System.out.println("Only numbers");
    }
    input.close();
    List<Integer> listOfNumbers = Arrays.asList(1, -2, 0, 4, 5, -6, -7, -8, 0);
    int[] result = plusMinus(listOfNumbers);
    System.out.println("Given the stream below, get positives, zeros and negatives");
    System.out.println(listOfNumbers);
    System.out.println("Number of Positives, Zeros and Negatives");
    for (int i : result) {
      System.out.print("\t" + i);
    }
  }

  public static int[] plusMinus(List<Integer> list) {

    int size = list.size();
    int countPositive = 0;
    int countNegative = 0;
    int countZero = 0;
    for (Integer i : list) {
      int a = (i > 0) ? countPositive++ : i == 0 ? countZero++ : countNegative++;
    }
    int[] result = new int[3];
    result[0] = countPositive;
    result[1] = countZero;
    result[2] = countNegative;
    return result;

  }
}
