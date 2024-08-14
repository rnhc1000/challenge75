package br.dev.ferreiras.challenges.linkedin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EvenOddMultiThreaded {

  public static void main(String[] args) throws InterruptedException {
    int n  = 49;
    List<List<Integer>> response = evenOdd(n);

    for (List<Integer> lists : response) {
      System.out.println(lists);
    }
  }

  public synchronized static List<List<Integer>> evenOdd(int n) throws InterruptedException {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> numbers = new LinkedList<>();
    List<Integer> odd = new LinkedList<>();
    List<Integer> even = new LinkedList<>();

    if (n == 0) return list ;
    for (int i = 0; i <= n; i++) {
      numbers.add(i);
    }
    Thread threadEven = new Thread(()-> {

      Thread.currentThread().setName("Thread-even");

      for (int number : numbers) {
        if (number % 2 == 0 ) even.add(number);
      }
      list.add(even);
      System.out.println("["+Thread.currentThread().getName()+"]" + list);

    });

//    threadEven.join();

    Thread threadOdd = new Thread(()-> {
      Thread.currentThread().setName("Thread-odd");

      for (int number : numbers) {
        if (number % 2 == 1 ) odd.add(number);
      }
      list.add(odd);
      System.out.println("["+Thread.currentThread().getName()+"]" + list);


    });
    threadEven.start();
//    threadEven.notifyAll();
    threadEven.join();

    threadOdd.start();
    threadOdd.join();
//    threadOdd.notify();

    return list;
  }
}
