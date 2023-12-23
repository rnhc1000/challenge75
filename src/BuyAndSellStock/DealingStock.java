package BuyAndSellStock;

public class DealingStock {

  public static void main(String[] args) {
    int[] stocks = {7, 1, 5, 3, 6, 4};
    System.out.println(maxProfit(stocks));
    System.out.println(profitMax(stocks));
  }

  public static int profitMax(int[] prices) {
    int profit = 0;
    int sizeOfPrices = prices.length;
    int leftPointer = 0;
    for (int rightPointer = 1; rightPointer < sizeOfPrices; rightPointer++) {
      if (prices[rightPointer] > prices[leftPointer]) {
        profit = Math.max(profit, prices[rightPointer] - prices[leftPointer]);
      } else {
        leftPointer = rightPointer;
      }
    }
    return profit;
  }

  public static int maxProfit(int[] stocks) {
    int profit = 0;
    int maxProfit = 0;
    int leftPointer = 0, rightPointer = 1;
    int size = stocks.length;
    while (size > 1) {
      if (stocks[rightPointer] > stocks[leftPointer]) {
        profit = Math.max(profit, stocks[rightPointer] - stocks[leftPointer]);
        rightPointer++;
      } else {
        leftPointer++;
        rightPointer++;
      }
      size--;
    }
    return profit;
  }
}
