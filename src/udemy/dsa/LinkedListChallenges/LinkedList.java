package udemy.dsa.LinkedListChallenges;

/**
 * LL: Find Middle Node ( ** Interview Question)
 * Implement a method called findMiddleNode that returns the middle node
 * of the linked list.
 *
 * If the list has an even number of nodes, the method should return the
 * second middle node.
 *
 *
 * Method signature:
 * public Node findMiddleNode()
 * Example:
 * LinkedList myList = new LinkedList(1);
 * myList.append(2);
 * myList.append(3);
 * myList.append(4);
 * myList.append(5);
 * Node middleNode = myList.findMiddleNode();
 * System.out.println(middleNode.value); // Output: 3
 *
 * myList.append(6);
 * middleNode = myList.findMiddleNode();
 * System.out.println(middleNode.value); // Output: 4
 *
 *
 * When the linked list has an odd number of nodes, like 1 -> 2 -> 3 -> 4 -> 5,
 * the function will find the exact middle node. In this case, it will return the
 * node containing the value 3.
 *
 * When the linked list has an even number of nodes, there will be two middle nodes.
 * The findMiddleNode function will return the second of these two middle nodes.
 *
 * For example, if the linked list is 1 -> 2 -> 3 -> 4 -> 5 -> 6,
 * the two middle nodes are 3 and 4. The function will return the node containing
 * the value 4.
 * Note:
 * In this problem, you should use the slow and fast pointer technique
 * (also known as Floyd's Tortoise and Hare algorithm) to find the middle element
 * of the linked list efficiently.
 * The key idea is to have two pointers, one that moves twice as fast as the other.
 * By the time the fast pointer reaches the end of the linked list, the slow pointer
 * will be at the middle.
 * DO NOT use the length attribute in your solution.
 * Pseudo Code:
 *
 * Initialize two pointers: slow and fast, both pointing to the head of the list.
 * While fast is not null and the next node of fast is not null:
 * Move slow one step ahead (i.e., slow = slow.next).
 * Move fast two steps ahead (i.e., fast = fast.next.next).
 *
 * When the while loop ends, slow will point to the middle node of the list. Return slow.
 *
 *
 *
 * This algorithm uses the slow and fast pointer technique, also known as Floyd's Tortoise and Hare algorithm, to find the middle element of the linked list.
 */
public class LinkedList {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList(5);
    linkedList.append((7));
    linkedList.append((5));
    linkedList.append((7));
    linkedList.append((7));
    linkedList.printAll();
    System.out.println();
    Node node = linkedList.findMiddleNode();
    System.out.println(node);
  }

  private Node head;
  private Node tail;

  class Node {
    int value;
    Node next;

    Node(int value) {
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

  public LinkedList(int value) {
    Node newNode = new Node(value);
    head = newNode;
    tail = newNode;
  }

  public Node getHead() {
    return head;
  }

  public Node getTail() {
    return tail;
  }

  public void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " ");
      temp = temp.next;
    }
  }

  public void printAll() {
    if (head == null) {
      System.out.println("Head: null");
      System.out.println("Tail: null");
    } else {
      System.out.println("Head: " + head.value);
      System.out.println("Tail: " + tail.value);
    }
    System.out.println("\nLinked List:");
    if (head == null) {
      System.out.println("empty");
    } else {
      printList();
    }
  }

  public void makeEmpty() {
    head = null;
    tail = null;
  }

  public void append(int value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
  }

  // WRITE FIND MIDDLE NODE METHOD HERE //
  public Node findMiddleNode() {
    if (head == null) return null;
    Node currentNode = head;
    Node fastPointer = head;
    while(fastPointer != null && fastPointer.next != null) {
      currentNode = currentNode.next;
      fastPointer = fastPointer.next.next;
    }
    return currentNode;
  }
}
