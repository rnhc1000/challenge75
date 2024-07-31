package br.dev.ferreiras.udemy.review;

class Pasta {

  public void prepare() {
    System.out.println("The read sauce pasta is ready!");
  }

}
public class OuterInnerClasses {

  public void display() {
    System.out.println("OuterClass ...!");
  }
    static class InnerClass {

    public void display() {
      System.out.println("InnerClass ...!");
    }

  }

  public static void main(String[] args) {

    OuterInnerClasses out = new OuterInnerClasses();
    out.display();

    OuterInnerClasses.InnerClass in = new OuterInnerClasses.InnerClass();
    in.display();

    Pasta pasta = new Pasta() {
      @Override
      public void prepare() {
        System.out.println("The white sauce pasta is ready!");
      }
    };
    pasta.prepare();
    System.out.println(pasta.getClass().getName());
  }
}
