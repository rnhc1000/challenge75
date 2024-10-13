package br.dev.ferreiras.challenges.leetcode;

public class WaterBottles {

  public static void main(String[] args) {
    int numBottles = 3;
    int numExchange = 3;
    int r = numWaterBottles(numBottles, numExchange);
    System.out.println(r);
  }

  public static int numWaterBottles(int numBottles, int numExchange) {

    return numBottles + ((numBottles - 1) / (numExchange - 1));

  }
}
