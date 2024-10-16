package br.dev.ferreiras.galego.datastructures;

/*
Design a stack that supports push, pop, top, and retrieving the minimumimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int value) pushes the element value onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimumimum element in the stack.
You must implement a solution with O(1) time complexity for each function.
Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack mStack = new MinStack();
mStack.push(-2);
mStack.push(0);
mStack.push(-3);
mStack.getMin(); // return -3
mStack.pop();
mStack.top();    // return 0
mStack.getMin(); // return -2


Constraints:

-231 <= value <= 231 - 1
Methods pop, top and getMin operations will always be called on non-empty stacks.
At most 3 * 104 calls will be made to push, pop, top, and getMin.
 */
public class MinStack {

  private class Node {

    private int value;
    private int minimum;
    private Node next;

    private Node(int value, int minimum, Node next) {
      this.value = value;
      this.minimum = minimum;
      this.next = next;
    }
  }

  private Node head;

  public void push(int number) {
    if (head == null)
      head = new Node(number, number, null);
    else
      head = new Node(number, Math.min(number, head.minimum), head);
  }

  public void pop() {
    head = head.next;
  }

  public int top() {
    return head.value;
  }

  public int getMin() {
    return head.minimum;
  }

  public static void main(String[] args) {
    MinStack obj = new MinStack();
    obj.push(4);
    obj.pop();
    int param_3 = obj.top();
    int param_4 = obj.getMin();
  }

}
