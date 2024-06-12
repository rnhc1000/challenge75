package br.dev.ferreiras.challenges.dailyChallenges.feb;

import java.util.*;

/*
 * Given an array of strings strings, group the anagrams together.
 * You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters
 * of a different word or phrase, typically using all the original
 * letters exactly once.
 * Example 1:
 * Input: strings = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Example 2:
 * Input: strings = [""]
 * Output: [[""]]
 * Example 3:
 * Input: strings = ["a"]
 * Output: [["a"]]
 */

public class GroupAnagrams {

  public static void main(String[] args) {
    String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> response = GroupAnagrams.groupAnagrams(strings);
    for (List<String> list : response) {
      System.out.println(list);
    }
  }

  public static List<List<String>> groupAnagrams(String[] strings) {

    Map<String, List<String>> map = new HashMap<>();
    for (String string : strings) {
      char[] c = string.toCharArray();
      Arrays.sort(c);
      String key = new String(c);
      if (map.containsKey(key)) {
        map.get(key).add(string);
      } else {
        List<String> list = new ArrayList<>();
        list.add(string);
        map.put(key, list);
      }
    }

    return new ArrayList<>(map.values());
  }
}
