package br.dev.ferreiras.oca;

public class Generic {
  public static void main(String[] args) {
    double price = 90000;
    String model ="";
    if(price > 100000) {
      model = "Tesla Model X";
    } else if(price <= 100000) {
      model = "Tesla Model S";
    }
    System.out.println(model);

//    System.out.println("Output is: " + 10 != 5);
    String s1 = "OCAJP";
    String s2 = "OCAJP" + "";
    System.out.println(s1.equals(s2));
    System.out.println(s1 == s2);

  }
}
