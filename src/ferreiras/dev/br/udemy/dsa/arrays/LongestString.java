package ferreiras.dev.br.udemy.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a method that, given an array of strings, finds and returns the longest
 * string in the array.
 * If there are multiple strings with the same maximum length, return the first
 * one encountered.
 * Method Signature
 * public static String findLongestString(String[] stringList)
 * This method takes an array of strings stringList as input and returns a string.
 * Input
 * An array of strings stringList
 * Output
 * Returns a string that is the longest string in the input array.
 * If multiple strings have the same length, it returns the first string encountered.
 * Example
 * For example, if the input array is {"apple", "banana", "kiwi", "pear"}, the method
 * should return "banana" since "banana" is the longest string in the array.
 * Additional Notes
 * The implementation needs to consider the case where the string is empty "" as in test case 5.
 * In this case, the empty string has the least length. If all the strings in the array are of
 * the same length, the method will return the first string in the array.
 * Please ensure your solution handles these cases correctly.
 */
public class LongestString {
  public static void main(String[] args) {
    String[] stringList1 = {"apple", "banana", "kiwi", "pear"};
    String longest1 = findLongestString(stringList1);
    System.out.println("Test case 1: Longest string: " + longest1);  // prints "banana"

    String[] stringList2 = {"cat", "giraffe", "elephant", "hippopotamus"};
    String longest2 = findLongestString(stringList2);
    System.out.println("Test case 2: Longest string: " + longest2);  // prints "hippopotamus"

    String[] stringList3 = {"sun", "moon", "planet", "universe"};
    String longest3 = findLongestString(stringList3);
    System.out.println("Test case 3: Longest string: " + longest3);  // prints "universe"

    String[] stringList4 = {"java", "python", "javascript", "c"};
    String longest4 = findLongestString(stringList4);
    System.out.println("Test case 4: Longest string: " + longest4);  // prints "javascript"

    String[] stringList5 = {"", "a", "aa", "aaa"};
    String longest5 = findLongestString(stringList5);
    System.out.println("Test case 5: Longest string: " + longest5);  // prints "aaa"

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: Longest string: banana
            Test case 2: Longest string: hippopotamus
            Test case 3: Longest string: universe
            Test case 4: Longest string: javascript
            Test case 5: Longest string: aaa
        */
  }

  public static String findLongestStrings(String[] stringList) {
    String longest = "";
    for (String string : stringList) {
      if (string.length() > longest.length()) {
        longest = string;
      }
    }
    return longest;
  }
  public static String findLongestString(String[] stringList) {

    Map<String, Integer> map = new HashMap<>();
    for (String string : stringList) {
      map.put(string, string.length());
    }

    Map.Entry<String, Integer> maxEntry = null;
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
        maxEntry = entry;
      }
    }
    assert maxEntry != null;
    return maxEntry.getKey();
  }
}
