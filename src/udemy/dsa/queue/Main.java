package udemy.dsa.queue;

public class Main {
  public static void main(String[] args) {
    Integer value = 1;
    Queue q = new Queue(value);




    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.printQueue();
    int sizeOfQueue = q.getLength();
    System.out.println("\nQueue size: " + sizeOfQueue);
    Queue.Node f1rst = q.getFirst();
    System.out.print("\n" + f1rst);
    Queue.Node l4st = q.getLast();
    System.out.print("\n" + l4st);
    q.dequeue();
    f1rst = q.getFirst();
    System.out.print("\n" + f1rst);
    l4st = q.getLast();
    System.out.print("\n" + l4st);

  }
}
