package br.dev.ferreiras.udemy.review;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.Predicate;

public class DatesTimes {

//  public static void main(String[] args) {
//    short[] args = new short[]{50, 50};
//    args[0] = 5;
//    args[1] = 10;
//    System.out.println("[" + args[0] + ", " + args[1] + "]");
//  }

  static     int x = 1;


  public static void main(String[] args) {

    String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

    Predicate<String> p = s -> s.toUpperCase().charAt(0) == 'A';

    processStringArray(arr, p);
    LocalDate date = LocalDate.parse("2024-12-30");
    LocalTime time = LocalTime.MAX;
    System.out.println(date.atTime(time));
    Super s = new Sub();
    try {
      s.m1();
    } catch (IOException e) {
      System.out.print("M");
    } finally {
      System.out.printf("N \n");
    }

    DefaultValues values = new DefaultValues();
    System.out.println(values.var1);
    System.out.println(values.var2);
    System.out.println(values.var3);

    A a = new B();
    B b = new B();
   a.print();
   b.print();

    do {
      System.out.println(100);
    } while (false);
    System.out.println("Bye");

    while(checkAndIncrement(x)) {
      System.out.println(x);
    }
  }

  public static boolean checkAndIncrement(int x) {
    if(x < 5) {
      x++;
      return true;
    } else {
      return false;
    }
  }

  public static void processStringArray(String[] arr,
                                         Predicate<String> predicate) {
    for (String str : arr) {
      if (predicate.test(str)) {
        System.out.println(str);
      }
    }
  }

}

class A {
  public void print() {
    System.out.println("A");
  }
}

class B extends A {
  public void print() {
    System.out.println("B");
  }
}

class DefaultValues {
  char var1;
  double var2;
  float var3;
}

/*
not possible inherits a final class
 */
//class MyLocalDate extends LocalDate {
//  @Override
//  public String toString() {
//    return super.getDayOfMonth() + "-" + super.getMonthValue() +
//           "-" +  super.getYear();
//  }
//}
abstract class Super {
  public abstract void m1() throws IOException;
}

class Sub extends Super {
  @Override
  public void m1() throws IOException {
    throw new FileNotFoundException();
  }
}

interface Printable {
  public void setMargin();

  public void setOrientation();
}

abstract class Paper implements Printable { //Line 7
  public void setMargin() {
  }
  //Line 9
}

abstract class NewsPaper extends Paper { //Line 12
  public void setMargin() {
  }


  //Line 14
}






