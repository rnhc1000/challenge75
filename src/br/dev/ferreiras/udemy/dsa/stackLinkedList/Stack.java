package br.dev.ferreiras.udemy.dsa.stackLinkedList;

public class Stack {

  private Node top;
  private Integer height;

  public Stack(Integer value) {
    top = new Node(value);
    height = 1;
  }

  public void printStack() {

    while(top != null) {
      System.out.print(" " +  top.value);
      top = top.next;
    }
  }

  static class Node {
    Integer value;
    Node next;
    public Node (Integer value) {
      this.value = value;
    }
  }

  public void push(Integer value) {
    Node newNode = new Node(value);
    if (height == 0) {
      top = newNode;
    } else {
      newNode.next = top;
      top = newNode;
    }
    height++;
  }

  public Node pop() {
    if (top == null)  return null;
    Node temp = top;
    top=top.next;
    temp.next = null;
    height--;
    return temp;
  }
}
