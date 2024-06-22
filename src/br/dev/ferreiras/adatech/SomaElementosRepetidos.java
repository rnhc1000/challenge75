package br.dev.ferreiras.adatech;
/*
  Enunciado
Você precisa implementar um método em Java chamado somaElementosRepetidos que recebe um
array de inteiros como parâmetro. O método deve retornar a soma dos elementos que aparecem
mais de uma vez no array.

Método a ser implementado
public static int somaElementosRepetidos(int[] nums) {
    // Implemente seu código aqui
}
Exemplo de Entrada e Saída
Entrada:[3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 7]

Saída Esperada: Saída Esperada: 9
Explicação:
Os elementos que aparecem mais de uma vez são 3, 1, 5, cada um aparecendo duas vezes.
Sua soma é 9.
*/


public class SomaElementosRepetidos {
  public static void main(String[] args) {
    int[] nums = { 1, 1, 2, 2 };
    int response = somaElementosRepetidos(nums);
    System.out.println(response);
  }
  public static int somaElementosRepetidos(int[] nums) {

    int size = nums.length, sum =0;

    for (int i = 0; i < size; i++) {

      for (int j = i + 1; j < size; j++) {

        if ( nums[i] == nums[j]) {
           sum += nums[i];
        }

      }

    }

    return sum;
  }
}
