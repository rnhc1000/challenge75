package dailyChallenges;
/**
 * Given a list of words
 * recover their common prefix if one exists
 */

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CommonPrefix {

  public static void main(String[] args) {
    String[] prefix = {"flower", "flow", "flight"};
    String p = commonPrefix(prefix);
    System.out.println(p);
  }

  public static String commonPrefix(String[] words) {
    int size = words.length;
    String prefix = "";
    StringBuilder sb = new StringBuilder();
    Map<Character, Integer> map = new HashMap<>();
    for (String s : words) {
      char[] c = s.toCharArray();
      for (char x : c) {
        if (map.containsKey(x)) {
          map.put(x, map.getOrDefault(x, 1) + 1);
        } else {
          map.put(x, 1);
        }
      }
    }

    Map.Entry<Character,Integer> maxEntry = null;
    for(Map.Entry<Character, Integer> entry : map.entrySet()) {
      if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
        maxEntry=entry;
      }
    }

    int maxValueInMap = Collections.max(map.values());
    for(Map.Entry<Character,Integer> entry : map.entrySet()) {
      if(entry.getValue() == maxValueInMap) {
        System.out.println("Key -> " + entry.getKey() + " Value -> " + entry.getValue());
        sb.append(entry.getKey());
      }
    }
    System.out.println(maxValueInMap);
    System.out.println(maxEntry);
    return sb.toString();
  }
}
