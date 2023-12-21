package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatch {

  public static void main(String[] args) {
    String s = "aa";
    String p = "a*";
    System.out.println(isMatch(s, p));
   testMatches(s);
  }

  public static boolean isMatch(String s, String regex) {
    String result = "";
    if (regex.length() < 2) return false;
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(s);
    if (matcher.find()) {
      result = matcher.group();
      System.out.println(result);
    }
    return !result.isEmpty();
  }

  public static void testMatches(String s) {

    System.out.println(s.matches(".*"));

  }
}
