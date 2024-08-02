package br.dev.ferreiras.udemy.designpatterns;

import java.util.ArrayList;
import br.dev.ferreiras.udemy.designpatterns.Observer;

public class Book implements SubjectLibrary {
  private String name;
  private String type;
  private String author;

  private double price;
  private String inStock;

  public ArrayList<Observer> getObserverList() {
    return observerList;
  }

  public void setObserverList(ArrayList<Observer> observerList) {
    this.observerList = observerList;
  }

  private ArrayList<Observer> observerList = new ArrayList<Observer>();

  public Book(String name, String type, String author, double price, String inStock) {
    this.name = name;
    this.type = type;
    this.author = author;
    this.price = price;
    this.inStock = inStock;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void  setInStock(String inStock) {
    this.inStock = inStock;
    System.out.println("Availability changed form Sold Out to Back in Stock");
    notifyObserver();
  }

  public String getInStock() {
    return inStock;
  }

  @Override
  public void subscribeObserver(br.dev.ferreiras.udemy.designpatterns.Observer observer) {
    observerList.add(observer);

  }

  @Override
  public void unsubscribeObserver(br.dev.ferreiras.udemy.designpatterns.Observer observer) {
    observerList.remove(observer);

  }

  @Override
  public void notifyObserver(br.dev.ferreiras.udemy.designpatterns.Observer observer) {

  }

  @Override
  public void notifyObserver() {
    System.out.println(
            "Book name: " + this.name +
            ", Book Type: " + this.type +
            ", Price: " + this.price +
            ",Author: " + this.author +
            ", is now " + this.inStock + ". So, please notify all users. \n"
    );
    for (br.dev.ferreiras.udemy.designpatterns.Observer obs : observerList) obs.update(this.inStock);

  }

  @Override
  public void subscribeObserver(java.util.Observer observer) {

  }

  @Override
  public void unsubscribeObserver(java.util.Observer observer) {

  }

  @Override
  public void notifyObserver(java.util.Observer observer) {

  }


}
