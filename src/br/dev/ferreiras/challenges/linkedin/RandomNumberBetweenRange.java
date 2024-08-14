package br.dev.ferreiras.challenges.linkedin;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberBetweenRange {

  public static void main(String[] args) {
    int min = 1;
    int max = 10;

    int response = randomGeneratorRange(min,max);
    System.out.println(response);
  }

  public static int randomGeneratorRange(int min, int max) {

    return ThreadLocalRandom
            .current()
            .nextInt(min, max);
  }

}
