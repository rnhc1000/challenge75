package br.dev.ferreiras.galego.datastructures;

import java.util.Objects;

public class BinaryTree {

  private class Node {
    Integer value;
    Node left;
    Node right;

    public Node() {
    }

    public Node(Integer value) {
      this.value = value;
    }

    public Node(Integer value, Node right, Node left) {
      this.value = value;
      this.right = right;
      this.left = left;
    }
  }

  private Node root;

  public boolean insertNode(Integer value) {

    Node node = new Node(value);
    if (root == null) {
      root = node;
      return true;
    }

    Node tempNode = root;
    while (true) {
      if (tempNode.value == node.value) return false;
      if (node.value < tempNode.value) {
        if (tempNode.left == null) {
          tempNode.left = node;
          return true;
        }
        tempNode = tempNode.left;
      } else {
        if (tempNode.right == null) {
          tempNode.right = node;
          return true;
        }
        tempNode = tempNode.right;
      }
    }
  }

  public void insertNodeRecursive(Node node, Integer value) {

    if (value < node.value) {
      if (node.left == null) {
        node.left = node;
      } else {
        insertNodeRecursive(node.left, node.value);
      }
    } else {
      if (node.right == null) {
        node.right = node;
      } else {
        insertNodeRecursive(node.right, node.value);
      }
    }

  }

  public Node search(Integer value) {
    return searchRecursive(root, value);
  }

  public Node searchRecursive(Node node, Integer value) {
    if (node == null) return null;
    if (Objects.equals(node.value, value)) return node;
    else if (value < node.value) return searchRecursive(node.left, value);
    else return searchRecursive(node.right, value);
  }

  @Override
  public String toString() {
    return "BinaryTree{" +
           "root=" + root +
           '}';
  }
}

