package br.dev.ferreiras.challenges.geeksForGeeks;

/**
 * In a stock market, there is a product with its infinite stocks.
 * The stock prices are given for N limitOfStocksperDays, where price[i] denotes
 * the price of the stock on the ith limitOfStocksperDay.
 * There is a rule that a customer can buy at most i stock on the ith limitOfStocksperDay.
 * If the customer has an amount of k amount of money initially.
 * The task is to find out the maximum number of stocks a customer can buy
 */
public class MaximumStocks {

  public static void main(String[] args) {
    int[] price = {11,13,9,4};
    int k = 46;
    int n = 4;
    System.out.println(buyMaximumStocks(n, k, price));
  }

  public static int buyMaximumStocks(int n, int k, int[] price) {
    int stocks = 0;
    int count = 0;
    int limitOfStocksperDay = 1;
    int possibleNumberOfStocks = 0;
    n = price.length;
    while (n > 0) {
      if (limitOfStocksperDay * price[count] <= k) {
/*        possibleNumberOfStocks = k / price[count];
        if (possibleNumberOfStocks > limitOfStocksperDay) {*/
          stocks += limitOfStocksperDay;
        //}
        k = k - limitOfStocksperDay * price[count];
      } else if(price[count] <= k){
        stocks += 1;
        k = k - price[count];
      }
      limitOfStocksperDay++;
      count += 1;
      n -= 1;
    }
    return stocks;
  }
}
