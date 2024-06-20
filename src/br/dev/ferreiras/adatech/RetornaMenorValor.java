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


public class RetornaMenorValor {
  static class Input {
    public int[] nums;
    public int alvo;
  }

  public static int encontraPares(Input input) {
    int[] nums = input.nums;
    int alvo = input.alvo;
    // Implemente seu código aqui
    int min = nums[0];
    int candidate = nums[0];
    for (int i = 1; i < nums.length; i++) {
      int sum = nums[i] + nums[i - 1];
      if (sum == alvo) {
        min = Math.min(nums[i], nums[i - 1]);
        candidate = Math.min(candidate, min);

      }
    }

    return candidate;
  }
}

