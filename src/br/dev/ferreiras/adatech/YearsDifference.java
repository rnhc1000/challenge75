package br.dev.ferreiras.adatech;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class YearsDifference {

  public static void main(String[] args) {
    String inicio = "1957-10-18";
    String atual = "2024-10-18";
    int r = obterDiferencaEmAnos(inicio, atual);
    System.out.println(r);
    String s = "cocada";
    int x = primeiroCaractereUnico(s);

  }
  public static int obterDiferencaEmAnos(String inicio, String fim) {
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-");
    int start = LocalDate.parse(inicio).getYear();
    int end = LocalDate.parse(fim).getYear();
    System.out.println(start);
    System.out.println(end);
    return end - start;

  }
  public static int primeiroCaractereUnico(String input) {
    char[] c = input.toCharArray();
    int size = c.length;
    Map<Character, Integer> map = new LinkedHashMap<>();
    for (int i = 1; i < size; i++) {
      map.put(c[i], map.getOrDefault((c[i]), 0) + 1);


    }

    int freq[] = new int[26];
    for(char d : input.toCharArray())freq[d - 'a']++;
    for(int indx = 0; indx < input.length(); indx++){
      if(freq[input.charAt(indx) - 'a'] == 1)return indx;
    }
    List<String> list = new ArrayList<>();
    return list.stream().maptoArray();
    return -1;
  }


}
/*
 partir da classe veículo já existente crie uma classe Carro e uma classe Moto sem adicionar novas propriedades em cada uma delas.

O construtor das classes Carro e Moto devem receber uma placa (string), e na propriedade Tipo deve ser atribuída a string "carro" ou "moto", dependendo da classe.

Implemente a classe Estacionamento com a seguinte propriedade:

List veiculosEstacionados, privada, somente leitura e inicializada na declaração (sem precisar de construtor)

Implemente os métodos abaixo na classe Estacionamento:

"estacionar(Veiculo v)" - Este método irá inserir um veículo na lista de veículos estacionados (não há necessidade de criar regras de controle). O método não deve ter retorno.
"sairDoEstacionamento(string placa)" - Este método removerá um veículo da lista de veículos estacionados. Seu retorno deverá ser o veículo removido, caso o mesmo esteja estacionado. Caso o veículo não esteja estacionado, retorne null.
"consultarVeiculo(string placa)" - Este método deve retornar true caso o veículo esteja estacionado. False, caso contrário.
"ocupacao()" - Método que retorna um inteiro com a quantidade de veículos estacionados.
 */

/*
Orientação a objetos 3
Depois de um ano com ótimos resultados, uma empresa de comércio de produtos alimentícios decidiu que era hora de expandir e optou por iniciar a construção de um sistema para controle de seus produtos e emissão de nota fiscal. Para atendermos a necessidade deste cliente, será necessário:

Criar uma classe chamada Produto com as propriedades:

codigo: público do tipo string, que será usado para armazenar o identificador único dos produtos;

precoUnitario: público do tipo double, que armazenará o valor unitário do produto com até duas casas decimais;

quantidade: público do tipo inteiro, que terá a informação de quantidade do produto que está sendo comprado;

Criar um construtor que receba o valor das propriedades acima, respeitando a sequência: codigo, precoUnitario e quantidade.

Criar uma classe chamada NotaFiscal com as propriedades:

Produtos: privado do tipo List, que armazenará os produtos vendidos em uma determinada compra;
Agora que definimos quais entidades serão necessárias para essa versão, precisamos atribuir alguns comportamentos para elas. Para isso, considere as premissas a seguir:

Na classe "NotaFiscal" deverá existir um método chamado "adicionarProduto" que receba como parâmetro um objeto "Produto". O método deve adicionar o produto recebido na lista de produtos da nota fiscal. Este método não deve ter retorno.
Também deverá ser possível remover um produto adicionado na lista de produtos. Para isso, crie o método "removerProdutos" que receba como parâmetro o código do produto a ser removido. Este método não deve ter retorno.
Para facilitar o trabalho do caixa da empresa, precisamos disponibilizar um método chamado "calcularValorProduto". Este método deverá retornar o valor total do produto recebido via parâmetro. Para chegar ao resultado do valor, considere a equação: precoUnitario * quantidade. O retorno do método deverá ser o resultado do cálculo apresentado anteriormente (o resultado poderá ser decimal).
Para concluir a compra e apresentar o valor final para o cliente, precisaremos criar um método chamado "calcularValorNotaFiscal", que deverá retornar o valor total de todos os itens da nota.


 */

/*
Orientação a objetos 1
A partir da classe Veiculo pré-existente, escreva uma classe Carro que herde de "Veiculo" e implemente o atributo abaixo:

tipoDeCombustivel (String)
Além dos atributos, esta classe deverá conter os métodos:

ligar() - Este método deve verificar o estado do carro (ligado ou desligado). Se o veículo já estiver ligado, deve retornar a mensagem "carro já está ligado", caso contrário, deverá ligar o veículo e retornar a string "ligado".
desligar() - Este método deve verificar o estado do carro (ligado ou desligado). Se o veículo já estiver desligado, deve retornar a mensagem "carro já está desligado", caso contrário, deverá desligar o veículo e retornar a string "desligado".
Demais características:

O construtor da classe Carro deve receber como parâmetro o tipo de combustível.
 */