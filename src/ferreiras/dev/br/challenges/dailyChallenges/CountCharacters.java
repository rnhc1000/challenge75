package ferreiras.dev.br.challenges.dailyChallenges;

public class CountCharacters {

  public static void main(String[] args) {
    String s = "aaaabbbcccppxxx";
    String n = countCharacters(s);
    System.out.println(n);
  }
  public static String countCharacters(String s) {

    char[] c = s.toCharArray();
    int count = 1;
    int left = 0;
    StringBuilder sb = new StringBuilder();
    for (int right = 1; right < c.length; right++) {
      if (c[left] == c[right]) {
        count++;
        continue;
      }
      sb.append(c[left]).append(Integer.toString(count));
      left=right;
      count=1;
    }
    sb.append(c[left]).append(Integer.toString(count));
    return sb.toString();
  }
}

