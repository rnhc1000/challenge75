package br.dev.ferreiras.galego.datastructures;

public class TwoPointer {
  public static void main(String[] args) {
    String s = "Let's take LeetCode contest";
    String r = reverseWords(s, false);
    System.out.println(r);
    // tsetnoc edoCteeL ekat s'teL
  }

  public static String reverseWords(String s) {

    int left = 0, right = s.length() - 1;

    StringBuilder sb = new StringBuilder();

    while (left < s.length()) {
      sb.append(s.charAt(right));
      left++;
      right--;
    }

    return sb.toString();
  }

  public static String reverseWords(String s, boolean flag) {
    String regex = "\\s+";
    String[] words = s.split(regex);
    StringBuilder sb = new StringBuilder();
    for (String word : words) {
      int len = word.length();
      char[] c = word.toCharArray();
      for (int i = len - 1; i >= 0; i--) {
        sb.append(c[i]);
      }
      sb.append(" ");
    }
    return sb.toString().trim();

  }
}
