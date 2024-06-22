package br.dev.ferreiras.adatech;

  /*
 Você precisa implementar um método em Java chamado inverterFila que recebe uma fila de
 inteiros fila como parâmetro. O objetivo do método é inverter a ordem dos elementos na fila,
 sem usar estruturas auxiliares.tem nenhum nó filho.

Classe Solution
import java.util.Queue;

public class Solution {

    public static Queue<Integer> inverterFila(Queue<Integer> fila) {
        // Implemente seu código aqui
        return null;
    }
}
Exemplo de Entrada e Saída
Fila 1

Entrada:

Queue<Integer> fila = new LinkedList<>();
  fila.add(1);
  fila.add(2);
  fila.add(3);
Saída Esperada: 3, 2, 1

Explicação: A fila original é 1, 2, 3, e após inverter, fica 3, 2, 1.
   */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ReverteQueue {
  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    int[] nums = {3, 5, 4, 4, 2, 6, 6, 2};
    for (int num :nums) {
      queue.offer(num);
    }
    Queue<Integer> response = inverterFila(queue);
    System.out.println(response);
  }
  public static Queue<Integer> inverterFila(Queue<Integer> fila) {
    Deque<Integer> stack = new ArrayDeque<>();
    while (!fila.isEmpty()) {
      stack.push(fila.remove());
    }
    while (!stack.isEmpty()) {
      fila.offer(stack.pop());
    }
    return fila;
  }
}

