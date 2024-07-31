package br.dev.ferreiras.udemy.dsa.DP;

import java.util.Arrays;
/*
numberOfArrangements(n):
    if n = 0 OR n = 1:
        return 1
    prev = 1 // This is for ways[0]
    curr = 1  // This is for ways[1]
    for i from 2 up to n:
         temp = curr // This is just a temporary variable
         curr = curr + prev
         prev = temp
     return curr
 */
public class TilesArrangement {

  public static void main(String[] args) {
    int[][] box = new int[2][6];
    int response = numberOfArrangements(box);
    System.out.println(response);
  }
  public static int numberOfArrangements(int[][] box ) {

    int columns = box[0].length;
    int count = 0;
    int[] ways = new int[columns+1];
    ways[0] = 1;
    ways[1] = 1;
    for(int i = 2; i <= columns; i++) {
      ways[i] = ways[i-1] + ways[i-2];
      count = ways[i-1] + ways[i-2];
    }

    System.out.println(Arrays.toString(ways));
    System.out.println(count);
    return ways[columns];
  }
}
