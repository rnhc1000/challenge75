package br.dev.ferreiras.challenges.dataStructures;

/*
return more tha one value
 */
public class UsingPair {

  public static void main(String[] args) {
    String nome = "Ricardo";
    Integer idade = 67;
    RecordPair pair = new RecordPair(nome, idade);

    System.out.println(pair.getKey());
    System.out.println(pair.getValue());
  }


}
