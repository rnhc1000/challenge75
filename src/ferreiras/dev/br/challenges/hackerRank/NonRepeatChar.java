package ferreiras.dev.br.challenges.hackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NonRepeatChar {

  public static void main(String[] args) {
    StringBuilder response = returnNonRepeat("ferreiraf");
    System.out.println(response);
  }
  public static StringBuilder returnNonRepeat(String s) {
    StringBuilder response = new StringBuilder();
    Map<Character, Integer> map = new HashMap<>();
    char[] c = s.toCharArray();
    System.out.println(Arrays.toString(c));
    for (int i = 0; i < c.length-1; i++)
      for (int j = i+1; j < c.length; j++) {
        if (c[i] == c[j]) {
          map.put(c[i], map.getOrDefault(c[i],0)+1);
          response.append(c[i]);
        }
      }
    return response;
  }
}
