package br.dev.ferreiras.udemy.dsa.heap;

public class MinMax {

  public static void main(String[] args) {

    MinHeap myHeap = new MinHeap();
    myHeap.insert(99);
    myHeap.insert(72);
    myHeap.insert(61);
    myHeap.insert(58);

    System.out.println(myHeap.getHeap());

    myHeap.insert(10);

    System.out.println(myHeap.getHeap());

    myHeap.insert(75);

    System.out.println(myHeap.getHeap());

        /*
            EXPECTED OUTPUT:
            ----------------
            [58, 61, 72, 99]
            [10, 58, 72, 99, 61]
            [10, 58, 72, 99, 61, 75]
        */

  }

}
