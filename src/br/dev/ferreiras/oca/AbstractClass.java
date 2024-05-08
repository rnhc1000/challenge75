package br.dev.ferreiras.oca;

public class AbstractClass {
  static abstract class Animal {
    private String name;

    Animal() {
    }

    Animal(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }
  }

  static class Dog extends Animal {
    private String breed;

    //Dog(String breed) {
    // There is no default constructor available in 'br.dev.ferreiras.oca.AbstractClass.Animal
    Dog(String breed) {
      super();
      this.breed = breed;
    }

    Dog(String name, String breed) {
      super(name);
      this.breed = breed;
    }

    public String getBreed() {
      return breed;
    }
  }


  public static void main(String[] args) {
    Dog dog1 = new Dog("Beagle");
    Dog dog2 = new Dog("Bubbly", "Poodle");
    System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" +
            dog2.getName() + ":" + dog2.getBreed());
  }
}

