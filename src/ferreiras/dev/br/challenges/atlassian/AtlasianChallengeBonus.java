package ferreiras.dev.br.challenges.atlassian;

import java.util.Arrays;

public class AtlasianChallengeBonus {
  public static void main(String[] args) {
    int[] employees = {10, 40, 200, 1000, 60, 30};
    int[] bonus = atlasianChallenge(employees);
    System.out.println(Arrays.toString(bonus));
  }
  public static int[] atlasianChallenge(int[] linesOfCode) {
    int[] bonus = new int[linesOfCode.length];
    int size = linesOfCode.length;
    for (int j = 0; j < size; j++) {
      if (linesOfCode[j] >= 10 && linesOfCode[j] <= 39) {
        bonus[j] = 1;
      } else if (linesOfCode[j] >= 40 && linesOfCode[j] <= 199) {
        bonus[j] = 2;
      } else if (linesOfCode[j] >= 200 && linesOfCode[j] <= 999) {
        bonus[j] = 3;
      } else {
        bonus[j] = 4;
      }
    }
    return bonus;
  }
}
