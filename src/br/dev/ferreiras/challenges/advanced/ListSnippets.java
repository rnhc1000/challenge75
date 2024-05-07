package br.dev.ferreiras.challenges.advanced;

import java.util.*;

public class ListSnippets {

  //  public static <T> T[] replicate(T element, int count) {
//    T[] array = new T[];
//    for (int i = 0; i < count; i++) {
//      array[i] = element;
//    }
//    return array;
//  }
  public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<>();
//    List<Number> numberList = integerList;
//
    List<Integer> intList = new ArrayList<>();
    Collection<Integer> integerCollection = intList;

    intList.add(1);
    intList.add(2);
    intList.add(3);

    //List<Integer>  ArrayLists = new List<Integer>(4);
//    System.out.println(integerCollection);
    int[] number = {1, 2, 3};
    int count = 3;
    List<Integer> unmodifiable = Collections.unmodifiableList(intList);
    //unmodifiable.add(4);
    System.out.println(unmodifiable);
    //replicate(number, count);
    Integer[] arrayOfIntegers = {1, 2, 3, 4, 5, 8, 9, 10};
    List<Integer> listOfIntegers = Arrays.asList(arrayOfIntegers);
    listOfIntegers.set(2, 30);
    System.out.println(listOfIntegers);
    //listOfIntegers.add(6);
    //System.out.println(listOfIntegers);

    List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
    List<String> listOne = List.of("Ricardo", "Alves", "Ferreira", "Silva");
    System.out.println(traverseReverse(list));

  }

  public static <T extends Integer> List<T> traverseReverse(List<T> elements) {
    List<T> response = new ArrayList<T>();
    for (T element : elements) {
      System.out.printf("%s ", element);
    }

    System.out.println(elements);

    ListIterator<T> iterator = elements.listIterator(elements.size());
    while (iterator.hasPrevious()) {
      {
        response.add(iterator.previous());
      }
    }

    int size = elements.size()-1;

    for (int i = size; i >= 0; i--) {

      System.out.printf("%s ",elements.get(i));
    }

    return response;
  }
}
