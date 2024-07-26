package br.dev.ferreiras.udemy.dsa.DP;
/*
If suppose you have found the maximum value that we could get by cutting the rod and selling it, 
how many different combinations of rod pieces are there in which we could get that maximum value? 
Order of the rods matter. You can write either pseudocode or just write your approach in brief.

For example:- 

We are given a rod of length 5 inches and the cost array is:-
cost = {0 , 2, 4, 6, 8, 9 }
Maximum value = 10.
Number of ways to make 10 units of money = 15 which are:- 
1. {1, 4} unit rods having 2 combinations

2. {2, 2, 1} unit rods having 3 combinations

3. {2, 3} unit rods having 2 combinations

4. {2, 1, 1, 1} unit rods having 4 combinations

5. {3, 1, 1} unit rods having 3 combinations

6. {1, 1, 1, 1, 1} unit rods having 1 combination

rodCutterPossibilities(cost[],n):

    initialize rod[n+1] as a new array
    rod[0] = 0

    // This will save number of possibilities for all length of rods
    initialize possibilities[n+1] as a new array
    possibilities[0] = 1

    for i from 1 to n:
        max_val = -INF

         for j from 1 to i:
            // If we have found the best possibility
            if( max_val < cost[j] + rod[i-j] )
                max_val = cost[j] + rod[i-j]
                 possibilities[i] = possibilities[i-j]

            // If another optimum option is found same as before
            else if( max_val = cost[j] + rod[i-j] )
                possibilities[i] = possibilities[i] + possibilities[i-j]

        rod[i] = max_val

    return possibilities[n]
 */
public class RodMaxValue {
  public static void main(String[] args) {
    int[] cost = {0 , 2, 4, 6, 8, 9 };
    int max = 10;
    int response = maxRodValue(cost, max);
    System.out.println(response);
  }
  public static int maxRodValue(int[] cost, int maxValue) {
    
    int quantity = 0;
    int[] rod = new int[6];
    for (int i = 1; i <= 5; i++) {
      int max = Integer.MIN_VALUE;
      for (int j = 0; j < i; j++) {

        max = Math.max(max, cost[i] + rod[i-j]);
        quantity++;
      }
    }
            
    return quantity;
  }
}
