package br.dev.ferreiras.challenges.dataStructures;

/*
return more tha one value
 */
public class UsingPair {

  public static void main(String[] args) {
    String nome = "Ricardo";
    int idade = 67;
    Pair pair = new Pair(nome, idade);
    System.out.println(pair);
    System.out.printf("%s, %d", pair.name(), pair.age());
  }


}
