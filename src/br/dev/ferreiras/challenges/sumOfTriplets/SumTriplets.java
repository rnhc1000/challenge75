package br.dev.ferreiras.challenges.sumOfTriplets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumTriplets {

  public static void main(String[] args) {
    int[] numbers  = {-2,-2,-1,-1,0,0,0,2,2,2};
    List<List<Integer>> triplets = threeSum(numbers);
    for (List<Integer> list : triplets) {
      for (Integer l : list) {
        System.out.print(" " + l);
      }
      System.out.println("\n-----------");

    }
  }

  public static List<List<Integer>> threeSum(int[] numbers) {
    List<List<Integer>> triplets = new ArrayList<>();
    Arrays.sort(numbers);
    int trio = numbers.length - 3;
    for (int i = 0; i < trio; i++) {
      if (i == 0 || numbers[i] != numbers[i - 1]) {
        int left = i + 1, right = numbers.length - 1;
        int target = -numbers[i];
        while (left < right) {
          if ((numbers[left] + numbers[right]) == target) {
            List<Integer> triplet = new ArrayList<>();
            triplet.add(numbers[i]);
            triplet.add(left);
            triplet.add(right);
            triplets.add(triplet);
            while (left < numbers.length-1 && numbers[left] == numbers[left + 1]) left++;
            while (right > 0 && numbers[right] == numbers[right - 1]) right--;
            left++;
            right--;
          } else if ((numbers[left] + numbers[right]) < target) {
            left++;
          } else {
            right--;
          }
        }
      }
    }
    return triplets;
  }
}