package br.dev.ferreiras.adatech;

import java.util.*;
import java.util.stream.Collectors;

public class Challenges {

  public static void main(String[] args) {
    teste();
  }

  public static void teste() {
    Set<String> scope = Set.of("ROLE_ADMIN", "ROLE_USER");
    var scopes = scope.stream().map(x -> x).collect(Collectors.joining(" "));
    System.out.println(scopes);
    List<Integer> list = new ArrayList<>();
    Deque<Integer> queue = new ArrayDeque<>();

    for (int i = 5; i < 200; i += 5) {
      for (int j = 12; j < 200; j += 12) {
        for (int k = 0; k < 200; k += 18) {

          if (i == j && j == k) {
            System.out.println(i);
          }
        }
      }
    }
  }
}


