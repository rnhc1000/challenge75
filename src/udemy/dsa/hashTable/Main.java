package udemy.dsa.hashTable;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    HashTable hash = new HashTable();
    hash.printTable();
    //String key = "ferreira";
    //hash.hash(key);
    hash.set("Ricardo", 757);
    hash.set("Ferreira", 777);
    hash.set("Perpetua", 777);
    hash.set("Costa", 777);
    hash.printTable();

    System.out.println(hash.get("Ferreira"));
    System.out.println(hash.get("Rinaldo"));
    List<String> keys = hash.keys();
    for (String s : keys) {
      System.out.print(" Key: " + s);
    }
    int[] a = {2,3,5};
    int[] b = {7,4,6};
    boolean r = hash.itemsInCommon(a, b);
    if (r) {
      System.out.println("\nOK - There is a number in common...");
    } else {
      System.out.println("\nnotOK! Nothing in common...");
    }
    r = hash.itemInCommon(a, b);
    if (r) {
      System.out.println("\nOK - There is a number in common...");
    } else {
      System.out.println("\nnotOK! Nothing in common...");
    }
    int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
    List<Integer> duplicates = HashTable.findDuplicates(nums);
    System.out.println(duplicates);

  }
}
