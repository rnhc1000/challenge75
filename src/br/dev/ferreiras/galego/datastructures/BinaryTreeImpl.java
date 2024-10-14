package br.dev.ferreiras.galego.datastructures;

public class BinaryTreeImpl {

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    boolean check = tree.insertNode(5);
    System.out.println(check);

    check = tree.insertNode(7);
    System.out.println(check);
    check = tree.insertNode(1);
    System.out.println(check);
    check = tree.insertNode(9);
    System.out.println(check);

    System.out.println(tree.search(7));
  }
}
