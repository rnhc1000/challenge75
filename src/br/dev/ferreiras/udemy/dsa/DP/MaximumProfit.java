package br.dev.ferreiras.udemy.dsa.DP;

import java.util.Arrays;

public class MaximumProfit {

  public static void main(String[] args) {
    int[] costs = { 8,6,1,3,2,7,4};
    int response = maxProfit(costs);
    System.out.println(response);
  }

  public static int maxProfit(int[] costs) {

    int size = costs.length;
    int profit = Integer.MIN_VALUE;
    int[] minPrice = new int[size];
    int[] profitMax = new int[size];
    minPrice[0] = costs[0];

    for (int i = 1; i < size; i++) {
      minPrice[i] = Math.min(costs[i], minPrice[i-1]);
    }

    System.out.println(Arrays.toString(minPrice));

    for (int j = 0; j < size; j++) {

        profitMax[j] = costs[j] - minPrice[j];
        if (profit < profitMax[j]) {
          profit = profitMax[j];
        }

    }
    return profit;
  }
}
