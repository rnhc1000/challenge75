package br.dev.ferreiras.udemy.review;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrencyMapClass {
  public static void main(String[] args) {
//    ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

    Map<String, Integer> map = new HashMap<>();
    map.put("A", 1);
    map.put("B", 2);
    map.put("C", 3);
    map.put("D", 4);

    System.out.println(map);


  }
}
