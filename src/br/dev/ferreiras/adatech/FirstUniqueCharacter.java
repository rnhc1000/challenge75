package br.dev.ferreiras.adatech;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {
  public static void main(String[] args) {
    String s = "leetcode";
    char x = firstUniqueCharacter(s);
    System.out.println(x);
    int y = firstUniqueCharacterIndex(s);
    System.out.println(y);
  }
  public static char firstUniqueCharacter(String input) {
//    char[] c = input.toCharArray();
    char response = 0;
    int size = input.length();
    Map<Character, Integer> map = new LinkedHashMap<>();
    for (int i = 0; i < size; i++) {
      map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0) + 1);
    }
    System.out.println(map);
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {

      if (entry.getValue() == 1) {
        response = entry.getKey();
        break;
      }
    }

    return response;
  }

  public static int firstUniqueCharacterIndex(String input) {
    int[] freq = new int[26];
    for (char ch : input.toCharArray()) freq[ch - 'a']++;
    /*
    [0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0]
    leetcode -> frequency of each char using (ch - 'a')
     */
    System.out.println(Arrays.toString(freq));
    for (int index = 0; index < input.length(); index++) {
      if (freq[input.charAt(index) - 'a'] == 1)
        return index;
    }

    return -1;
  }
}
