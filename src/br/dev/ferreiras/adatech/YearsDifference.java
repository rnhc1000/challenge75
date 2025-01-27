package br.dev.ferreiras.adatech;
/*
Given two dates as Strings return the difference of years.
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class YearsDifference {

  public static void main(String[] args) {
    String start = "18/10/1957";
    String end  = "18/10/2024";
    int r = getYearsDifference(start, end);
    System.out.println(r);
  }

  public static int getYearsDifference(String start, String end) {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    int s = LocalDate.parse(start, formatter).getYear();
    int e =   LocalDate.parse(end, formatter).getYear();

    return e - s;
  }
}


