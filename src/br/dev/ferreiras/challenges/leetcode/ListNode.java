package br.dev.ferreiras.challenges.leetcode;

public class ListNode {
  // Definition for singly-linked list.
  int val;
  ListNode next;

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  @Override
  public String toString() {
    return "ListNode{" +
            "val=" + val +
            ", next=" + next +
            '}';
  }

}

