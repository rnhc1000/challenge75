package br.dev.ferreiras.udemy.review;

import com.sun.jdi.Value;

import java.util.*;

public class GenericTypes {

  public static <K,V> Map<K,V> mapping(Map<K,V> mapa) {

     Map<K,V> map = new TreeMap<>(mapa);

     return map;
  }

  public static <T extends Number> List<T> listOne(List<T> list) {

    return list.stream().sorted().toList();
  }

  public static void main(String[] args) {

    Map<String, Integer> map = new LinkedHashMap<>();
    map.put("Ricardo", 57);
    map.put("Ferreira", 57);
    map.put("Alves", 57);
    map.put("Silva", 57);

    System.out.println(map);
    Map<String, Integer> response = mapping(map);
    System.out.println(response);

    Map<Integer,Integer> mapOne = new HashMap<>();
    mapOne.put(1, 2);
    mapOne.put(5, 6);
    mapOne.put(3, 4);

    mapOne.put(7, 8);
    mapOne.put(9, 10);
    mapOne.put(11, 12);
    mapOne.put(15, 14);

    System.out.println(mapOne);

    Map<Integer,Integer> responseTwo = mapping(mapOne);

    System.out.println(mapOne);

    System.out.println(GenericTypes.class.getClassLoader());
    Runtime runtime = Runtime.getRuntime();
    System.out.println(runtime.maxMemory());
    System.out.println(runtime.totalMemory());
    System.out.println(runtime.freeMemory());
    runtime.gc();
    System.gc();

    List<Number> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(4);

    list.add(1);
    list.add(12);

    System.out.println(list);

    List<Number> listTwo = listOne(list);
    System.out.println(listTwo);

  }

  class GenericClass<T> {

    private T a;
    public T getA() {
      return a;
    }
    public void setA (T a) {
      this.a = a;
    }
  }
}
