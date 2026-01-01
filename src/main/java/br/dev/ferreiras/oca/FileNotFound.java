package br.dev.ferreiras.oca;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

abstract class Super {
  public abstract void m1() throws IOException;
}

class Sub extends Super {
  @Override
  public void m1() throws IOException {
    throw new FileNotFoundException();
  }
}

public class FileNotFound {
  public static void main(String[] args) {
    Super s = new Sub();
    try {
      s.m1();
    } catch (IOException e) {
      System.out.print("M");

    } finally {
      System.out.print("N");
    }
    StringBuilder sb = new StringBuilder();
    System.out.println(sb.append('a').length());
    List<Character> list = new ArrayList<>();
    list.add('V');
    list.add('T');
    list.add('E');
    list.add('O');

    if(list.contains('O')) {
      list.remove(list.indexOf('O'));
    }

    for(char ch : list) {
      System.out.print(ch);
    }
    System.out.println();
    String [] arr = {"I", "N", "S", "E", "R", "T"};
    for(int n = 0; n <= arr.length; n += 1) {
//    for ( int n = 1; n < arr.length; n += 2){
//    for(int n = 0; n < arr.length; n += 1) {
      //for( int n = 0; n <= arr.length; n += 1) {
      System.out.printf("%d ",n);
      if (n % 2 == 0) {
        continue;
      }
      System.out.printf("%s:", arr[n]); //Line n1
    }
    /*
    0 1 N:2 3 E:4 5 T:6
     */
  }
}
