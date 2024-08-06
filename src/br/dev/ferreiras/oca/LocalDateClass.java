package br.dev.ferreiras.oca;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

public class LocalDateClass {
 static {
    System.out.println(1);
  }
  public static void main(String[] a) {
    LocalTime time = LocalTime.of(16, 40);
//    String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "PM" : "AM";
    String amPm = time.getHour() >= 12 ? "PM" : "AM";
    System.out.println(amPm);
    String str = "java";
    StringBuilder sb = new StringBuilder("java");

    System.out.println(str.equals(sb) + ":" + sb.equals(str));
    Point p1 = new Point();
    p1.x = 10;
    p1.y = 20;
    Point p2 = new Point();
    p2.assign(p1.x, p1.y);
    System.out.println(p1.toString() + ";" + p2.toString());
    String fruit = "mango";
    switch (fruit) {

      case "apple":
        System.out.println("APPLE");
      case "mango":
        System.out.println("MANGO");
      default:
        System.out.println("ANY FRUIT WILL DO");
      case "banana":
        System.out.println("BANANA");
        break;
    }
    List<String> dryFruits = new ArrayList<>();
    dryFruits.add("Walnut");
    dryFruits.add("Apricot");
    dryFruits.add("Almond");
    dryFruits.add("Date");
    System.out.println(dryFruits);
    Iterator<String> iterator = dryFruits.iterator();
    try {
      while (iterator.hasNext()) {
        String dryFruit = iterator.next();
        if (dryFruit.startsWith("A")) {
          System.out.println(dryFruit.startsWith("A"));
        }
      }
    } catch (RuntimeException ex) {
//      System.out.println(ex.getMessage());
      ex.printStackTrace();

    }

    System.out.println(dryFruits);
    byte var = 100;
    switch(var) {
      case 100:
        System.out.println("var is 100");
        break;
      case -128:
        System.out.println("var is 200");
        break;
      default:
        System.out.println("In default");
    }
    double [] arr = new double[2]; //Line 3
    System.out.println(arr[0]); //Line 4

    String [] array = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

    Predicate<String> p = s -> s.toUpperCase().charAt(0) == 'A';

    processStringArray(array, p);

    System.out.println(processAtomic(5));

  }
  private static void processStringArray(String [] arr, Predicate<String> predicate) {
    for(String str : arr) {
      if(predicate.test(str)) {
        System.out.printf("%s ", str);
      }
    }
  }

  public static int processAtomic(Integer numberOne ){

   AtomicInteger atomicInteger = new AtomicInteger(numberOne);

    System.out.println(atomicInteger.addAndGet(10));
    System.out.println(atomicInteger.getAndAdd(5));

    return atomicInteger.get();
  }

  static class Point {
    int x;
    int y;
    void assign(int x, int y) {
      x = this.x;
      y = this.y;
    }

    public String toString() {
      return "Point(" + x + ", " + y + ")";
    }
  }
}

