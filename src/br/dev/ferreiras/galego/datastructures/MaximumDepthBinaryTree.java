package br.dev.ferreiras.galego.datastructures;

import br.dev.ferreiras.galego.datastructures.BinaryTree.Node;

/*
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the
longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthBinaryTree {

  public int maxDepth(Node root) {

    if (root == null)
      return 0;
    else {

      int lDepth = maxDepth(root.left);
      int rDepth = maxDepth(root.right);

      if (lDepth > rDepth)
        return (lDepth + 1);
      else
        return (rDepth + 1);
    }
  }

}

