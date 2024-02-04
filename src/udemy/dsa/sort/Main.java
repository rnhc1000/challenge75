package udemy.dsa.sort;

public class Main {

  public static void main(String[] args) {

    BubbleSortOfLinkedList myLinkedList = new BubbleSortOfLinkedList(4);
    myLinkedList.append(2);
    myLinkedList.append(6);
    myLinkedList.append(5);
    myLinkedList.append(1);
    myLinkedList.append(3);


    System.out.println("Unsorted Linked List:");
    myLinkedList.printList();

    myLinkedList.bubbleSort();

    System.out.println("Sorted Linked List:");
    myLinkedList.printList();



        /*
            EXPECTED OUTPUT:
            ----------------
            Unsorted Linked List:
            4
            2
            6
            5
            1
            3

            Sorted Linked List:
            1
            2
            3
            4
            5
            6

        */

    myLinkedList.makeEmpty();
    myLinkedList.append(2);
    myLinkedList.append(6);
    myLinkedList.append(5);
    myLinkedList.append(1);
    myLinkedList.append(3);


    System.out.println("Unsorted Linked List:");
    myLinkedList.printList();

    myLinkedList.selectionSort();

    System.out.println("\nSorted Linked List:");
    myLinkedList.printList();



        /*
            EXPECTED OUTPUT:
            ----------------
            Unsorted Linked List:
            4
            2
            6
            5
            1
            3

            Sorted Linked List:
            1
            2
            3
            4
            5
            6

        */

    myLinkedList.makeEmpty();
    myLinkedList.append(2);
    myLinkedList.append(6);
    myLinkedList.append(5);
    myLinkedList.append(1);
    myLinkedList.append(3);


    System.out.println("Unsorted Linked List:");
    myLinkedList.printList();

    myLinkedList.insertionSort();

    System.out.println("\nSorted Linked List:");
    myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            Unsorted Linked List:
            4
            2
            6
            5
            1
            3

            Sorted Linked List:
            1
            2
            3
            4
            5
            6

        */

  }

}
