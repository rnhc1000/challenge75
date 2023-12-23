package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Using a HashMap to avoid brute force solution...
 * 1. check if the target minus element exists in the map...
 * 2. if exists
 */
public class TwoSumHashMap {
  public static void main(String[] args) {
    int[] a = {2,7,11,15,11,17,1,8};
    int target = 9;
    int[] response = twoSumHashMap(a,target);
    System.out.println(Arrays.toString(response));
  }
  public static int[] twoSumHashMap(int[] array, int target) {
    int[] response = new int[2];
    int size = array.length;
    int difference = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < size; i++) {
      difference = target - array[i];
      if(!map.containsKey(difference)) {
        map.put(array[i],i);
      } else {
        response[0] = i;
        response[1] = map.get(difference);
        break;
      }
    }
    System.out.println(map);
    return response;
  }
}
