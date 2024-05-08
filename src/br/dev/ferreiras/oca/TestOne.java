package br.dev.ferreiras.oca;


import java.util.ArrayList;
import java.util.List;

class Student {
  String name;
  int marks;

  Student(String name, int marks) {
    this.name = name;
    this.marks = marks;
  }
}

public class TestOne {
  public static void main(String[] args) {
    Student student = new Student("James", 25);
    int marks = 25;
    review(student, marks);
    System.out.println(marks + "-" + student.marks);
    StringBuilder sb = new StringBuilder(100);
    System.out.println(sb.length() + ":" + sb.toString().length());

    System.out.println();
    try {
      m1();
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
    List<String> list1 = new ArrayList<>();
    list1.add("A");
    list1.add("D");

    List<String> list2 = new ArrayList<>();
    list2.add("B");
    list2.add("C");

    list1.addAll(1, list2);

    System.out.println(list1);
    StringBuilder sbx = new StringBuilder("Java");
    String s1 = sbx.toString();
    String s2 = sbx.toString();

    System.out.println(s1.equals(s2));
    System.out.println(s1 == s2);


    Integer  var = 7;
    switch (var) {
      case 7:
        System.out.println("Lucky no. 7");
        break;
      default:
        System.out.println("DEFAULT");
    }

    short [] argx = new short[]{50, 50};
    argx[0] = 5;
    argx[1] = 10;
//    System.out.println("[" + args[0] + ", " + args[1] + "]");
    String str1 = new String("Core");
    String str2 = new String("CoRe");
    System.out.println(str1 = str2);
    List<Student> students = new ArrayList<>();
    students.add(new Student("James", 25));
    students.add(new Student("James", 27));
    students.add(new Student("James", 25));
    students.add(new Student("James", 25));

    students.remove(new Student("James", 25));

    for(Student stud : students) {
      System.out.println(stud);
    }
    int a = 100;
    System.out.println(-a++);
    System.out.println(a);
    List<Integer> list = new ArrayList<>();
    list.add(100);
    list.add(200);
    list.add(100);
    list.add(200);
    list.remove(100);

    System.out.println(list);
  }

  private static void m1() throws Exception { //Line 6
    System.out.println("NOT THROWING ANY EXCEPTION"); //Line 7
  }

  private static void review(Student stud, int marks) {
    marks = marks + 10;
    stud.marks += marks;
  }
}
