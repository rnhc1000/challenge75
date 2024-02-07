package ferreiras.dev.br.challenges.integerToRoman;

import java.util.*;

public class IntegerToRoman {

  public static void main(String[] args) {
    int n = 2600;
    System.out.println(intToRoman(n));
    System.out.println(RomanFromInt(n));
    System.out.println(IntegerRomanLinkedHashMap(n));
  }

  public static String RomanFromInt(int num) {
    StringBuilder roman = new StringBuilder();
    List<Integer> integer = Arrays.asList(
            3000, 2000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);
    List<String> string = Arrays.asList(
            "MMM", "MM", "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");
    long start = System.currentTimeMillis();
    int scanMap = 0;
    while (num > 0) {
      if (num >= integer.get(scanMap)) {
        roman.append(string.get(scanMap));
        num = num - integer.get(scanMap);
      } else {
        scanMap++;
      }
    }
    long end = System.currentTimeMillis();
    long time = end - start;
    return roman.toString();
  }

  public static String intToRoman(int num) {
    int[] n = new int[1546];
    StringBuilder roman = new StringBuilder();
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "I");
    map.put(2, "II");
    map.put(3, "III");
    map.put(4, "IV");
    map.put(5, "V");
    map.put(6, "VI");
    map.put(7, "VII");
    map.put(8, "VIII");
    map.put(9, "IX");
    map.put(10, "X");
    map.put(20, "XX");
    map.put(30, "XXX");
    map.put(40, "XL");
    map.put(50, "L");
    map.put(60, "LX");
    map.put(70, "LXX");
    map.put(80, "LXXX");
    map.put(90, "XC");
    map.put(100, "C");
    map.put(200, "CC");
    map.put(300, "CCC");
    map.put(400, "CD");
    map.put(500, "D");
    map.put(600, "DC");
    map.put(700, "DCC");
    map.put(800, "DCCC");
    map.put(900, "CM");
    map.put(1000, "M");
    map.put(2000, "MM");
    map.put(3000, "MMM");
    n[0] = num % 10;
    n[1] = ((num / 10) % 10) * 10;
    n[2] = ((num / 100) % 10) * 100;
    n[3] = ((num / 1000) % 10) * 1000;
    for (int i = n.length - 1; i >= 0; i--) {
      if (map.containsKey(n[i])) {
        roman.append(map.get(n[i]));
      }
    }
    return roman.toString();
  }

  public static String IntegerRomanLinkedHashMap(int num) {
    StringBuilder roman = new StringBuilder();
    Map<Integer, String> map = new LinkedHashMap<>();
    map.put(1000, "M");
    map.put(900, "CM");
    map.put(500, "D");
    map.put(400, "CD");
    map.put(100, "C");
    map.put(90, "XC");
    map.put(50, "L");
    map.put(40, "XL");
    map.put(10, "X");
    map.put(9, "IX");
    map.put(5, "V");
    map.put(4, "IV");
    map.put(1, "I");
    /*
  for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
    }
*/
    return roman.toString();
  }
}
