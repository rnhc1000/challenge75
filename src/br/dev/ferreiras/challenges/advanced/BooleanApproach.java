package br.dev.ferreiras.challenges.advanced;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BooleanApproach {

  enum Weekday{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ;

    static Weekday getWeekday(int index) {
      return values()[index];
    }
  }



  public static void main(String[] args) {
    final Logger logger = Logger.getLogger(BooleanApproach.class.getName());
    Random random = new Random();
    int num1 =  random.nextInt(100);
    logger.log(Level.INFO, "number 1: {0}", num1);

    random = new Random();
    int num2 = random.nextInt(100);
    logger.log(Level.INFO, "number 2: {0}", num2);

    boolean flag = false;
    flag = (num1 != num2 ) && (num2 > random.nextInt(50));
    logger.log(Level.INFO, "First Check: {0}", flag);

    flag = num1 != num2 || num2 <= 7;
    logger.log(Level.INFO, "Second Check: {0}", flag);

    logger.log(Level.INFO, "Day of the Week: {0}", Weekday.getWeekday(4));
  }
}
