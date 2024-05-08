package br.dev.ferreiras.oca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEmployee {
   private String name;
    private int age;
    private double salary;

    public PredicateEmployee(String name, int age, double salary) {
      this.name = name;
      this.age = age;
      this.salary = salary;
    }

    public String getName() {
      return name;
    }

    public int getAge() {
      return age;
    }

    public double getSalary() {
      return salary;
    }

    public String toString() {
      return name;
    }
  }

  class Test {
  char var1;
  double var2;
  float var3;
    public static void main(String [] args) {
      List<PredicateEmployee> list = new ArrayList<>();
      list.add(new PredicateEmployee("James", 25, 15000));
      list.add(new PredicateEmployee("Lucy", 23, 12000));
      list.add(new PredicateEmployee("Bill", 27, 10000));
      list.add(new PredicateEmployee("Jack", 19, 5000));
      list.add(new PredicateEmployee("Liya", 20, 8000));
      Test obj = new Test();
      System.out.println("> " + obj.var1);
      System.out.println("> " + obj.var2);
      System.out.println("> " + obj.var3);
      int [] array [] = new int [8][];


//      process(list, (PredicateEmployee employee) -> { return employee.getSalary() >= 10000;});
      process(list, (e) ->  e.getSalary() >= 10000);

      System.out.println(list);
    }

    private static void process(List<PredicateEmployee> list, Predicate<PredicateEmployee> predicate) {
      Iterator<PredicateEmployee> iterator = list.iterator();
      while(iterator.hasNext()) {
        if(predicate.test(iterator.next()))
          iterator.remove();
      }
    }
  }

