package ferreiras.dev.br.udemy.dsa.queueStack;

import java.util.Stack;

public class MyQueue {
  private Stack<Integer> stack1;
  private Stack<Integer> stack2;

  public MyQueue() {
    stack1 = new Stack<>();
    stack2 = new Stack<>();
  }

  public void enqueue(Integer value) {
    while(!stack1.isEmpty()) {
      stack2.push(stack1.pop());
    }
    stack1.push(value);
    while(!stack2.isEmpty()) {
      stack1.push(stack2.pop());
    }
  }
  public void enqueue(int value) {
    while (!stack1.isEmpty()) {
      stack2.push(stack1.pop());
    }
    stack1.push(value);
    while (!stack2.isEmpty()) {
      stack1.push(stack2.pop());
    }
  }

  public Integer dequeue() {
    if (stack1.isEmpty()) return null;
    return stack1.pop();
  }
  public int peek() {
    return stack1.peek();
  }

  public boolean isEmpty() {
    return stack1.isEmpty();
  }
}

