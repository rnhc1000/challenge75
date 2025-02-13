package br.dev.ferreiras.challenges.bettingNumbers;

import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MagicNumbers {
  static Random random = new Random();
  static int seed = 0;

  private static final Logger logger = Logger.getLogger(MagicNumbers.class.getName());

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input quantity of numbers: ");
    int number = input.nextInt();
    input.nextLine();
    List<Integer> guess = magicNumbers(number);
    System.out.println("Guess suggested is: " + guess);
    input.close();
  }

  public static final IntUnaryOperator randomLambda = (magicNumber) -> {
    magicNumber = random.nextInt(1, seed);
    return magicNumber;
  };

  public static List<Integer> magicNumbers(int magicNumber) {
    switch (magicNumber) {
      case 6, 7 -> seed = 60;
      case 15 -> seed = 80;
      case 18 -> seed = 25;
      default -> seed = 59;
    }
    List<Integer> list = new ArrayList<>();
    int[] guess = new int[magicNumber];
    for (int i = 0; i < magicNumber; i++) {
      guess[i] = randomLambda.applyAsInt((0));
    }
    logger.log(Level.INFO, "::: first guess {0} :::", Arrays.toString(guess));
    Arrays.sort(guess);
    for (int i : guess) {
      if (!list.contains(i)) {
        list.add(i);
      }
    }
    logger.log(Level.INFO, "::: cleaned guess {0} :::", list);

    while (list.size() != magicNumber) {
      int temp = randomLambda.applyAsInt(0);
      if (!list.contains(temp)) {
        list.add(temp);
      }
    }

    logger.log(Level.INFO, "::: adjusted guess size in case less than the input {0} :::", list);

    return list.stream().sorted().toList();
  }
}
