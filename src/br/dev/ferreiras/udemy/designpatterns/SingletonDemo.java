package br.dev.ferreiras.udemy.designpatterns;
/*
Creational Pattern
 */
public class SingletonDemo {
//  private static final SingletonDemo singleton = new SingletonDemo();
  public static final SingletonDemo singleton = new SingletonDemo();

  private SingletonDemo() {
    System.out.println("singleton created");
  }

//  public static SingletonDemo getInstance() {
//    return singleton;
//  }
}
