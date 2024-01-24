package LeetCode;

/**
 * Tree Traversal algorithms can be classified broadly into two categories:
 * Depth-First Search (DFS) Algorithms
 * Breadth-First Search (BFS) Algorithms
 *
 * Tree Traversal using Depth-First Search (DFS) algorithm can be further classified
 * into three categories:
 * Preorder Traversal (current-left-right):
 * Visit the current node before visiting any nodes inside the left or right subtrees.
 * Here, the traversal is root – left child – right child. It means that the root node
 * is traversed first then its left child and finally the right child.
 *
 * Inorder Traversal (left-current-right):
 * Visit the current node after visiting all nodes inside the left subtree but before
 * visiting any node within the right subtree. Here, the traversal is left child – root –
 * right child.  It means that the left child is traversed first then its root node and
 * finally the right child.
 *
 * Postorder Traversal (left-right-current):
 * Visit the current node after visiting all the nodes of the left and right subtrees.
 * Here, the traversal is left child – right child – root.
 * It means that the left child has traversed first then the right child and finally
 * its root node.
 */
// Class containing left and right child
// of current node and key value
class BinaryNode {
  int key;
  BinaryNode left, right;

  public BinaryNode(int item)
  {
    key = item;
    left = right = null;
  }

  @Override
  public String toString() {
    return "ListBinaryNode{" +
            "key=" + key +
            ", left=" + left +
            ", right=" + right +
            '}';
  }
}
public class BinaryTree {
  // Root of Binary Tree
  BinaryNode root;

  // Constructors
  BinaryTree(int key) {
    root = new BinaryNode(key);
  }
  BinaryTree() {
    root = null;
  }

  @Override
  public String toString() {
    return "BinaryTree{" +
            "root=" + root +
            '}';
  }

  public static void main(String[] args)
  {
    BinaryTree tree = new BinaryTree();

    // Create root
    tree.root = new BinaryNode(1);
        /* Following is the tree after above statement
           1
          / \
        null null
        */

    tree.root.left = new BinaryNode(2);
    tree.root.right = new BinaryNode(3);
        /* 2 and 3 become left and right children of 1
              1
             / \
            2   3
           / \ / \
       null null null null */
    tree.root.left.left = new BinaryNode(4);
        /* 4 becomes left child of 2
               1
              / \
             2   3
            / \ / \
           4 null null null
          / \
        null null
        */

    System.out.println(tree);
  }
}
