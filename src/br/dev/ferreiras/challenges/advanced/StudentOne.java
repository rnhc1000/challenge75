package br.dev.ferreiras.challenges.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentOne {
  private String name;
  private List<Double> grades;

  public StudentOne(String name, Double ... grades) {
    this.name = name;
    this.grades = Arrays.asList(grades);
  }

  public String getName() {
    return name;
  }

  public List<Double> getGrades() {
    return grades;
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", grades=" + grades +
            '}';
  }

  public static void main(String[] args) {
    List<StudentOne> students = new ArrayList<>();

    students.add(new StudentOne("Michael", 90.0, 100.0, 61.0));
    students.add(new StudentOne("Marry", 100.0, 30.0, 10.0, 40.0));
    students.add(new StudentOne("Sarah", 61.0, 100.0, 100.0, 100.0));
    students.add(new StudentOne("Jonny", 37.0, 55.0, 45.0, 0.0));

    double average = students.stream()
            .flatMap(student -> student.getGrades().stream())
            .collect(Collectors.averagingDouble(grade -> grade));

    System.out.println(average);

    double avg = students.stream()
            .flatMapToDouble(student -> student.getGrades()
            .stream()
            .mapToDouble(grade -> grade))
                    .average()
                    .getAsDouble();
    System.out.println(avg);

//    double medium = students.stream()
//            .flatMap(student -> Stream.of(students.getGrades())
//                    .average());
  }

}


