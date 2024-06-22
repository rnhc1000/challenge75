package br.dev.ferreiras.adatech;
/*
Você precisa implementar um método em Java chamado somaFolhas que recebe um objeto da classe
TreeNodes como parâmetro. A classe TreeNodes representa um nó em uma árvore binária e possui
três atributos: val (valor do nó), left (referência para o nó à esquerda) e right (referência para o nó à direita).

O objetivo do método é calcular a soma dos valores dos nós folha na árvore binária.
Um nó folha é um nó que não tem nenhum nó filho.

Classe TreeNodes
public static class TreeNodes {
  int val;
  TreeNodes left;
  TreeNodes right;
  TreeNodes(){
  }

  TreeNodes(int val) {
    this.val = val;
  }

  TreeNodes(int val, TreeNodes left, TreeNodes right) {
    this.val = val;
    this.left = left;
    this.right = right;
    }
  }
Método a ser implementado
public static int somaFolhas(TreeNodes raiz) {
  // Implemente seu código aqui
  return 0;
}
Exemplo de Entrada e Saída
Árvore 1
Entrada:

TreeNodes raiz = new TreeNodes(3);
raiz.left = new TreeNodes(9);
raiz.right = new TreeNodes(20, new TreeNodes(15), new TreeNodes(7));

Saída Esperada: 24

Explicação: A soma dos valores dos nós folha é 9 + 15 + 7 = 24.

Árvore 2

Entrada:

TreeNodes raiz = new TreeNodes(1);
raiz.left = new TreeNodes(2, new TreeNodes(4), new TreeNodes(5));
raiz.right = new TreeNodes(3);

Saída Esperada: 9

Explicação: A soma dos valores dos nós folha é 4 + 5 = 9.
*/

import java.util.Queue;
import java.util.Stack;

public class TreeNodes {
  private int val;
  private TreeNodes left;
  private TreeNodes right;

  public TreeNodes() {
  }

  public TreeNodes(int val) {
    this.val = val;
  }

  public TreeNodes(int val, TreeNodes left, TreeNodes right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public static int somaFolhas(TreeNodes raiz) {
    // Implemente seu código aqui
    return 0;
  }

  @Override
  public String toString() {
    return "TreeNodes{" +
            "val=" + val +
            ", left=" + left +
            ", right=" + right +
            '}';
  }

  public void setLeft(TreeNodes left) {
    this.left = left;
  }

  public void setRight(TreeNodes right) {
    this.right = right;
  }

  public static void main(String[] args) {


  }
}

