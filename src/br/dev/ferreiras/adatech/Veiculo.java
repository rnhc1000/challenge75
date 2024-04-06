package br.dev.ferreiras.adatech;

/*
Orientação a objetos 1
A partir da classe Veiculo pré-existente, escreva uma classe Carro que
herde de "Veiculo" e implemente o atributo abaixo:

tipoDeCombustivel (String)
Além dos atributos, esta classe deverá conter os métodos:

ligar() -
Este método deve verificar o estado do carro (ligado ou desligado).
Se o veículo já estiver ligado, deve retornar a mensagem "carro já está ligado",
caso contrário, deverá ligar o veículo e retornar a string "ligado".

desligar() -
Este método deve verificar o estado do carro (ligado ou desligado).
Se o veículo já estiver desligado, deve retornar a mensagem "carro já está desligado",
caso contrário, deverá desligar o veículo e retornar a string "desligado".

Demais características:
O construtor da classe Carro deve receber como parâmetro o tipo de combustível.
 */
public class Veiculo {
  public boolean isEngineOn;

  public Veiculo() {
  }
  public Veiculo(boolean isEngineOn) {
    this.isEngineOn = isEngineOn;
  }

  public static void main(String[] args) {
    Carro car = new Carro("gas");
    car.isEngineOn = false;

    car.turnOn();
    car.turnOff();
  }

}

class Carro extends  Veiculo {

  private final String fuel;
  public Carro(String fuel) {
    this.fuel = fuel;
  }

  public void turnOn() {
    if (isEngineOn) {
      System.out.println("Car is already turned on");
    } else {
      System.out.println("Car turned on");
    }
  }

  public void turnOff() {
    if (!isEngineOn) {
      System.out.println("Car is already turned off");
    } else {
      System.out.println("Car turned off");
    }
  }
}