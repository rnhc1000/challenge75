package udemy.dsa.binarytree.binarysearchtree;

import java.util.List;

public class Main {

  public static void main(String[] args) {

    BinarySearchTree myBST = new BinarySearchTree();


    myBST.insert(47);
    myBST.insert(21);
    myBST.insert(76);
    myBST.insert(18);
    myBST.insert(27);
    myBST.insert(52);
    myBST.insert(82);

    System.out.println(myBST);
    System.out.println("BST Contains 27:");
    System.out.println(myBST.recursiveContains(27));
    System.out.println("\nBST Contains 17:");
    System.out.println(myBST.recursiveContains(17));
    System.out.println("BreadthFirstSearch");
    List<Integer> result = myBST.breadthFirstSearch();
    for (Integer i : result) {
      System.out.print(i + " ");
    }
    System.out.println("\n-------------------------------");
    System.out.println("DepthFirstSearch-PreOrder ");
    result = myBST.depthFirstSearchPreOrder();
    for (Integer i : result) {
      System.out.print(i + " ");
    }
    System.out.println("\n-------------------------------");
    System.out.println("DepthFirstSearch-PostOrder ");
    result = myBST.depthFirstSearchPostOrder();
    for (Integer i : result) {
      System.out.print(i + " ");
    }
    System.out.println("\n-------------------------------");
    System.out.println("DepthFirstSearch-InOrder ");
    result = myBST.depthFirstSearchInOrder();
    for (Integer i : result) {
      System.out.print(i + " ");
    }
        /*
            EXPECTED OUTPUT:
            ----------------
            BST Contains 27:
            true

            BST Contains 17:
            false

        */

  }

}
