package br.dev.ferreiras.challenges.advanced;

import java.util.*;

public class MapClassNull {

  public static void main(String[] args) {
    performMapOperations(new HashMap<>());
    performMapOperations(new LinkedHashMap<>());
//    performMapOperations(new TreeMap<>());
    List<String> employee = new ArrayList<>();
    employee.add("Ricardo");
    employee.add("1");
    System.out.println((String)employee.get(1));
  }
  public static void performMapOperations(Map<Integer, String> map) {
    map.put(100, "Alice");   //line 1
    map.put(200, null);      //line 2
    map.put(null, null);     //line 3
    System.out.println(map); //line 4
  }
}
