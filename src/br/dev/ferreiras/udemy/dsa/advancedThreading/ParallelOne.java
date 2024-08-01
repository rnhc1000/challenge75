package br.dev.ferreiras.udemy.dsa.advancedThreading;

import java.util.List;

public class ParallelOne {

  public static void main(String[] args) {
    List<String> list = List.of("Ricardo", "Alves","Ferreira", "Silva");
    System.out.println("Nome completo -> " + list);
    List<String> upperCase = list
            .parallelStream()
            .map(String::toUpperCase)
            .toList();

    System.out.println(upperCase);

  }
}
