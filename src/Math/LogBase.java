package Math;

/**
 * a ^ x = b <=> log(a) b = x
 */
public class LogBase {

  public static void main(String[] args) {
    int m = 145;
    int p = 2;
    int n = (int) log(m,p);

    System.out.printf("%d%n",n);
  }

  public static double log(double value, double base) {
    return Math.log(value)/Math.log(base);
  }
}
