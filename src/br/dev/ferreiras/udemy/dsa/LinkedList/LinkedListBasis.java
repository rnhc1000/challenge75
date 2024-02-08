package br.dev.ferreiras.udemy.dsa.LinkedList;

/**
 * It is a linear data structure where the elements are not stored in contiguous
 * locations and every element is a separate object with a data part and address part.
 * The elements are linked using pointers and addresses.
 * Each element is known as a node.
 * (head)11 -> 10 -> 5 -> 7(tail) ->null
 */
public class LinkedListBasis {
  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList(4);
//    System.out.println(linkedList);
//    linkedList.printList();
    linkedList.getHead();
//    linkedList.getTail();
//    linkedList.getLength();
    linkedList.append(1);
    linkedList.getHead();
//    linkedList.getTail();
//    linkedList.getLength();
    linkedList.append(7);
//    linkedList.getHead();
//    linkedList.getTail();
//    linkedList.getLength();
//
    Node head = linkedList.getHead();


    Node node = linkedList.removeLast();
    System.out.println("Node removed: " + node);
    node = linkedList.getHead();
    System.out.println("Head: " + node);

    linkedList.getTail();
    int size = linkedList.sizeLinkedList(head);
    System.out.println(size);
    linkedList.prepend(5);
    head = linkedList.getHead();
    linkedList.printHead();
    size = linkedList.sizeLinkedList(head);
    System.out.println(size);
    linkedList.printList();

//    node = linkedList.removeFirst();
//    linkedList.printHead();
//    linkedList.printList();
//    node = linkedList.removeFirst();
    linkedList.printHead();
    linkedList.printList();
    size = linkedList.sizeLinkedList(head);
    System.out.println(size);
    node = linkedList.get(0, size);
    System.out.println(node);
    linkedList.insert(1,57,size);
    linkedList.printList();
    node = linkedList.remove(2,size);
    System.out.println(node);
    linkedList.printList();
    linkedList.reverse(size);
    linkedList.printList();
  }

  static class LinkedList {

    Integer value;
    Node head;

    Node tail;
    Integer length;

    public LinkedList(Integer value) {
      Node newNode = new Node(value);
      head = newNode;
      tail = newNode;
      length = 1;
    }

    public void printList() {
      Node currentNode = head;
      while (currentNode != null) {
        System.out.print(currentNode.value + " ");
        currentNode = currentNode.next;
      }
      System.out.print("\n");
    }

    public int sizeLinkedList(Node head) {
      Node currentNode = head;
      int length = 0;
      while (currentNode != null) {
        length++;
        currentNode = currentNode.next;
      }
      return length;
    }

    public void append(int value) {
      Node newNode = new Node(value);
      if (length == 0) {
        head = newNode;
        tail = newNode;
      } else {
        tail.next = newNode;
        tail = newNode;
      }
      length++;
    }

    public void prepend(Integer value) {
      Node newNode = new Node(value);
      if (head == null) {
        head = newNode;
        tail = newNode;
      } else {
        newNode.next = head;
        head = newNode;
      }
    }

    public Node removeLast() {
      if (length == 0) return null;
      if (head == null || tail == null) return null;
      Node currentNode = head;
      Node previousNode = head;
      while (currentNode.next != null) {
        previousNode = currentNode;
        currentNode = currentNode.next;
      }
      tail = previousNode;
      tail.next = null;
      return currentNode;
    }

    public Node removeFirst() {
      if (head == null) {
        return null;
      }
      Node currentNode = head;
      head = head.next;
      currentNode.next = null;
      return head;
    }

    public Node get(Integer index, int size) {
      if (index < 0 || index > size) {
        return null;
      }
      Node currentNode = head;
      for (int i = 0; i < index; i++) {
        currentNode = currentNode.next;
      }
      return currentNode;
    }

    public boolean insert(Integer index, Integer value, Integer size) {

      if (index < 0 || index > size) return false;
      if (index == 0) prepend(value);
      if (index.equals(size)) {
        append(value);
        return true;
      }
      Node node = new Node(value);
      Node temp = get(index-1, size);
      node.next = temp.next;
      temp.next = node;
      return true;
    }

    public Node remove(Integer index, Integer size) {
      if(index < 0 || index > size) return null;
      if (index == 0) return removeFirst();
      if (index.equals(size)) return removeLast();
      Node previousNode = get(index - 1, size);
      Node toBeRemoved = previousNode.next;
      previousNode.next = toBeRemoved.next;
      toBeRemoved.next = null;
      return toBeRemoved;
    }

    public void reverse(Integer size) {
      Node current = head;
      head = tail;
      tail = current;
      Node beforeCurrent = null;
      Node afterCurrent = head.next;
      for (int i = 0; i < size; i++) {
        afterCurrent = current.next;
        current.next = beforeCurrent;
        beforeCurrent = current;
        current = afterCurrent;
      }
    }
    public Node getHead() {
      return head;
    }

    public void printHead() {
      System.out.println("Head: " + head.value);
    }

    public void getTail() {
      System.out.println("Tail: " + tail.value);
      ;
    }

    public void getLength() {
      System.out.println("Length: " + length);
    }

    @Override
    public String toString() {
      return "LinkedList{" +
              "value=" + value +
              ", head=" + head +
              ", tail=" + tail +
              ", length=" + length +
              '}';
    }
  }

  static class Node {
    int value;
    Node next;

    // Constructor to create a new node
    // Next is by default initialized
    // as null
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
}
