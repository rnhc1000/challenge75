package BinarySearchTrees;

class Node {
  int value;
  Node left;
  Node right;

  Node() {

  }
  Node(int value) {
    this.value = value;
  }

  Node(int value, Node left, Node right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }
  static Node insert( Node current, int value) {
    if (current == null) {
      return new Node(value);
    }
    if (value < current.value) {
      current.left = insert(current.left, value);
    } else if (value > current.value) {
      current.right = insert(current.right, value);
    } else {
      return current;
    }
    return current;
  }
  @Override
  public String toString() {
    return "ListNode{" +
            "value=" + value +
            ", left=" + left +
            ", right=" + right +
            '}';
  }
}

public class BinarySearchTrees {

  public static void main(String[] args) {
    Node root = new Node(10);
    root.left = new Node(7);
    root.right = new Node(15);
    root.left.left = new Node(6);
    root.left.right = new Node(9);
    System.out.println(root);
  }


}
