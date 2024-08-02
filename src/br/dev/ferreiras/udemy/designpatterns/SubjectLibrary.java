package br.dev.ferreiras.udemy.designpatterns;

import java.util.Observer;

public interface SubjectLibrary {
  void subscribeObserver(br.dev.ferreiras.udemy.designpatterns.Observer observer);

  void unsubscribeObserver(br.dev.ferreiras.udemy.designpatterns.Observer observer);

  void notifyObserver(br.dev.ferreiras.udemy.designpatterns.Observer observer);

  void notifyObserver();

  public void subscribeObserver(Observer observer);
  public void unsubscribeObserver(Observer observer);
  public void notifyObserver(Observer observer);


}
