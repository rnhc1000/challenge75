package br.dev.ferreiras.udemy.dsa.queueLinkedList;

public class Queue {

  private Node first;
  private Node last;
  private Integer length;

  static class Node {
    Integer value;
    Node next;

    public Node(Integer value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return "Node{" +
              "value=" + value +
              ", next=" + next +
              '}';
    }
  }

  public Queue(Integer value) {
    Node newNode = new Node(value);
    first = newNode;
    last = newNode;
    length = 1;
  }

  public void printQueue() {
    Node temp = first;
    System.out.println();
    while (temp != null) {
      System.out.print(" " + temp.value);
      temp = temp.next;
    }
  }

  public Node dequeue() {
    if (first == null) return null;
    Node temp = first;
    if (length == 1) {
      first = null;
      last = null;
    } else {
      first = first.next;
      temp.next = null;
    }
    length--;
    return temp;
  }

  public Node getFirst() {
    if (first == null) return null;
    return first;
  }

  public Node getLast() {
    if (last == null) return null;
    return last;
  }
  public int getLength() {
    Node temp = first;
    int size = 0;
    while (temp!= null) {
      size++;
      temp = temp.next;
    }
    return size;
  }
  public void enqueue(Integer value) {
    Node newNode = new Node(value);
    if (first == null) {
      first = newNode;
      last =  newNode;
    } else {
      last.next = newNode;
      last = newNode;
    }
    length++;
  }
}
