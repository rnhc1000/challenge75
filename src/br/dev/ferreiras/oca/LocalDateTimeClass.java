package br.dev.ferreiras.oca;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LocalDateTimeClass {
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2012, 1, 11);
    Period period = Period.ofMonths(2);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
    System.out.print(formatter.format(date.minus(period)));

    /*
     * 11-11-12
     */

    LocalDate newYear = LocalDate.of(2018, 1, 1);
    LocalDate christmas = LocalDate.of(2018, 12, 25);
    boolean flag1 = newYear.isAfter(christmas);
    boolean flag2 = newYear.isBefore(christmas);
    System.out.println(flag1 + ":" + flag2);
    try {
      LocalDate datex = LocalDate.of(2020, 9, 31);
      System.out.println(datex);
    } catch (DateTimeException dx) {
      System.out.println("Data Invalida! " + dx.getMessage());
    }
    List<LocalDate> dates = new ArrayList<>();
    DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    dates.add(LocalDate.parse("2018-07-11"));
    dates.add(LocalDate.parse("1919-02-25"));
    dates.add(LocalDate.of(2020, 4, 8));
    dates.add(LocalDate.of(1980, Month.DECEMBER, 31));
    for (LocalDate d : dates) {
      System.out.println(d.format(formater));
    }
    dates.removeIf(x -> x.getYear() < 2000);
    System.out.println(dates);

    Period periods = Period.of(0, 0, 0);
    System.out.println(periods);

    date = LocalDate.parse("1947-08-14");
    LocalTime timex = LocalTime.MAX;
    System.out.println(date.atTime(timex));
    LocalDateTime obj = LocalDateTime.now();
    System.out.println(obj.getSecond());
    System.out.println(MyLocalDate.showDateInAnotherFormat("1980-03-16"));
    LocalDate datex = LocalDate.parse("1980-03-16");
    System.out.println(datex);
  }
  static class MyLocalDate  {
    public static String showDateInAnotherFormat(String data) {

      LocalDate date = LocalDate.parse(data);
      return date.getDayOfMonth() + "-" + date.getMonthValue() +
              "-" +  date.getYear();
    }
  }
}
