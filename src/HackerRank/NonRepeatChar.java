package HackerRank;

public class NonRepeatChar {

  public static void main(String[] args) {
    StringBuilder response;

    response = returnNonRepeat("ferreiraf");
    System.out.println(response);

  }

  public static StringBuilder returnNonRepeat(String s) {
    StringBuilder response = new StringBuilder();
    String nonRepeat = "";
    char[] c = new char[s.length()];
    int count = 0;
    for (int i = 0; i < s.length(); i++) c[i] = s.charAt(i);

    //nonRepeat+=c[i];
    for (int i = 0; i < c.length-1; i++)
      for (int j = i+1; j < c.length; j++) {
        if (c[i] == c[j]) {
          count++;
          response.append(c[i]);
        }
      }
    //System.out.println(count + " " + nonRepeat);
    System.out.println("-----");
    return response;
  }
}
