package br.dev.ferreiras.oca;

import java.util.ArrayList;
import java.util.List;

import static br.dev.ferreiras.oca.Message.change;

class Message {
  static String msg = "Happy New Year!";

  public static void print() {
    System.out.println(msg);
  }

  public static void change(Message m) { //Line n5
    m = new Message(); //Line n6
    m.msg = "Happy Holidays!"; //Line n7
  }
}

public class SpecialString {
  String str;

  SpecialString(String str) {
    this.str = str;
  }


  public static void main(String[] args) {
    Object[] arr = new Object[4];
    for (int i = 1; i <= 3; i++) {
      switch (i) {
        case 1:
          arr[i] = new String("Java");
          break;
        case 2:
          arr[i] = new StringBuilder("Java");
          break;
        case 3:
          arr[i] = new SpecialString("Java");
          break;
      }
    }
    for (Object obj : arr) {
      System.out.println(obj);
    }
    Message obj = new Message(); //Line n1
    obj.print(); //Line n2
    change(obj); //Line n3
    obj.print();
    String s = new String("Hello");
    List<String> list = new ArrayList<>();
    list.add(s);
    list.add(new String("Hello"));
    list.add(s);
    s = s.replace("l", "L");
    System.out.println(s);
    System.out.println(list);//Line n4
  }
}


