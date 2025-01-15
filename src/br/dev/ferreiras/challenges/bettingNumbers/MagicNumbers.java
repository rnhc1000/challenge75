package br.dev.ferreiras.challenges.bettingNumbers;

import java.util.*;
import java.util.function.IntUnaryOperator;

public class MagicNumbers {
  static Random random = new Random();
  static int seed = 0;
//7, 34, 36, 39, 43, 48
  //1, 3, 21, 24, 26, 55
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input quantity of numbers: ");
    int number = input.nextInt();
    input.nextLine();
    List<Integer> guess = magicNumbers(number);
    System.out.println("Guess suggested is: " + guess);
    input.close();
  }

  public static final IntUnaryOperator randomLambda = (magicNumbers) -> {
    magicNumbers = random.nextInt(1, seed);
    return magicNumbers;
  };

  public static List<Integer> magicNumbers(int magicNumbers) {
    switch (magicNumbers) {
      case 6, 7 -> seed = 60;
      case 15 -> seed = 80;
      case 18 -> seed = 25;
      default -> seed = 59;
    }
    List<Integer> list = new ArrayList<>();
    int[] guess = new int[magicNumbers];
    for (int i = 0; i < magicNumbers; i++) {
      guess[i] = randomLambda.applyAsInt((0));
    }
    Arrays.sort(guess);
    for (int i : guess) {
      if (!list.contains(i)) {
        list.add(i);
      }
    }
    while (list.size() != magicNumbers) {
      int temp = randomLambda.applyAsInt(0);
      if (!list.contains(temp)) {
        list.add(temp);
      }
    }
    return list.stream().sorted().toList();
  }
}
