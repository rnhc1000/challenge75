package br.dev.ferreiras.arraysOne;
/**
 * To find duplicates the mostcommon approach is
 * to Set the array because Set Coolections do not allow
 * them and compare the size.. If Set.size > array.length
 * there are duplicates....
 * This approach uses a HashMap and a getOrDefault((key),0 + 1)
 * method...
 * For each key (array[i]), add a value if the key do not exist
 * int array = {1,1,2,3,2}
 * map.add(array[i], map.getOrDefault((key),0 + 1)
 * map(1,1)...
 * next i:
 * map(1,2)...
 * next i:
 * map(1,2)
 * map(2,1)...
 */

import java.util.*;

public class FindDuplicates {
  public static void main(String[] args) {
    Random random = new Random();
    int size = random.nextInt(0, 99);
    int[] array = new int[size];

    for (int i = 0; i < size; i++) {
      array[i] = random.nextInt(0, 999);
      System.out.print(" " + array[i]);
    }
    System.out.println();

    int[] duplicates = findDuplicates(array);
    if (duplicates.length == 0) {
      System.out.println("There are no duplicates ['Sorry']");
    } else {
      for (Integer duplicate : duplicates) {
        System.out.print("[ " + duplicate + " ]");
      }
    }
    int[] r = dreamArrayHandling(array);
    System.out.println("---------------");
    System.out.println(Arrays.toString(r));

    System.out.println(duplicatesTortoiseHare());
  }

  public static int[] findDuplicates(int[] numbers) {
    List<Integer> response = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    for (int number : numbers)
      map.put(number, map.getOrDefault((number), 0) + 1);
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > 1) {
        response.add(entry.getKey());
      }
    }
    System.out.println(map.toString());
    int[] duplicates = new int[response.size()];
    int aux = 0;
    for (Integer i : response) {
      duplicates[aux] = i;
      aux++;
    }
    Arrays.sort(duplicates);
    return duplicates;
  }

  public static int[] dreamArrayHandling(int[] numbers) {
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    for (int number : numbers) {
      max = Math.max(max, number);
      min = Math.min(min, number);
    }
    return new int[]{min, max};
  }

  public static int duplicatesTortoiseHare() {
    Random random = new Random();
    int size = random.nextInt(0, 99);
    System.out.println("Size: " + size);
    int[] numbers = new int[size];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < size; i++) {
      numbers[i] = random.nextInt(0, 99);
      max = Math.max(max, numbers[i]);
      min = Math.min(min, numbers[i]);
    }
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));
    System.out.println("Min: " + min);

    int slowPointer = 0, fastPointer = 0;

    int[] nums = { 1,2,3,4,5,6,7,7,8,8,9,9,0};


    do {
      slowPointer = nums[slowPointer];
      fastPointer = nums[nums[fastPointer]];
    } while (slowPointer != fastPointer);

    slowPointer = nums[0];
    while (slowPointer != fastPointer) {
      slowPointer = nums[slowPointer];
      fastPointer = nums[fastPointer];
    }
    return slowPointer;
  }
}

