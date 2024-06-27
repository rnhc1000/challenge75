package br.dev.ferreiras.challenges.advanced;

import java.time.Duration;
import java.time.Instant;

import static java.lang.Long.getLong;

public class InstantView {

  public static void main(String[] args) {
    Instant createAt = Instant.now();
    System.out.println(createAt);
    for (int i = 0; i < 1000; i++) {
      System.out.printf("%d ", i % 16);
    }
    Instant stoppedAt = Instant.now();

    String crt = String.valueOf(createAt);
    System.out.println(createAt);
    System.out.println(stoppedAt);

    Duration duration = Duration.between(createAt, stoppedAt);

    System.out.println("Duration difference: -> " + duration);
    System.out.println(duration.toNanos());
    String c = createAt.toString();
    String d = stoppedAt.toString();
    System.out.println(c);
    System.out.println(d);


  }
}
