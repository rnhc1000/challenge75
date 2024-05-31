package br.dev.ferreiras.challenges.dataStructures;

import java.util.Scanner;
import java.util.function.Predicate;

public class Predicates {
  public static void main(String[] args) {
    TaskRunner taskRunner = new TaskRunner();
    Predicate<Integer> lesserThan = x -> (x < 18);
    Scanner input = new Scanner(System.in);
    System.out.print("Input any number: ");
    int age = input.nextInt();
    boolean check = lesserThan.test(age);
    if (check) {
      System.out.println("Number accepted!");
    } else {
      System.out.println("Number larger than maximum!");
    }
    input.nextLine();
    System.out.print("Input a name: ");
    String string = input.nextLine();
//    System.out.println(lesserThan.test(10));
    Predicate<String> p1 = s -> s.length() > 4;
    Predicate<String> p2 = s -> s.startsWith("J");
    boolean result = p1.negate().test(string);// true
    result = p1.negate().or(p2).test(string); // true
    System.out.println(result);
    input.close();
  }
}
