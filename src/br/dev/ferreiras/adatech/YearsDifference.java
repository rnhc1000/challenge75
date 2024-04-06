package br.dev.ferreiras.adatech;
/*
Given two dates as Strings return the difference of years.
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class YearsDifference {

  public static void main(String[] args) {
    String inicio = "18/10/1957";
    String atual  = "18/10/2024";
    int r = getYearsDifference(inicio, atual);
    System.out.println(r);
  }

  public static int getYearsDifference(String inicio, String fim) {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    int start = LocalDate.parse(inicio, formatter).getYear();
    int end =   LocalDate.parse(fim, formatter).getYear();

    return end - start;
  }
}


