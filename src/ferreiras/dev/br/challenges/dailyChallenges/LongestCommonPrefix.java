package ferreiras.dev.br.challenges.dailyChallenges;

public class LongestCommonPrefix {
  public static void main(String[] args) {
    String[] s = {"flower", "flow", "flight"};
    String response = LongestCommonPrefix.commonPrefix(s);
    System.out.println(response);
  }
  public static String commonPrefixHelper(String sOne, String sTwo) {
    StringBuilder sb = new StringBuilder();
    int sizeOne = sOne.length() ;
    int sizeTwo = sTwo.length() ;
    for (int i = 0, j = 0; i < sizeOne && j < sizeTwo; i++, j++) {
      if (sOne.charAt(i) != sTwo.charAt(j)) {
        break;
      }
      sb.append(sOne.charAt(i));
    }
    return sb.toString();
  }

  public static String commonPrefix(String[] words) {
    int sizeOfWords = words.length;
    String prefix = words[0];
    for (int i = 1; i < sizeOfWords; i++) {
      prefix = commonPrefixHelper(prefix, words[i]);
    }
    return prefix;
  }
}
