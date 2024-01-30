package udemy.dsa.doublyLinkedList;

import javax.xml.transform.sax.SAXSource;

public class Main {
  public static void main(String[] args) {
    int value = 20;

    DoublyLinkedList dbLList = new DoublyLinkedList(1);
    for (int i = 5; i < value; i += 2) {
      dbLList.append(i);
    }
    dbLList.printAll();
    System.out.println();
    DoublyLinkedList.Node currentNode = dbLList.getHead();
    System.out.println("Head: " + currentNode.value);
    currentNode = dbLList.getTail();
    System.out.println("Tail: " + currentNode.value);
    currentNode = dbLList.getHead();
    dbLList.removeLast();

    dbLList.printList();
    System.out.println();
    dbLList.prepend(57);
    dbLList.printList();
    System.out.println();
    dbLList.removeFirst();
    dbLList.printList();
    System.out.println();
    currentNode = dbLList.get(4);
    System.out.println("Node at index: " + currentNode.value);
    System.out.println(dbLList.set(7, 57));
    dbLList.printAll();
    System.out.println(dbLList.insert(6, 57));
    dbLList.printAll();
    System.out.println(dbLList.remove(4));
    dbLList.printAll();
  }
}

