package br.dev.ferreiras.udemy.review;

import java.time.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;

class SpecialString {
  String str;
  SpecialString(String str) {
    this.str = str;
  }
}

public class Predicating {

  private static final Logger logger = Logger.getLogger((Predicating.class.getName()));

  record Employee(String name, int age, double salary) {}

  record Student(String name, int age) {}

  record Counter(int count){}


  public static void main(String[] args) {

    Object [] arr = new Object[4];
    for(int i = 1; i <=3; i++) {
      switch(i) {
        case 1:
          arr[i] = new String("Java");
          break;
        case 2:
          arr[i] = new StringBuilder("Java");
          break;
        case 3:
          arr[i] = new SpecialString("Java");
          break;
      }
    }
    for(Object obj : arr) {
      logger.log(Level.INFO, "::: Obj: {0} :::", obj);
    }

    LocalDate date = LocalDate.of(2020, 9, 30);
    logger.log(Level.INFO, "::: Date: {0} :::", date);
//    int [] arr = new int[2];
//    System.out.println(arr[0] + arr[1]);
    String sa = "OCPJP";
    StringBuilder sc = new StringBuilder();
    logger.log(Level.INFO, "::: sc length: {0} :::", sc.length());
    sc = sc.append(sa);
    logger.log(Level.INFO, "::: sa is equal to sc {0} :::", sc);

    ArrayList<Counter> original = new ArrayList<>();
    original.add(new Counter(10));

    ArrayList<Counter> cloned = (ArrayList<Counter>) original.clone();
//    cloned.get(0).count = 5;

    logger.log(Level.INFO, "::: original: {0} :::", original);
    String str = "java";
    StringBuilder sx = new StringBuilder("java");

    System.out.println(str.equals(sx) + ":" + sx.equals(str));
    double price = 90000;
    String model = "";
    if(price > 100000) {
      model = "Tesla Model X";
    } else if(price <= 100000) {
      model = "Tesla Model S";
    }
    logger.log(Level.INFO, "::: Model: {0} :::", model);

    String s = new String("Hello");
    List<String> lw = new ArrayList<>();
    lw.add(s);
    lw.add(new String("Hello"));
    lw.add(s);
    s.replace("l", "L");

    logger.log(Level.INFO, "::: LW: {0} :::", lw);
    logger.log(Level.INFO, "::: s: {0} :::", s);
    String fruit = "mango";
    switch (fruit) {
      default:
        logger.log(Level.INFO, "::: ANY FRUIT WILL DO :::");
      case "Apple":
        logger.log(Level.INFO, "::: APPLE :::");
      case "Mango":
        logger.log(Level.INFO, "::: MANGO :::");
      case "Banana":
        logger.log(Level.INFO, "::: BANANA :::");
        break;
    }
    logger.log(Level.INFO, "::: Output is: {0} :::",10 != 5);
    LocalDateTime obx = LocalDateTime.now();
    logger.log(Level.INFO, "::: SECONDS: {0} :::", obx.getSecond());
    String strx = new String("Core");
    String stry = new String("CoRe");


    StringBuilder bs = new StringBuilder(100);
    logger.log(Level.INFO, "::: BS LENGTH: {0} :::", bs.length());
//    try {
//      main(args);
//    } catch (Exception exp) {
//      System.out.println("CATCH-");
//    }
//    System.out.println("OUT");
    List<Employee> list = new ArrayList<>();
    list.add(new Employee("James", 25, 15000.0));
    list.add(new Employee("Lucy", 23, 12000.0));
    list.add(new Employee("Bill", 27, 10000.0));
    list.add(new Employee("Jack", 19, 5000.0));
    list.add(new Employee("Lia", 20, 8000.0));

    Predicate<Employee> employee = (Employee e) -> {
      return e.age >= 21;
    };
    Predicate<Employee> ex = (employee1) ->  employee1.salary() >= 10000.0;

    process(list, employee);
    logger.log(Level.INFO, "::: employee :::",list);

    process(list, ex);
    logger.log(Level.INFO, "::: ex :::",list);

    StringBuilder sb = new StringBuilder();

    String s1 = sb.toString();
    String s2 = sb.toString();

    System.out.println(s1.equals(s2));

    List<LocalDate> dates = new ArrayList<>();
    dates.add(LocalDate.parse("2018-07-11"));
    dates.add(LocalDate.parse("1919-02-25"));
    dates.add(LocalDate.of(2020, 4, 8));
    dates.add(LocalDate.of(1980, Month.DECEMBER, 31));

    dates.removeIf(x -> x.getYear() < 2000);

    System.out.println(dates);
    System.out.println(sb.append(Optional.ofNullable(null)).length());

    Period period = Period.of(1, 2, 3);
    System.out.println("-> " + period);

    LocalTime time = LocalTime.of(12, 40);
    String amPm = time.getHour() >= 12 ?  "PM" : "AM";
    System.out.println(time + amPm);

    List<Integer> lt = new ArrayList<Integer>();
    lt.add(new Integer(2));
    lt.add(new Integer(1));
    lt.add(new Integer(0));

    lt.remove(lt.indexOf(2));

    System.out.println(lt);

    List<Student> students = new ArrayList<>();
    students.add(new Student("James", 25));
    students.add(new Student("James", 27));
    students.add(new Student("James", 25));
    students.add(new Student("James", 25));

    students.remove(new Student("James", 25));

    for(Student stud : students) {
      System.out.println(stud);
    }
    List<String> dryFruits = new ArrayList<>();
    List<String> wetFruits = new ArrayList<>();
    dryFruits.add("Walnut");
    dryFruits.add("Apricot");
    dryFruits.add("Almond");
    dryFruits.add("Date");

    Iterator<String> iterator = dryFruits.iterator();
    while(iterator.hasNext()) {
      String dryFruit = iterator.next();
      if(dryFruit.startsWith("A")) {
        wetFruits.add(dryFruit);
      }
    }
    System.out.println(dryFruits);
    System.out.println(wetFruits);

    List<Character> lx = new ArrayList<>();
    lx.add(0, 'V');
    lx.add('T');
    lx.add(1, 'E');
    lx.add(3, 'O');

    if(lx.contains('O')) {
      lx.remove(0);
    }

    for(char ch : lx) {
      System.out.print(ch);
    }
    LocalDate newYear = LocalDate.of(2018, 1, 1);
    LocalDate christmas = LocalDate.of(2018, 12, 25);
    boolean flag1 = newYear.isAfter(christmas);
    boolean flag2 = newYear.isBefore(christmas);
    System.out.println(flag1 + ":" + flag2);
  }




  private static void process(List<Employee> list, Predicate<Employee> predicate) {
    list.removeIf(predicate);
  }
}

