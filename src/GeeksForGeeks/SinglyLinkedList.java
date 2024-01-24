package GeeksForGeeks;

/**
 * Delete middle of a Linked lIst by:
 * <a href="https://leetcode.com/Shivansu_7/">...</a>
 * Intuition
 * If a point with a speed s moves n units in a given time, a point with speed 2 * s
 * will move 2 * n units at the same time. It means when a pointer with 2*s speed reaches
 * the end, the pointer with s speed will be at exactly the mid point.
 * Approach
 * Base Case Check:
 * If the linked list is empty or has only one node, there is no middle node to delete,
 * so the method returns null.
 * Two-Pointer Approach (Slow and Fast Pointers):
 * Two pointers, slow and fast, are initialized. The slow pointer advances one node at a
 * time, while the fast pointer advances two nodes at a time.
 * Find the Middle Node:
 * The loop iterates until the fast pointer reaches the end of the list (null) or the
 * second-to-last node. At each iteration, the slow pointer moves one step, and the
 * fast pointer moves two steps. As a result, the slow pointer will be at the middle
 * node when the loop exits.
 * Delete the Middle Node:
 * The middle node is deleted by updating the next reference of the node before the
 * middle node (slow.next) to skip the middle node.
 * Return the Updated Head:
 */

public class SinglyLinkedList {
  Integer length = 0;
  ListNode head = null;
  ListNode tail = null;


  SinglyLinkedList() {
  }

  public void push(Integer data) {
    ListNode newOne = new ListNode(data);
    if (head == null) {
      newOne.next = null;
      head = newOne;
    } else {
      newOne.next = head;
      head = newOne;
    }
  }

  public int getCount() {
    ListNode node = head;
    int size = 0;
    while (node != null) {
      node = node.next;
      size++;
    }
    return size;
  }

  public ListNode reverse(ListNode node) {
    ListNode prev = null;
    ListNode next = null;
    ListNode current = node;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    node = prev;
    return node;
  }

  public void printList(ListNode node) {
    while (head != null) { // Loop through the linked list
      if (head.next == null) { // If the current node is the last node
        System.out.println("[" + head.data + "] [" + head + "]->" + "(null)"); // Print the node value and null
      } else {
        System.out.println("[" + head.data + "] [" + head + "]->" + head.next); // Print the node value and the next node
      }
      head = head.next; // Move to the next node
    }

    System.out.println();
  }

  public ListNode deleteNodes(ListNode head, Integer position) {
    ListNode previous = head;
    int i = 1;
    while (i < position) {
      previous = previous.next;
      i++;
    }
    previous.next = previous.next.next;
    return head;
  }
  public ListNode deleteNode(ListNode node, Integer position) {
    ListNode temp = head;
    ListNode previous = head;

    for (int i = 0; i < position; i++) {
      if (i == 0 && position == 1) { // If node to delete is the head
        head = head.next;// set the next node as the head;
      } else {
        if (i == position-1 && temp != null) { // If the node to delete is found
          previous.next = temp.next;// Set the next node of the previous node to be the next node of the current node
        } else {
          previous = temp;
          if (previous == null) break;
          temp = temp.next;
        }
      }
    }
    return head;
  }
  public ListNode deleteMiddle(ListNode head) {
    // return bruteApproach(head);

    if(head==null || head.next==null) return null;

    ListNode slow = head;
    ListNode fast = head.next.next;

    while(fast!=null && fast.next!=null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    slow.next = slow.next.next;
    return head;
  }
  @Override
  public String toString() {
    return "SinglyLinkedList{" +
            " length=" + getCount() +
            ", head=" + head +
            ", next=" + new ListNode().next +
            ", tail=" + tail +
            '}';
  }
}