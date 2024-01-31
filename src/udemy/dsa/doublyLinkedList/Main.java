package udemy.dsa.doublyLinkedList;

import javax.xml.transform.sax.SAXSource;

public class Main {
  public static void main(String[] args) {
    int value = 20;

    DoublyLinkedListDoubly dbLList = new DoublyLinkedListDoubly(1);
    for (int i = 5; i < value; i += 2) {
      dbLList.append(i);
    }
    dbLList.printAll();
    System.out.println();
    DoublyLinkedListDoubly.Node currentNode = dbLList.getHead();
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
    DoublyLinkedListDoubly myDLL = new DoublyLinkedListDoubly(1);
    myDLL.append(2);
    myDLL.append(3);
    myDLL.append(4);
    myDLL.append(5);

    System.out.println("DLL before remove():");
    myDLL.printList();

    System.out.println("\nRemoved node:");
    System.out.println(myDLL.remove(2).value);
    System.out.println("DLL after remove() in middle:");
    myDLL.printList();

    System.out.println("\nRemoved node:");
    System.out.println(myDLL.remove(0).value);
    System.out.println("DLL after remove() of first node:");
    myDLL.printList();

    System.out.println("\nRemoved node:");
    System.out.println(myDLL.remove(2).value);
    System.out.println("DLL after remove() of last node:");
    myDLL.printList();

    System.out.println("DLL before swap:");
    myDLL.printList();

    myDLL.swapFirstLast();

    System.out.println("\nDLL after swap:");
    myDLL.printList();



        /*
            EXPECTED OUTPUT:
            ----------------
            DLL before remove():
            1
            2
            3
            4
            5

            Removed node:
            3
            DLL after remove() in middle:
            1
            2
            4
            5

            Removed node:
            1
            DLL after remove() of first node:
            2
            4
            5

            Removed node:
            5
            DLL after remove() of last node:
            2
            4

        */

  }

}


