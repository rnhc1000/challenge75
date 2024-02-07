package ferreiras.dev.br.challenges.geeksForGeeks;

import java.util.ArrayList;

/**
 * In a linked list of size n, where n is even, the ith node (0-indexed) of the
 * linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.
 *  For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin
 *  of node 2. These are the only nodes with twins for n = 4.
 *  The twin sum is defined as the sum of a node and its twin.
 *  Given the head of a linked list with even length, return the maximum twin sum
 *  of the linked list.
 *  Input: head = [5,4,2,1]
 * Output: 6
 * Explanation:
 * Nodes 0 and 1 are the twins of nodes 3 and 2, respectively. All have twin sum = 6.
 * There are no other nodes with twins in the linked list.
 * Thus, the maximum twin sum of the linked list is 6.
 * Input: head = [4,2,2,3]
 * Output: 7
 * Explanation:
 * The nodes with twins present in this linked list are:
 * - Node 0 is the twin of node 3 having a twin sum of 4 + 3 = 7.
 * - Node 1 is the twin of node 2 having a twin sum of 2 + 2 = 4.
 * Thus, the maximum twin sum of the linked list is max(7, 4) = 7
 */

 public class TwinSumLinkedList {
  public static void main(String[] args) {
    SinglyLinkedList ll = new SinglyLinkedList();
    ll.push(5);
    ll.push(4);
    ll.push(2);
    ll.push(1);
    int m = pairSum(ll.head);
    System.out.println(m);
  }

  public static int pairSum(ListNode head) {
    if (head == null) return 0;

    int max = Integer.MIN_VALUE;

    ArrayList<Integer> list = new ArrayList<>();

    ListNode temp = head;
    while (temp!= null) {
      list.add(temp.data);
      temp = temp.next;
    }
    int size = list.size();
    for (int i=0; i<size;i++) {
      int sumTwins = list.get(i) + list.get(size - 1 - i);
      if (sumTwins > max) {
        max = sumTwins;
      }
    }
    return max;
  }
}
