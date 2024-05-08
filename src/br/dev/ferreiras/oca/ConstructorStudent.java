package br.dev.ferreiras.oca;

import java.util.ArrayList;
import java.util.List;

public class ConstructorStudent {
  String name;
  int age;

  void ConstructorStudent() {
    ConstructorStudent("James", 25);
  }

  void ConstructorStudent(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

class Counter {
  int count;

  Counter(int count) {
    this.count = count;
  }

  public String toString() {
    return "Counter- " + count;
  }
}

class Tests {
  public static void main(String[] args) {
    ArrayList<Counter> original = new ArrayList<>();
    original.add(new Counter(10));
    original.add(new Counter(20));
    original.add(new Counter(30));
    original.add(new Counter(40));

    ArrayList<Counter> cloned = (ArrayList<Counter>) original.clone();
    cloned.get(0).count = 5;

    System.out.println(cloned);
    ConstructorStudent s = new ConstructorStudent();
    System.out.println(s.name + ":" + s.age);
    String[] names = {"Smith", "Brown", "Thomas", "Taylor", "Jones"};
    List<String> list = new ArrayList<>();
    for (int x = 0; x < names.length; x++) {
      list.add(names[x]);
      switch (x) {
        case 2:
          //continue;
          break;
      }
      break;
    }
    System.out.println(list.size());
    List<Integer> listDeprecated = new ArrayList<Integer>();
    listDeprecated.add(new Integer(2));
    listDeprecated.add(new Integer(1));
    listDeprecated.add(new Integer(0));

    listDeprecated.remove(listDeprecated.indexOf(1));

    System.out.println(listDeprecated);
    do {
      System.out.println(100);
    } while (false);
    System.out.println("Bye");

    List<Character> lx = new ArrayList<>();
    lx.add(0, 'V');
    lx.add(1,'T');
    lx.add( 2,'E');
    lx.add(3, 'O');
//    System.out.println(lx);
//    if(lx.contains('O')) {
//      lx.remove('O');
//    }

    for(char ch : lx) {
      System.out.printf("%c ",ch);
    }
    class Message {
      static void main(String [] args) {
        System.out.println("Welcome " + args[2] + "!");
      }
    }
  }

}


