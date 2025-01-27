package br.dev.ferreiras.challenges.dailyChallenges;

/**
 * Write a program that prints the numbers of 1 to 100.
 * But for multiple pf threes print "Fizz" instead of the number and
 * for the multiple of five print "Buzz". For numbers which are multiples
 * of both three and five print "FizzBuzz"
 */
public class FuzzBuzz {
  public static void main(String[] args) {
    //int n = 21;
    //String response = fuzzBuzz(n);

    fizzBuzz();
  }

  public static String fuzzBuzz(int n) {
    String fuzz = "Fuzz";
    String buzz = "Buzz";
    StringBuilder sb = new StringBuilder();
    if (n % 15 == 0) {
      sb.append(fuzz).append(buzz);
    } else if (n % 3 == 0) {
      sb.append(buzz).append("!");
    } else if (n % 5 == 0) {
      sb.append(fuzz).append("!");
    } else {
      sb.append("Ooopsss");
    }
    return sb.toString();
  }

  public static void fizzBuzz() {
    StringBuilder sb = new StringBuilder();



    for (int i = 1; i <= 100; i++) {

      if (i % 15 == 0) {
        sb.append("-FizzBuzz-");
      } else if (i % 3 == 0) {
        sb.append("Fizz!");
      } else if (i % 5 == 0) {
        sb.append("Buzz!");
      } else {
        sb.append(String.valueOf(i));
      }
    }
    System.out.println(sb.toString());
  }
}
