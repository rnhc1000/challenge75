package br.dev.ferreiras.challenges.hackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatChar {

  public static void main(String[] args) {
    char response = returnNonRepeat("ferreiraf");
    System.out.println(response);
  }

  public static char returnNonRepeat(String s) {
    char response = '0';
    Map<Character, Integer> map = new LinkedHashMap<>();
    char[] c = s.toCharArray();
    System.out.println(Arrays.toString(c));
    for (int i = 0; i < c.length ; i++) {
      map.put(c[i], map.getOrDefault(c[i], 0) + 1);
    }
    for(Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 1 ) {
        return response = entry.getKey();

      }
    }
//      response.append(c[i]);


    System.out.println(map);
    return response;
  }
}
