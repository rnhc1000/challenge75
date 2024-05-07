package br.dev.ferreiras.challenges.advanced;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FunctionalOne {
  public static void main(String[] args) {
    functionalOne();
  }

  public static void functionalOne() {
    Map<Integer, Integer> map = new HashMap<>();
    IntStream.range(0, 10).forEach(x -> map.put(x, x + 1));
    System.out.println(map);
    Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
    Stream<Map.Entry<Integer, Integer>> entriesStream = entries.stream();
    int sum = entries.stream().mapToInt(Map.Entry::getValue).sum();
    System.out.printf("%d ", sum);
    //int sum = map.stream().mapToInt(entry -> entry.getValue()).sum();
    Stream<Integer> streamOne = Arrays.asList(1, 2, 3).stream();
    Stream<Integer> streamTwo = Stream.of(1, 2, 3);
    //Stream<Integer> streamThree = Arrays.stream(new int[] {1,2,3});
    IntStream StreamFour = IntStream.range(1, 5);
    List<Integer> listOne = Arrays.asList(1, 5, 3, 2, 4);
    listOne.stream()
            .sorted()
            .forEach(x -> System.out.printf("%d ", x));

    List<Integer> listTwo = List.of(1, 2, 3);
    listTwo.stream()
            .map(i -> {
              int newValue = i * 2;
              System.out.printf("%d ", newValue);
              return newValue;
            });
    System.out.println(listTwo);
//    System.out.println(listDouble);
    List<Integer> originalList = List.of(5, 3, 2, 1, 4);

    List<Integer> newList = originalList
            .parallelStream()
            .sorted()
            .toList();
    System.out.println(newList);
    List<Integer> newListOne = new ArrayList<>();
    originalList.parallelStream()
            .sorted()
            .forEach(i -> newListOne.add(i));
    System.out.println(newListOne);
    List<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

    Stream<String> fruitsStream = fruits.stream().map(String::toUpperCase);

    fruits.add("mango");
    System.out.println(fruitsStream.collect(Collectors.joining(",")));
    List<Integer> employeeIds = Arrays.asList(4, 2, 6, 10, 0);

    if (employeeIds.stream().allMatch(id -> id % 2 == 0)) {
      System.out.println(employeeIds.stream()
              .filter(id -> id % 2 == 0)
              .collect(Collectors.toList()));
    }

    if (employeeIds.stream().anyMatch(id -> id % 3 == 0)) {
      System.out.println(employeeIds.stream()
              .filter(id -> id % 3 == 0)
              .collect(Collectors.toList()));
    }

    if (employeeIds.stream().noneMatch(id -> id % 4 == 0)) {
      System.out.println(employeeIds.stream()
              .filter(id -> id % 4 == 0)
              .collect(Collectors.toList()));
    }

  }
}
