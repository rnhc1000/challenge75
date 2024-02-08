package br.dev.ferreiras.challenges.tree;

class Node {
  int value;
  Node left;
  Node right;

  public Node(int value) {
    this.value=value;
    left=null;
    right=null;
  }
}

class BinaryTree {
  public Node root;

  public void add(int value) {

    root = insert(root, value);
  }
  static Node insert(Node current, int value) {
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

  BinaryTree createBinaryTree() {
    BinaryTree bt = new BinaryTree();
    bt.add(6);
    bt.add(4);
    bt.add(8);
    return bt;
  }
}
public class MaximumDepthThree {



}
