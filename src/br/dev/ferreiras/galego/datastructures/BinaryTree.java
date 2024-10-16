package br.dev.ferreiras.galego.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BinaryTree {

  class Node {
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
        node.left = new Node(value);
      } else {
        insertNodeRecursive(node.left, node.value);
      }
    } else {
      if (node.right == null) {
        node.right = new Node(value);
      } else {
        insertNodeRecursive(node.right, node.value);
      }
    }
  }

  public void insertNodeOne(Integer value) {

    Node node = new Node(value);
    if (root == null) {
      root = node;
    } else {
      insertNodeRecursive(root, value);
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

  public void printNodes(Node node) {

    if (node == null)
      return;

    // Deal with the node
    System.out.print(node.value + " ");

    // Recur on left subtree
    printNodes(node.left);

    // Recur on right subtree
    printNodes(node.right);
  }


  public int[] preOrderTraversal(Node node) {

    List<Integer> result = new ArrayList<>();
    preOrderRecursive(node, result);

    return result.stream().mapToInt(x -> x).toArray();
  }

  public List<Integer> preOrderRecursive(Node node, List<Integer> list) {

    if (node != null) {
      list.add(node.value);
      preOrderRecursive(node.left, list);
      preOrderRecursive(node.right, list);
    }

    return list;
  }

  public int[] inOrderTraversal(Node node) {

    List<Integer> result = new ArrayList<>();
    inOrderRecursive(node, result);

    return result.stream().mapToInt(x -> x).toArray();
  }

  public List<Integer> inOrderRecursive(Node node, List<Integer> list) {

    if (node != null) {
      inOrderRecursive(node.left, list);
      list.add(node.value);
      inOrderRecursive(node.right, list);
    }

    return list;
  }

  public int[] postOrderTraversal(Node node) {

    List<Integer> result = new ArrayList<>();
    postOrderRecursive(node, result);

    return result.stream().mapToInt(x -> x).toArray();
  }

  public List<Integer> postOrderRecursive(Node node, List<Integer> list) {

    if (node != null) {
      postOrderRecursive(node.left, list);
      postOrderRecursive(node.right, list);
      list.add(node.value);

    }

    return list;
  }

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    boolean check = tree.insertNode(5);
    System.out.println(check);

    check = tree.insertNode(3);

    System.out.println(check);
    check = tree.insertNode(1);
    System.out.println(check);
    check = tree.insertNode(10);
    System.out.println(check);
    check = tree.insertNode(15);
    System.out.println(check);
    check = tree.insertNode(7);
    System.out.println(check);

    System.out.println(tree.search(789));

    System.out.println(Arrays.toString(tree.preOrderTraversal(tree.root)));

    System.out.println(Arrays.toString(tree.inOrderTraversal(tree.root)));
    System.out.println(Arrays.toString(tree.postOrderTraversal(tree.root)));
  }

  public boolean equalTrees(Node p, Node q) {
    if (p == null && q == null) return true;

    if (p == null || q == null) return false;

    if (!Objects.equals(p.value, q.value)) return false;

    return equalTrees(p.left, q.left) && equalTrees(p.right, q.right);
  }
}
