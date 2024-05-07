package br.dev.ferreiras.challenges.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
  Given that the passing grade is 65, what is the correct way to create divide the students into 2 groups:
  Students who passed the exam
  Students who did not pass the exam
 */
public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
      this.name = name;
      this.grade = grade;
    }

    public String getName() {
      return name;
    }

    public int getGrade() {
      return grade;
    }

    @Override
    public String toString() {
      return "Student{" +
              "name='" + name + '\'' +
              ", grade=" + grade +
              '}';
    }
  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Michael", 90));
    students.add(new Student("Marry", 100));
    students.add(new Student("Sarah", 61));
    students.add(new Student("Jonny", 37));

    System.out.println("List of students with grade > 65");
    List<Student> passingStudents = students.stream()
                    .filter(student -> student.getGrade() >= 65)
                    .toList();

    students.clear();
    System.out.println(passingStudents);
  }
}
