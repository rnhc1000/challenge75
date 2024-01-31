package udemy.dsa.doublyLinkedList;

public class DoublyLinkedListDoubly {

  private Node head;
  private Node tail;
  private int length;

  class Node {
    int value;
    Node next;
    Node prev;

    Node(int value) {
      this.value = value;
    }
  }

  public DoublyLinkedListDoubly(int value) {
    Node newNode = new Node(value);
    head = newNode;
    tail = newNode;
    length = 1;
  }

  public Node getHead() {
    return head;
  }

  public Node getTail() {
    return tail;
  }

  public int getLength() {
    return length;
  }

  public void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.value);
      temp = temp.next;
    }
  }

  public void printAll() {
    if (length == 0) {
      System.out.println("Head: null");
      System.out.println("Tail: null");
    } else {
      System.out.println("Head: " + head.value);
      System.out.println("Tail: " + tail.value);
    }
    System.out.println("Length:" + length);
    System.out.println("\nDoubly Linked List:");
    if (length == 0) {
      System.out.println("empty");
    } else {
      printList();
    }
  }

  public void makeEmpty() {
    head = null;
    tail = null;
    length = 0;
  }

  public void append (int value) {
    Node newNode = new Node(value);
    if(length == 0) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
    length++;
  }

  public Node removeLast() {
    if(length == 0) return null;
    Node temp = tail;
    if (length == 1) {
      head = null;
      tail = null;
    } else {
      tail = tail.prev;
      tail.next = null;
      temp.prev = null;
    }
    length--;
    return temp;
  }

  public void prepend(int value) {
    Node newNode = new Node(value);
    if(length == 0) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    }
    length++;
  }

  public Node removeFirst() {
    if(length == 0) return null;
    Node temp = head;
    if(length == 1) {
      head = null;
      tail = null;
    } else {
      head = head.next;
      head.prev = null;
      temp.next = null;
    }
    length--;
    return temp;
  }

  public Node get(int index) {
    if (index < 0 || index >= length) return null;
    Node temp = head;
    if (index < length/2) {
      for (int i = 0; i < index; i++) {
        temp = temp.next;
      }
    } else {
      temp = tail;
      for (int i = length - 1; i > index; i--) {
        temp = temp.prev;
      }
    }
    return temp;
  }

  public boolean set(int index, int value) {
    Node temp = get(index);
    if(temp != null) {
      temp.value = value;
      return true;
    }
    return false;
  }

  public boolean insert(int index, int value) {
    if(index < 0 || index > length) return false;
    if(index == 0) {
      prepend(value);
      return true;
    }
    if(index == length) {
      append(value);
      return true;
    }
    Node newNode = new Node(value);
    Node before = get(index - 1);
    Node after = before.next;
    newNode.prev = before;
    newNode.next = after;
    before.next = newNode;
    after.prev = newNode;
    length++;
    return true;
  }

  public Node remove(Integer index) {
    if(index < 0 || index >= length) return null;

    if (index == 0) {
      return removeFirst();
    }
    if (index == length - 1) {
      return removeLast();
    }
    Node temp = get(index);
    Node before = get(index -1);
    Node after = before.next;

    before.next = temp.next;
    after.prev = before;
    temp.next = null;
    temp.prev = null;
    length--;

    return temp;
  }

  public void swapFirstLast() {
    if (length < 2) return;
    int temp = head.value;
    head.value = tail.value;
    tail.value = temp;
  }
  public void reverse() {
    Node current = head;
    Node temp = null;

    while(current != null) {
      temp = current.prev;
      current.prev = current.next;
      current.next = temp;
      current = current.prev;
    }
    temp = head;
    head = tail;
    tail = temp;
  }
  public boolean isPalindrome() {

    Node h = head;
    Node t = tail;

    while (h != null) {

      if (h.value != t.value) {

        return false;
      }
      h = h.next;
      t = t.prev;
    }
    return true;
  }
  public void swapPairs() {
    if (head == null) return;
    if (length == 1) return;
    Node dummy = new Node(0);
    dummy.next = head;
    Node prev = dummy;
    Node current = head;
    while (head != null && head.next != null) {
      Node one = head;
      Node two = head.next;
      prev.next = two;
      one.next = two.next;
      two.next = one;
      two.prev = prev;
      one.prev = two;
      if (one.next != null) {
        one.next.prev = one;
      }
      head = one.next;
      prev = one;
    }
    head = dummy.next;
    if (head != null) head.prev = null;
  }
}
