package br.dev.ferreiras.oca;

public class StaticBehaviour {

  static int x = 5;

  static {
    x+=10;
  }

  public static void main(String[] args) {
    System.out.println(x);
    /*
    35
     */
    StaticBehaviour test = new StaticBehaviour();
    printValue();

  }

  static {
    x+=20;
  }

  int y = 5;
  public static void printValue(){
    int y = 10;
    System.out.println(y);
  }

}
