package br.dev.ferreiras.challenges.dailyChallenges;
/*
LocalDate -> Period p = Period.between( dateOne, dateTwo - YYYY/mm/dd
LocalDateTime -> Duration d = Duration.between(dateTimeOne, dateTimeTwo)
 */
import jdk.jfr.Description;

import java.time.*;


@Description("Time difference between two dates")
public class PeriodOfTime {
  public static void main(String[] args) {
    Period p = Period.between(
            LocalDate.of(2023, Month.MAY,7),
            LocalDate.of(2024, Month.MAY,4)
    );

    System.out.println(p);

    LocalDateTime year23 = LocalDateTime.of(2023, 5, 4, 23, 59, 59);
    LocalDateTime year24 = LocalDateTime.of(2023, 5, 5, 23, 25, 32);
    Duration d = Duration.between(year23, year24);

    System.out.println(d);
  }
}
