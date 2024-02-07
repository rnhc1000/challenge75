package ferreiras.dev.br.challenges.geeksForGeeks;

public class SingleLinkedList {
  public static void main(String[] args) {
    SinglyLinkedList ll = new SinglyLinkedList();
    ll.push(1);
    ll.push(2);
    ll.push(3);
    ll.push(4);
    ll.push(5);

    System.out.println(ll);
    System.out.println(ll.getCount());
    ll.printList(ll.head);
    ll.head = ll.reverse(ll.head);
    ll.printList(ll.head);
    int position = 3;
    ll.deleteNode(ll.head, position);
    ll.printList(ll.head);
  }
}
