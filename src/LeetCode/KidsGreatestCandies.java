package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsGreatestCandies {
  public static void main(String[] args) {
    int[] candies = {12,1,11};
    int extraCandies = 10;
    System.out.println(kidsWithCandies(candies, extraCandies));
  }

  public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> happyKids = new ArrayList<>();

    int sizeOfCandies = candies.length;
    for (int i = 0; i < sizeOfCandies; i++) {
      candies[i] += extraCandies;
    }
    System.out.println(Arrays.toString(candies));
    int maxCandies = Integer.MIN_VALUE;
    for (int i : candies) {
      if (i >= maxCandies) {
        maxCandies = i;
        happyKids.add(true);
      } else {
        maxCandies-=1;
        happyKids.add(false);
      }
    }
    return happyKids;
  }
}
