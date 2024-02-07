package ferreiras.dev.br.challenges.dailyChallenges;
/**
 * 1. Eliminate duplicates from an array;
 * 2. return the duplicates and quantity of each duplicated;
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicates {
  public static void main(String[] args) {
    int[] numbers = {1,2,2,2,3,4,5,5,5,6,6,6,6,7,7,7,8,9,0};
    List<Integer> list = noDuplicates(numbers);
    System.out.print("[ ");
    for (int i : list) {
      System.out.print(i + " ");
    }
    System.out.print("]");
  }
  public static List<Integer> noDuplicates(int[] numbers) {
    List<Integer> list = new ArrayList<>();
    Map<Integer,Integer> dupes = new HashMap<>();
    for (int number : numbers) {
      if (list.contains(number)) {
        dupes.put(number, dupes.getOrDefault(number,1)+ 1);
        continue;
      }
      list.add(number);
    }
    for(Map.Entry<Integer,Integer> entry : dupes.entrySet() ){
      System.out.print("Key -> " + entry.getKey() + " Value -> " + entry.getValue() + "\n");
    }
    return list;
  }
}
