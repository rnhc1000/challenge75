package br.dev.ferreiras.challenges.containsDuplicates;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesExist {
  public static void main(String[] args) {
    int[] numbers = {1,2,2,1,4};
    boolean response = existDuplicates(numbers);
    if (response) {
      System.out.println("There are duplicates!");
    } else {
      System.out.println("No duplicates!");
    }
    List<Integer> index = duplicatesIndexes(numbers);
    System.out.println(index);
  }

  public static List<Integer> duplicatesIndexes(int[] numbers) {
    int keyOne=0;
    List<Integer> index = new ArrayList<>();
    int size = numbers.length;
    for (int i = 0; i < size; i++) {
      for (int j = i+1; j < size; j++) {
        if (numbers[i] == numbers[j]) {
          index.add(j);
        }
      }
    }
    return index;
  }
  public static boolean existDuplicates(int [] numbers) {
    Set<Integer> set = new LinkedHashSet<>();
    for (int number : numbers) {
      if (set.contains(number)) {
        return true;
      }
      set.add(number);
    }
    return false;
  }
  public static boolean duplicatesExist(int[] numbers) {
    boolean duplicates = false;
    int size = numbers.length;
    Set<Integer> noDuplicates = new LinkedHashSet<>();
    for (int i : numbers) {
      noDuplicates.add(i);
    }
    if (size != noDuplicates.size()) {
      duplicates = true;
    } else {
      return false;
    }
    return duplicates;
  }
}
