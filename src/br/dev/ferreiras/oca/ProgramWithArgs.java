package br.dev.ferreiras.oca;
/*
Modify Run Configuration and pass arguments to run this program
 */
public class ProgramWithArgs {

  class Message {
//    static void main(String [] args) {
//      System.out.printf("%s %s %s %s", " Welcome",  args[0], args[2], "!");
//    }
  }
  public static void main(String [] args) {
//    Message.main(args);
    try {
      main(args);
//      System.out.printf("%s %s %s %s", " Welcome",  args[0], args[2], "!");
    } catch (Exception ex) {

      System.out.println("CATCH-");
    }
    System.out.println("OUT");
  }
}
