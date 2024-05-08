package br.dev.ferreiras.oca;

interface Printable {
  public void setMargin();

  public void setOrientation();

}

abstract class Paper implements Printable {
  abstract public void setMargin();

  public abstract void setOrientation();

}

public class NewsPaper extends Paper {

  @Override
  public void setMargin() {

  }

  public void setOrientation() {

  }
}
