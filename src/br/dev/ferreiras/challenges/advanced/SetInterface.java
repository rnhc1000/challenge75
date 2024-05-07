package br.dev.ferreiras.challenges.advanced;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

  public static void main(String[] args) {
    performSetOperations(new HashSet<>());
    performSetOperations(new LinkedHashSet<>());
    performSetOperations(new TreeSet<>());

  }
  public static void performSetOperations(Set<Integer> set) {
    set.add(20);
    set.add(10);
    set.add(30);
    for (Integer s : set) {
      System.out.printf("%d ",s);
    }
    System.out.println();
  }
}
