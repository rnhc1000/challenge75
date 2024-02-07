package ferreiras.dev.br.challenges.dailyChallenges;

import java.util.List;
import java.util.stream.Stream;

public class FibonacciStream {
  public static void main(String[] args) {
    List<Long> list = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[]{p[1], p[0] + p[1]}).map(p -> p[0]).limit(10).toList();
    for (Long l : list) {
      System.out.print(" " + l);
    }
  }
}
