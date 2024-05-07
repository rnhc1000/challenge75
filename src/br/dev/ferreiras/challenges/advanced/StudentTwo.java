package br.dev.ferreiras.challenges.advanced;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public record StudentTwo(String name, double averageScore) {

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", averageScore=" + averageScore +
            '}';
  }

  public static void main(String[] args) {

    List<StudentTwo> allStudents = Arrays.asList(
            new StudentTwo("Jimmy", 30),
            new StudentTwo("Michael", 45),
            new StudentTwo("Aaron", 50),
            new StudentTwo("Anna", 65),
            new StudentTwo("Dave", 73),
            new StudentTwo("Sarah", 100),
            new StudentTwo("Cameron", 30),
            new StudentTwo("James", 20));

    allStudents.stream()
            .takeWhile(student -> student.averageScore() > 65)
            .forEach(System.out::println);

    List<StudentTwo> nextYearStudents = allStudents.stream()
            .sorted(Comparator.comparingDouble(StudentTwo::getAverageScore))
            .dropWhile(student -> student.getAverageScore() < 65)
            .peek(student ->
                    System.out.printf("Graduating student name: %s score: %.1f%n",
                            student.getName(),
                            student.getAverageScore()))
            .collect(Collectors.toList());

    System.out.println(nextYearStudents);
  }

  private String getName() {
    return name;
  }

  private double getAverageScore() {
    return averageScore;
  }
}

