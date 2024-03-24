package br.dev.ferreiras.udemy.dsa.hashTable;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashTable {
  private Integer size = 7;

  // Array of pointers to Nodes
  private final Node[] dataMap;

  public HashTable() {
    dataMap = new Node[size];
  }

  public void printTable() {
    for (int i = 0; i < dataMap.length; i++) {
      System.out.println(i + ": ");
      Node temp = dataMap[i];
      while (temp != null) {
        System.out.println("   {" + temp.getKey() + "= " + temp.getValue() + "}");
        temp = temp.next;
      }
    }
  }

  public Integer hash(String key) {
    int hash = 0;
    char[] keyChars = key.toCharArray();
    int size = keyChars.length;
    for (int asciiValue : keyChars) {
      hash = (hash + asciiValue * 37) % dataMap.length;
      System.out.println("Hash: " + hash + " base: " + asciiValue);
    }

    return hash;
  }

  public void set(String key, Integer value) {
    int index = hash(key);
    Node newNode = new Node(key, value);
    if (dataMap[index] == null) {
      dataMap[index] = newNode;
    } else {
      Node temp = dataMap[index];
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
  }

  public Integer get(String key) {
    Integer index = hash(key);
    Node temp = dataMap[index];
    while (temp != null) {
      if (temp.getKey().equals(key)) return temp.getValue();
      temp = temp.next;
    }

    return 0;
  }

  public List<String> keys() {
    List<String> allKeys = new ArrayList<>();
    for (int i = 0; i < dataMap.length; i++) {
      Node temp = dataMap[i];
      while (temp != null) {
        allKeys.add(temp.getKey());
        temp = temp.next;
      }
    }

    return allKeys;
  }

  public boolean itemsInCommon(int[] a, int[] b) {
    for (int i : a) {
      for (int j : b) {
        if (i == j) return true;
      }
    }
    return false;
  }

  public boolean itemInCommon(int[] a, int[] b) {
    Map<Integer, Boolean> map = new HashMap<>();
    for (int i : a) {
      map.put(i, true);
    }

    for (int j : b) {
      if (map.containsKey(j)) {
        return map.get(j);
      }
    }
    return false;
  }

  public static List<Integer> findDuplicates(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    for (int num : nums) {
      if (!map.containsKey(num)) {
        map.put(num, 1);
      } else {
        map.put(num, map.getOrDefault((num), 1) + 1);
      }
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > 1) {
        list.add(entry.getKey());
      }
    }

    return list;
  }
}