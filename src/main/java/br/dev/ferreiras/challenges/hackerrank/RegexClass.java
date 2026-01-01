package br.dev.ferreiras.challenges.hackerrank;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class A {
  int a;
  int b;

  A() {
  }

  A(int a, int b) {
    this.b = b;
    this.a = a;
  }

  int add(int a, int b) {
    return a + b;
  }
}

class B extends A {
  short s = 9;
}

public class RegexClass {
  public static void main(String[] args) {
//    Regex_Test tester = new Regex_Test();
//    String regex = "(\\S{2}\\s+)\\S{2}\\s(\\S{2})";
//    regex = "\\d([a-zA-Z0-9]{4}).+";
//    regex = "^\\d\\w{4}\\$";
//    regex = "\\b[aeiouAEIOU][a-zA-Z].\\b";
//    String toEvaluate = "12\t23\t\t12";
//    toEvaluate = "Found any match?";
//    boolean result = false;
//    result = tester.checker(regex, toEvaluate);
//    //short s = 9;
//    if (result) {
//      System.out.println("Found a match -> " + result);
//    } else {
//      System.out.println("No match -> " + result);
//    }
    //B b = new B();
    //int a = 6;
    //System.out.println(b.add(b.s,a));
    /* Here is a comment /*More comments*/
    //* this is comment // */
//    int[] arr = new int[]{1,-3,2,3,-4};
//    System.out.println(maxAbsoluteSum(arr));
//
//    System.out.printf("%s \n", "Ricardo Ferreira");

    int a = 2;
    int aux = Integer.MIN_VALUE;
    int max = 0;

    Random random = new Random(100);

    System.out.println(random);
    int[] arr = new int[]{1, 4, 16, -7, 39, 12, 15, 57, -32};
    int lenArr = arr.length - 1;
    for (int i = 0; i < lenArr; i++) {
//    for (int i : c){
      aux = arr[i];
      max = Math.max(aux, arr[i + 1]);
//      if (b > c[i+1]){
//       max=b;
//      } else {
//        max=c[i+1];
//      }
    }
    //max = (b > a) ? b : a;
    System.out.println(max);
  }


//  @Override
//  public boolean equals(Object obj) {
//    if (this == obj) return true;
//    if (this == null) return false;
//    if (this.getClass() != obj.getClass()) return false;
//
//    return documento.equals(((Pessoa) obj).documento);
//
//  }

  public static int maxAbsoluteSum(int[] arr) {

    int sum = 0;
    int maxSum = 0;
    int tmpSum = Integer.MIN_VALUE;
    int lenArray = arr.length;
//    for (int i : arr) {
//      sum += i;
//    }
    for (int i = 0; i < lenArray; i++) {
      sum += arr[i];
      if (sum > tmpSum) {
        maxSum = sum;
        tmpSum = maxSum;
      }
      maxSum = sum;

    }

    return Math.abs(maxSum);
  }
}

class Regex_Test {
  public boolean checker(String Regex_Pattern, String toEvaluate) {
//    Scanner input = new Scanner(System.in);
//    String stringToBeTested = input.nextLine();
//    Pattern p = Pattern.compile(Regex_Pattern);
//    Matcher m = p.matcher(stringToBeTested);
//    int count = 0;
//    while(m.find()){
//      count += 1;
//    }
    //System.out.format("Number of matches : %d",count);
    String str = "^([a-zA-Z0-9]{3}\\.|[^a-zA-Z0-9]{3}\\.){3}([a-zA-Z0-9]{3}|[^a-zA-Z0-9]{3})$";

    Pattern p = Pattern.compile(Regex_Pattern);

    Matcher m = p.matcher(toEvaluate);
    //12	23		123
    boolean match = m.matches();

    return match;


  }
}
