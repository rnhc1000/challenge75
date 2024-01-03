package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

  public static void main(String[] args) {
    int[] numbers = {10, 2, 3, 99, 12, 0};
    int target = 4;
    int[][] response = fourSum(numbers, target);
    if (response.length > 0) {
      System.out.println("Nothing to return here!");
    }

  }

  public static int[][] fourSum(int[] numbers, int target) {
    int[][] check = new int[][]{{}};
    int[][] sumToZero = new int[4][target];
//    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));
    int size = numbers.length;
    if (size <= target) return check;
    int pointer = 0;
    for (int i = 0; i < sumToZero.length; i++) {
      for (int k = 0; k < sumToZero[i].length; k++) {
        sumToZero[i][k] = numbers[pointer];
        pointer++;
      }
      pointer = i;
    }
    for (int[] d : sumToZero) {
      System.out.println(Arrays.toString(d));
    }
    List<Integer> w = new ArrayList<>();
    List<List<Integer>> a = new ArrayList<>(); //Use Arraylist inside


    for (int i = 0; i < size; i++) {
      for (int j = i; j < size; j++) {
        for (int k = i; k <= j; k++) {
          w.add(numbers[k]);
          a.add(new ArrayList<>(w));

          System.out.print(numbers[k] + " ");
        }

/*        while (w.size() != 4) {
          continue;
        }*/

      }
    }
/*    for (int[] x : sumToZero) {
      for (int y : x) {
        w.add(y);
        if (w.size() != 4) continue;
        a.add(new ArrayList<>(w));
      }
    }*/
    System.out.println(w);
    System.out.println(a);
    return check;
  }
}
