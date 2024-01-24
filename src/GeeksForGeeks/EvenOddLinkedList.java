package GeeksForGeeks;

/**
 * Given the head of a singly linked list, group all the nodes with odd indices together
 * followed by the nodes with even indices, and return the reordered list.
 * The first node is considered odd, and the second node is even, and so on.
 * Note that the relative order inside both the even and odd groups should remain as it
 * was in the input.
 * You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 * Input: head = [1,2,3,4,5]
 * Output: [1,3,5,2,4]
 */
public class EvenOddLinkedList {
  public static void main(String[] args) {
    SinglyLinkedList ll = new SinglyLinkedList();
    ll.push(1);
    ll.push(2);
    ll.push(3);
    ll.push(4);
    ll.push(5);
    ll.push(6);
    ll.push(7);
    ll.push(8);
    ll.push(9);
    ll.push(10);

    ListNode oddEven = oddXEvenList(ll.head);
    ll.printList(oddEven);
  }

  public static ListNode oddEvenList(ListNode head) {

    ListNode oddHead = null, oddTail = null;
    ListNode evenHead = null, evenTail = null;
    ListNode current = head;
    int i = 1;
    while (current != null) {
      if (i % 2 == 1) {
        if (oddHead == null) {
          oddHead = current;
          oddTail = current;
        } else {
          oddTail.next = current;
          oddTail = oddTail.next;
        }
      } else {
        if (evenHead == null) {
          evenHead = current;
          evenTail = current;
        } else {
          evenTail.next = current;
          evenTail = evenTail.next;
        }
      }
      current = current.next;
      i++;
    }
    evenTail.next = null;
    oddTail.next = evenHead;
    return oddHead;
  }
  public static ListNode oddXEvenList(ListNode head) {

    if(head==null) return head;

    ListNode odd  = head;
    ListNode even = head.next;
    ListNode evenHead = even;

    while(even!=null && even.next!=null){
      odd.next = odd.next.next;
      even.next = even.next.next;
      odd = odd.next;
      even = even.next;
    }

    odd.next = evenHead;

    return head;
  }
}
