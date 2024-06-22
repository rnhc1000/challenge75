package br.dev.ferreiras.adatech;
/*
    Enunciado
    Você precisa implementar um método em Java chamado encontraPares que recebe um objeto da classe Input como parâmetro. A classe Input contém dois atributos: um array de inteiros nums e um inteiro alvo.

    O objetivo do método é encontrar todos os pares de números no array nums cuja soma seja igual ao valor de alvo, e então retornar o menor número dentre esses pares.

    Classe Input
    public static class Input {
        public int[] nums;
        public int alvo;
    }
    Método a ser implementado
    public static int encontraPares(Input input) {
        // Implemente seu código aqui
    }
    Exemplo de Entrada e Saída
    Entrada: nums = [3, 1, 4, 1, 5, 9, 2, 6], alvo = 7
    Saída Esperada: 1
    Explicação: Os pares (3, 4), (1, 6), e (1, 6) somam 7, e o menor número dentre eles é 1.
     */


import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class RetornaMenorValor {

  public static void main(String[] args) {
    Input input = new Input();
    input.nums = new int[]{3, 1, 4, 1, 5, 9, 2, 7, 8};
    input.alvo = 10;
    int response = encontraPares(input);
    System.out.println(response);
  }
  static class Input {
    public int[] nums;
    public int alvo;
  }

  public static int encontraPares(Input input) {
    int[] nums = input.nums;
    int alvo = input.alvo;
    // Implemente seu código aqui
//    Arrays.sort(nums);
    List<Integer> pair = new LinkedList<>();
    int min = nums[0];
    int candidate = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        int sum = nums[i] + nums[j];
        if (sum == alvo) {
          pair.add(nums[i]);
          pair.add(nums[j]);
          min = Math.min(nums[i], nums[j]);
          candidate = Math.min(candidate, min);

        }
      }
    }
    System.out.println(pair);

    return pair.stream().map(x -> x).min(Comparator.naturalOrder()).get();
  }
}

