package br.dev.ferreiras.challenges.leetCode;

public class TreeNode {
  /*
   * Definition for a binary tree node.
   */
  private TreeNode root;
  int value;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int value) {
    this.value = value;
  }

  TreeNode(int value, TreeNode left, TreeNode right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public TreeNode getRoot() {
    return root;
  }

  public boolean insert(int value) {
    TreeNode newNode = new TreeNode(value);
    if (root == null) {
      root = newNode;
      return true;
    }
    TreeNode temp = root;
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

  public boolean contains(int value) {
    if (root == null) return false;
    TreeNode temp = root;
    while (temp != null) {
      if (value < temp.value) {
        temp = temp.left;
      } else if (value > temp.value) {
        temp = temp.right;
      } else {
        return true;
      }
    }
    return false;
  }
}

