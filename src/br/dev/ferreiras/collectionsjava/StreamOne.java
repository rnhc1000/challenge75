package br.dev.ferreiras.collectionsjava;

import java.util.List;

public class StreamOne {
  public static void main(String[] args) {
    List<Integer> list = List.of (1,2,3,4,5,6,7,8,9);
    List<Integer> response = filtering(list);
    System.out.println(response);
    List<Integer> listOne = List.of(1,2,3,4,5,6,7,8,9);
    for (Integer i : listOne) {
      System.out.println((i & 1) == 0);
    }

  }
  public static List<Integer> filtering(List<Integer> list) {


    return list.stream()
               .filter(n -> n % 2  == 0)
               .map(n -> n * 2)
               .toList();
  }
}
