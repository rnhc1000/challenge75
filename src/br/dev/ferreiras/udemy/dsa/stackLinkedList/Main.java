package br.dev.ferreiras.udemy.dsa.stackLinkedList;

public class Main {
  public static void main(String[] args) {
    int value = 23;
    Stack stack = new Stack(value);

    stack.push(3);
    stack.push(2);
    stack.push(1);
    stack.printStack();
    stack.pop();
    stack.printStack();
  }
}
