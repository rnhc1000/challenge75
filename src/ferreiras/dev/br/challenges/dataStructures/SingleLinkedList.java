package ferreiras.dev.br.challenges.dataStructures;

class Node {
  Integer data;
  Node next;

  Node(Integer data, Node next) {
    this.data = data;
    next = null;
  }

  Node(Integer data) {
    this.data = data;
  }

  Node() {
  }

  @Override
  public String toString() {
    return "ListNode{" +
            "data= " + data +
            ", next= " + next +
            '}';
  }
}

class SinglyLinkedList {
  Integer length = 0;
  Node head = null;
  Node tail = null;


  SinglyLinkedList() {
  }

  public void push(Integer data) {
    Node newOne = new Node(data);
    if (head == null) {
      newOne.next = null;
      head = newOne;
    } else {
      newOne.next = head;
      head = newOne;
    }
  }

  public int getCount() {
    Node node = head;
    int count = 0;
    while (node != null) {
      count++;
      node = node.next;
    }
    return count;
  }

  public Node reverse(Node node) {
    Node prev = null;
    Node next = null;
    Node current = node;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    node = prev;
    return node;
  }
  void printList(Node node) {
    while (node != null) {
      System.out.print("+" + node.data + " ");
      node = node.next;
    }
    System.out.println();
  }
  @Override
  public String toString() {
    return "SinglyLinkedList{" +
            "length=" + length +
            ", head=" + head +
            ", next=" + new Node().next +
            ", tail=" + tail +
            '}';
  }
}



public class SingleLinkedList {

  public static void main(String[] args) {
//    ListNode first = new ListNode(1);
//    first.next = new ListNode(2);
//    first.next.next = new ListNode(3);
//    System.out.println(first);
    SinglyLinkedList list = new SinglyLinkedList();
    list.push(1);
    list.push(2);
    list.push(3);
    list.push(4);
    list.push(5);
    System.out.println(list);
    System.out.println(list.getCount());
    list.printList(list.head);
    list.head = list.reverse(list.head);
    list.printList(list.head);

    /*
    ListNode{data= 1, next= ListNode{data= 2, next= ListNode{data= 3, next= null}}}
     */
  }

}
