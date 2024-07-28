package br.dev.ferreiras.udemy.dsa.DP;

import java.util.Arrays;

public class MaximumProfit {

  public static void main(String[] args) {
    int[] costs = {8, 6, 1, 3, 2, 7, 4};
    int response = maxProfit(costs);
    System.out.println("maximumProfit() -> " + response);

    response = max(costs);
    System.out.println("max() -> " + response);

    int a= 10, b = 7;
    response = getSum(a, b);
    System.out.println(response);


  }

  public static int maxProfit(int[] costs) {

    int size = costs.length;
    int profit = Integer.MIN_VALUE;
    int[] minPrice = new int[size];
    int[] profitMax = new int[size];
    minPrice[0] = costs[0];

    for (int i = 1; i < size; i++) {
      minPrice[i] = Math.min(costs[i], minPrice[i - 1]);
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

  public static int max(int[] costs) {

    int size = costs.length;
    // int[] costs = { 8,6,1,3,2,7,4};

    int maximum = Integer.MIN_VALUE;

    for (int i = 0; i < size; i++) {

      for (int j = i + 1; j < size; j++) {

        maximum = Math.max(maximum, costs[j] - costs[i]);
        System.out.println(j + " " + i + " " + maximum);

      }

    }
    int y = 5;
    int x = 10;
    int result = (x > y) ? x++ : y++;
    System.out.println(result + " " + x + " " + y);

    return  maximum;
  }

  public static int getSum(int a , int b) {

    while (b != 0) {
      int answer = a ^ b ;
      int carry = ( a & b);
      carry<<=1;
      a = answer;
      b = carry;
    }

    return a;
  }
}

