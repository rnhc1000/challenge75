package br.dev.ferreiras.udemy.dsa.DP;

public class BurglarsNightOut {

  public static void main(String[] args) {
    int[] houses = { 3, 8, 10, 4, 1, 7 };
    int response = maxBurglarMoney(houses);
    System.out.println(response);
  }
  public static int maxBurglarMoney(int[] houses) {

    int size = houses.length;
    if ( size == 0 ) return 0;
    int[] maxMoney = new int[size + 1];
    boolean[] visited = new boolean[size];

//    maxMoney[size] = 0;
    maxMoney[size - 1] = houses[size -1];
    for(int i = size - 2; i >= 0; i--) {
      maxMoney[i] = Math.max(houses[i] + maxMoney[i + 2], maxMoney[i+1]);
    }


    return maxMoney[0];

  }
}
