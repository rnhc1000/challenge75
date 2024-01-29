package udemy.dsa.LinkedListChallenges;

import java.util.HashSet;
import java.util.Set;

/**
 * LL: Find Middle Node ( ** Interview Question)
 * Implement a method called findMiddleNode that returns the middle node
 * of the linked list.
 * <p>
 * If the list has an even number of nodes, the method should return the
 * second middle node.
 * <p>
 * <p>
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
 * <p>
 * myList.append(6);
 * middleNode = myList.findMiddleNode();
 * System.out.println(middleNode.value); // Output: 4
 * <p>
 * <p>
 * When the linked list has an odd number of nodes, like 1 -> 2 -> 3 -> 4 -> 5,
 * the function will find the exact middle node. In this case, it will return the
 * node containing the value 3.
 * <p>
 * When the linked list has an even number of nodes, there will be two middle nodes.
 * The findMiddleNode function will return the second of these two middle nodes.
 * <p>
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
 * <p>
 * Initialize two pointers: slow and fast, both pointing to the head of the list.
 * While fast is not null and the next node of fast is not null:
 * Move slow one step ahead (i.e., slow = slow.next).
 * Move fast two steps ahead (i.e., fast = fast.next.next).
 * <p>
 * When the while loop ends, slow will point to the middle node of the list. Return slow.
 * <p>
 * <p>
 * <p>
 * This algorithm uses the slow and fast pointer technique, also known as Floyd's Tortoise and Hare algorithm, to find the middle element of the linked list.
 */
public class LinkedList {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList(3);
    linkedList.append((8));
    linkedList.append((5));
    linkedList.append((10));
    linkedList.append((2));
    linkedList.append((1));
    linkedList.append((5));

    linkedList.printAll();
    System.out.println();
    Node node = linkedList.findMiddleNode();
    System.out.println(node);

//    linkedList.partitionList(5);

    linkedList.removeDuplicates();
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
    while (fastPointer != null && fastPointer.next != null) {
      currentNode = currentNode.next;
      fastPointer = fastPointer.next.next;
    }
    return currentNode;
  }

  public boolean hasLoop() {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow) {
        return true;
      }
    }
    return false;
  }

  public Node findKthFromEnd(Integer k) {
    Node fast = head;
    Node slow = head;
    while (k > 0) {
      if (fast == null) return null;
      fast = fast.next;
      k--;
    }
    while (fast != null) {
      fast = fast.next;
      slow = slow.next;
    }
    return slow;
  }

  public void partitionList(Integer x) {

    if (head == null) return;
    Node currentNode = head;
    Node small = new Node(0);
    Node previousOne = small;
    Node large = new Node(0);
    Node previousTwo = large;


    while (currentNode != null) {
      if (currentNode.value < x) {
        previousOne.next = currentNode;
        previousOne = currentNode;
      } else if (currentNode.value > x) {
        previousTwo.next = currentNode;
        previousTwo = currentNode;
      }
      currentNode = currentNode.next;
      previousTwo.next = null;
      previousOne.next = large.next;
      head = small.next;
    }
  }

  public void removeDuplicates() {

    if (head == null) return;

    Set<Integer> set = new HashSet<Integer>();

    Node currentNode = head;
    Node previous = null;

    while (currentNode != null) {
      if (set.contains(currentNode.value)) {
        previous.next = currentNode.next;
        //length--;
      } else {
        set.add(currentNode.value);
        previous = currentNode;
      }
      currentNode = currentNode.next;
    }
  }

  public int binaryToDecimal() {

    Node currentNode = head;
    int num = 0;
    while (currentNode != null) {
      num = 2 * num + currentNode.value;
      currentNode = currentNode.next;
    }
    return num;
  }

  public void reverseBetween(int m, int n) {
    if(head == null) return;
    Node dummy = new Node(0);
    dummy.next = head;
    Node previous = dummy;
    for (int i = 0; i < m; i++) {
      previous = previous.next;
    }
    Node currentNode = previous.next;
    int diff = n-m;
    while (diff > 0) {
      Node nodeToMove = currentNode.next;
      currentNode.next = nodeToMove.next;
      nodeToMove.next = previous.next;
      previous.next = nodeToMove;
      diff--;
    }
    head = dummy.next;
  }
}
