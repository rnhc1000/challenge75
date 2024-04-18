package br.dev.ferreiras.udemy.dsa.binarytree.binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {
  @Override
  public String toString() {
    return "BinarySearchTree{" +
            "root=" + root +
            '}';
  }

  static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  private Node root;

  static class Node {
    public int value;
    public Node left;
    public Node right;

    Node(int value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return "Node{" +
              "value=" + value +
              ", left=" + left +
              ", right=" + right +
              '}';
    }
  }

  public Node getRoot() {
    return root;
  }

  /**
   * @param value
   * @return
   */
  public boolean insert(int value) {
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

  /**
   * @param value
   * @return
   */
  public boolean contains(Integer value) {
    Node root = getRoot();
    if (root == null) {
      return false;
    }
    Node temp = root;
    while (temp != null) {
      if (value < temp.value) {
        temp = temp.left;
      } else if (value > temp.value) {
        temp = temp.right;
      } else if (value == temp.value) {
        return true;
      }
    }
    return false;
  }

  /**
   * @param currentNode
   * @param value
   * @return true if contains value, false otherwise
   * Two methods overloaded
   */
  private boolean recursiveContains(Node currentNode, Integer value) {

    if (currentNode == null) return false;
    if (currentNode.value == value) return true;
    if (value < currentNode.value) {
      return recursiveContains(currentNode.left, value);
    } else {
      return recursiveContains(currentNode.right, value);
    }
  }


  static TreeNode newNode(int key) {
    TreeNode temp = new TreeNode();
    temp.val = key;
    temp.left = temp.right = null;
    return temp;
  }

  /*Function to find the height(depth) of the tree*/
  public static int height(TreeNode root) {

    // Initialising a variable to count the
    // height of tree
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    q.add(root);
    int height = 0;
    while (!q.isEmpty()) {
      int size = q.size();
      for (int i = 0; i < size; i++) {
        TreeNode temp = q.poll();
        assert temp != null;
        if (temp.left != null) {
          q.add(temp.left);
        }
        if (temp.right != null) {
          q.add(temp.right);
        }
      }
      height++;
    }
    return height;
  }

  /**
   * @param value
   * @return
   */
  public boolean recursiveContains(Integer value) {
    return recursiveContains(root, value);
  }

  private Node recursiveInsert(Node currentNode, Integer value) {

    if (currentNode == null) return new Node(value);
    if (value < currentNode.value) {
      currentNode.left = recursiveInsert(currentNode.left, value);
    } else {
      currentNode.right = recursiveInsert(currentNode.right, value);
    }
    return currentNode;
  }

  public void recursiveInsert(Integer value) {
    if (root == null) root = new Node(value);
    recursiveInsert(root, value);
  }

  public List<Integer> breadthFirstSearch() {
    Node currentNode = root;
    Queue<Node> queue = new LinkedList<>();
    List<Integer> results = new ArrayList<>();
    queue.add(currentNode);

    while (!queue.isEmpty()) {
      currentNode = queue.remove();
      results.add(currentNode.value);
      if (currentNode.left != null) {
        queue.add(currentNode.left);
      }
      if (currentNode.right != null) {
        queue.add(currentNode.right);
      }
    }
    return results;
  }

  public List<Integer> depthFirstSearchPreOrder() {
    List<Integer> results = new ArrayList<>();

    class Traverse {
      Traverse(Node currentNode) {
        results.add(currentNode.value);
        if (currentNode.left != null) {
          new Traverse(currentNode.left);
        }
        if (currentNode.right != null) {
          new Traverse(currentNode.right);
        }
      }
    }
    new Traverse(root);
    return results;
  }

  public List<Integer> depthFirstSearchPostOrder() {
    List<Integer> results = new ArrayList<>();
    class Traverse {
      Traverse(Node currentNode) {
        if (currentNode.left != null) {
          new Traverse(currentNode.left);
        }
        if (currentNode.right != null) {
          new Traverse(currentNode.right);
        }
        results.add(currentNode.value);
      }
    }
    new Traverse(root);
    return results;
  }

  public List<Integer> depthFirstSearchInOrder() {
    List<Integer> results = new ArrayList<>();

    class Traverse {
      Traverse(Node currentNode) {
        if (currentNode.left != null) {
          new Traverse(currentNode.left);
        }
        results.add(currentNode.value);
        if (currentNode.right != null) {
          new Traverse(currentNode.right);
        }
      }
    }
    new Traverse(root);
    return results;
  }
}


