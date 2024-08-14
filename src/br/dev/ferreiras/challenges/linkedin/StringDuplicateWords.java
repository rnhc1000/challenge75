package br.dev.ferreiras.challenges.linkedin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringDuplicateWords {
  public static void main(String[] args) {
    String words = """
            The quick brown Fox dog jumps over the Lazy dog !
            """;

    String[] duplicates= findDuplicates(words);
    System.out.println(Arrays.toString(duplicates));
  }
  public static String[] findDuplicates(String words) {

    String regex = "\\s+";

    String[] strings = words.toLowerCase().split(regex);

//    String[] word = words.split(regex);


    Set<String> duplicate = new HashSet<>();
    int left = 0, right = strings.length - 1, size = strings.length;

    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {

        if (strings[i].equals(strings[j])) {
          duplicate.add(strings[i]);
        }

      }
    }

    return duplicate.toArray(new String[0]);
  }
}
