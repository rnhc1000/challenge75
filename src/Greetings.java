interface Hello {
  String hello();
}
interface EveryBody {
  String everybody();
}
public class Greetings implements Hello, EveryBody {
  @Override
  public String hello() {
    return "Hello, ";
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
