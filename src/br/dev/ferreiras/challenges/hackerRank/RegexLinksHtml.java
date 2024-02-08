package br.dev.ferreiras.challenges.hackerRank;
/*
 * given the html snippet code, return link and description
 * Input:
 * <a href="http://www.hackerrank.com">HackerRank</a>
 * Output:
 * http://www.hackerrank.com,HackerRank
 *
 **/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLinksHtml {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input number of lines: ");
    int n = sc.nextInt();
    sc.nextLine();

    String[] input = new String[n];
    String[] links = new String[n];
    String[] names = new String[n];
    for (int i = 0; i < n; i++) {
      System.out.println("Line " + i + 1 + ": ");
      input[i] = sc.nextLine();
    }
    String regex = "(http:\\/\\/|https:\\/\\/)[a-z].*\\.([a-z]{2,3})(\\.[a-z]{2})?(\\/[a-zA-Z#?]+)?";
    String regexOne = "(http://|https://)[a-z]+\\.[a-z]{2,}";
    String regexTwo = "(>).*[^</a>]";
    Pattern pattern = Pattern.compile(regexOne);
    for (int i = 0; i < n; i++) {
      Matcher matcher = pattern.matcher(input[i]);
      while (matcher.find()) {
        links[i] = matcher.group();
      }
    }
    pattern = Pattern.compile(regexTwo);
    for (int i = 0; i < n; i++) {
      Matcher matcher = pattern.matcher(input[i]);
      while (matcher.find()) {
        names[i] = matcher.group();
      }
    }

    for (int i = 0; i < n; i++) {
      input[i] = links[0] + names[0].replace(">", ",");
    }

    StringBuilder sb = new StringBuilder();
    String sx = sb.append(links[0]).toString();
    for (String s : links) {
      System.out.println(s);
    }
    for (String s : names) {
      System.out.println(s);
    }
    for (String s : input) {
      System.out.println(s);
    }
  }
}
