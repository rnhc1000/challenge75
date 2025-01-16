package br.dev.ferreiras.challenges.advanced;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BooleanApproach {

  enum Weekday{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ;

    static Weekday getWeekday(int index) {
      return values()[index];
    }
  }

  enum Status {
    SUCCESS,
    FAILURE;

    enum Type {
      TEMPORARY,
      PERMANENT
    }
  }

  enum Color {
    RED, GREEN, BLUE;

    Color() {
//      System.out.println(this.name());
    }
  }

  public static void main(String[] args) {
    final Logger logger = Logger.getLogger(BooleanApproach.class.getName());

    Status.Type type = Status.Type.PERMANENT;

    logger.log(Level.INFO, "::: NESTED ENUM: {0} ::::", type);

    Color color = Color.RED;

    logger.log(Level.INFO, "::: CONSTRUCTOR ENUM: {0} ::::", color);

    Random random = new Random();
    int num1 =  random.nextInt(100);
    logger.log(Level.INFO, ":::  NUMBER 1: {0} ::: ", num1);

    random = new Random();
    int num2 = random.nextInt(100);
    logger.log(Level.INFO, "::: NUMBER 2: {0} ::: ", num2);

    boolean flag = false;
    flag = (num1 != num2 ) && (num2 > random.nextInt(50));
    logger.log(Level.INFO, "::: FIRST CHECK: {0} ::: ", flag);

    flag = num1 != num2 || num2 <= 7;
    logger.log(Level.INFO, ":::  SECOND CHECK: {0} ::: ", flag);

    logger.log(Level.INFO, ":::  DAY OF THE WEEK: {0} ::: ", Weekday.getWeekday(4));

    Set<String> set = new LinkedHashSet<>();
    set.add("A");
    set.add("B");
    set.add("C");
    set.forEach(x -> logger.log(Level.INFO, "::: SET VALUE: {0} :::", x));
    logger.log(Level.INFO, "::: FIRST ELEMENT: {0} :::", set.stream().sorted().toList().getFirst());
    logger.log(Level.INFO, "::: LAST ELEMENT:  {0} :::", set.stream().sorted().toList().getLast());

    List<String> list = List.of("C", "B", "A");
    List<String> ordered = list.stream().sorted().toList();
    logger.log(Level.INFO, "::: SET VALUE: {0} :::", ordered);

    list = List.of("X", "C", "J", "A", "Z", "A");
    Set<String> s = new HashSet<>(list);
    logger.log(Level.INFO, "List -> Set {0}", s.stream().sorted().toList());
  }

}
