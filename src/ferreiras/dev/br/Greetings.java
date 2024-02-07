package ferreiras.dev.br;

interface Hello {
  String hello();
}
interface EveryBody {
  String everybody();
}
public class Greetings implements Hello, EveryBody {
  @Override
  public String hello() {
    return "ferreiras.dev.br.Hello, ";
  }
  @Override
  public String everybody() {
    return "Everybody!";
  }
  public static void main(String... args) {
    Greetings greetings = new Greetings();
    System.out.println(
            greetings.hello() + greetings.everybody());
  }
}
