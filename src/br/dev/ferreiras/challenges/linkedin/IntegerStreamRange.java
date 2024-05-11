package br.dev.ferreiras.challenges.linkedin;

import java.util.stream.IntStream;

public class IntegerStreamRange {
  public static void main(String[] args) {

    IntStream.range(1, 6).mapToObj(i -> i + " ").forEach(System.out::print);

  }
}
