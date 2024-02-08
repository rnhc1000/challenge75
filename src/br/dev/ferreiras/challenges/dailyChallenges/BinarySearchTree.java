package br.dev.ferreiras.challenges.dailyChallenges;

public class BinarySearchTree {

  Node root;

  @Override
  public String toString() {
    return "BinarySearchTree{" +
            "root=" + root +
            '}';
  }

  static class Node {
    Integer value;
    Node left;
    Node right;

    @Override
    public String toString() {
      return "Node{" +
              "value=" + value +
              ", left=" + left +
              ", right=" + right +
              '}';
    }

    private Node(Integer value) {
      this.value = value;
    }
  }

  public BinarySearchTree() {
    root = null;
  }

  public boolean insert(Integer value) {
    //create a new Node;
    Node newNode = new Node(value);
    if (root == null) {
      root = newNode;
      return true;
    }
    Node temp = root;

    while (true) {
      if (newNode.value == temp.value) return false;
      if (newNode.value < temp.value) {
        if (temp.left == null) {
          temp.left = newNode;
          return true;
        }
        temp = temp.left;
      } else {
        if (temp.right == null) {
          temp.right = newNode;
          return true;
        }
        temp = temp.right;
      }
    }
  }
  public boolean contains(Integer value) {
    if (root == null) return false;
    Node temp = root;
    while (temp != null) {
      if(value < temp.value) {
        temp = temp.left;
      } else if (value > temp.value) {
        temp = temp.right;
      } else {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();
    System.out.println("BST -> " + bst.root);
    bst.insert(47);
    bst.insert(76);
    bst.insert(82);
    bst.insert(21);
    bst.insert(18);
    bst.insert(52);

    System.out.println(bst);
    System.out.println(bst.root.right.right.value);

  }
}
