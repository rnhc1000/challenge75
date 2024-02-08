package br.dev.ferreiras.challenges.reshapeStrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reshape {
  public static void main(String[] args) {
    double start = System.currentTimeMillis();
    int n = 3;
    String shaped = "ab cd efghij";
    System.out.println(reshape(n, shaped));
    double end = System.currentTimeMillis();
    double timeOfProcessing = end - start;
    System.out.printf("%.2f%s%n", timeOfProcessing, " ms");
  }

  public static String reshape(int rounds, String toReshape) {
    String reshaped = "";
    String regex = "\\s*";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(toReshape);
    if (matcher.find()) {
      reshaped = matcher.replaceAll("");
    } else {
      reshaped = toReshape;
    }
    StringBuilder sb = new StringBuilder();
    char[] c = reshaped.toCharArray();
    int size = c.length;
    int round = rounds;
    int chunk = 0;
    for (int count = 0; count < size; count += rounds) {
      while ((round > 0) && (chunk < size)) {
        sb.append(c[chunk]);
        round--;
        chunk++;
      }
      sb.append("\n");
      round = rounds;
    }
    System.out.println(sb.toString());
    return reshaped;
  }
}
