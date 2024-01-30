package udemy.dsa.doublyLinkedList;

public class DoublyLinkedList {
  private Node head;
  private Node tail;
  private Integer length;

  static class Node {
    Integer value;
    Node next;
    Node previous;

    Node(Integer value) {
      this.value = value;
    }
  }

  public DoublyLinkedList(Integer value) {
    Node newNode = new Node(value);
    head = newNode;
    tail = newNode;
    length = 1;
  }


  public Node getHead() {
    Node node = head;
    return head;
  }

  public Node getTail() {
    Node node = tail;
    return tail;
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

  public void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " ");
      temp = temp.next;
    }
  }

  public void append(Integer value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      newNode.previous = tail;
      tail = newNode;
    }
    length++;
  }

  public Node removeLast() {

    if (head == null) return null;
    Node currentNode = tail;

    if (length == 1) {
      head = null;
      tail = null;
    } else {
      tail = tail.previous;
      tail.next = null;
      currentNode.previous = null;
    }
    length--;
    return currentNode;
  }

  public void prepend(int value) {
    Node node = new Node(value);
    if (head == null) {
      head = node;
      tail = node;
    }
    node.next = head;
    head.previous = node;
    head = node;
    head.previous = null;
    length++;
  }

  public void removeFirst() {
    Node node = head.next;
    if (head == null) {
      return;
    }
    if (length == 1) {
      head = null;
      tail = null;
    } else {
      node.previous = null;
      head = node;
    }
    length--;
  }

  public Node get(Integer index) {

    if (index < 0 || index > length) {
      return null;
    }
    Node node = head;
    if (index < length / 2) {
      System.out.println("index < length/2");
      for (int i = 0; i < index; i++) {
        node = node.next;
      }
    } else {
      node = tail;
      System.out.println("index > length/2");
      for (int i = length - 1; i > index; i--) {
        node = node.previous;
      }
    }
    return node;
  }

  public boolean set(Integer index, Integer value) {
    if (index < 0 || index > length) return false;
    Node node = get(index);
    if (node != null) {
      node.value = value;
      return true;
    } else {
      return false;
    }
  }

  public boolean insert(Integer index, Integer value) {

    if (index < 0 || index > length) return false;
    if (index == 0) {
      prepend(value);
      length++;
      return true;
    }
    if (index == length) {
      append(index);
      length++;
      return true;
    }
    Node before = get(index - 1);
    if (before != null) {
      Node newNode = new Node(value);
      Node after = before.next;
      newNode.previous = before;
      before.next = newNode;
      newNode.next = after;
      after.previous = newNode;
      return true;
    }
    return false;
  }

  public Node remove(Integer index) {

    if (index < 0 || index > length) return null;
    if (index == 0) return null;
    if (index.equals(length - 1)) return removeLast();
    Node toBeRemoved = get(index);
    Node before = toBeRemoved.previous;
    Node after = toBeRemoved.next;
    before.next = after;
    after.previous = before;
    toBeRemoved.next = null;
    toBeRemoved.previous = null;
    return toBeRemoved;
  }

  public Node toRemove(Integer index) {

    if (index < 0 || index > length) return null;
    if (index == 0) return null;
    if (index.equals(length - 1)) return removeLast();
    Node toBeRemoved = get(index);
    toBeRemoved.next.previous = toBeRemoved.previous;
    toBeRemoved.previous.next = toBeRemoved.next;
    toBeRemoved.next = null;
    toBeRemoved.previous = null;
    length--;
    return toBeRemoved;
  }
}