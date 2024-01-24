package GeeksForGeeks;

public class ListNode {
    Integer data;
    ListNode next;

    ListNode(Integer data, ListNode next) {
      this.data = data;
      next = null;
    }

    ListNode(Integer data) {
      this.data = data;
    }

    ListNode() {
    }

    @Override
    public String toString() {
      return "ListNode{" +
              "data= " + data +
              ", next= " + next +
              '}';
    }
  }

