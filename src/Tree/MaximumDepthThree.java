package Tree;

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
    root = addElements2Tree(root, value);
  }
  static Node addElements2Tree(Node current, int value) {
    if (current == null) {
      return new Node(value);
    }
    if (value < current.value) {
      current.left = addElements2Tree(current.left, value);
    } else if (value > current.value) {
      current.right = addElements2Tree(current.right, value);
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
