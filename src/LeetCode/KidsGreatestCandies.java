package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsGreatestCandies {
  public static void main(String[] args) {
    int[] candies = {2,3,5,1,3};
    int extraCandies = 3;
    System.out.println(kidsWithCandies(candies, extraCandies));
  }

  public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> happyKids = new ArrayList<>();

    int sizeOfCandies = candies.length;
    int j=0;
    for (int i : candies) {
      candies[j] = i+extraCandies;
      j++;
    }
    System.out.println(Arrays.toString(candies));
    int maxCandies = candies[0];
    int minCandies = maxCandies;
    for (int candy : candies) {
      maxCandies = Math.max(maxCandies, candy);
    }
    for (int candy : candies) {
      if (candy >= (maxCandies - extraCandies)) {
        happyKids.add(true);
      } else {
        happyKids.add(false);
      }
    }
/*    for (int candy : candies) {
      if (candy >= (maxCandies - extraCandies)) {
        happyKids.add(true);
      } else {
        happyKids.add(false);
      }
    }*/
    return happyKids;
  }
}
