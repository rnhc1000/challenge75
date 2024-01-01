/*public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
    HelloWorld.mainx();
  }

}

class HelloWorld {

  static void mainx() {
    System.out.println("Hello, world!");
  }

}*/


class Helllo {
  public static String hello() {
    return "Hello";
  }
}
interface Hello{
  String hello();
}
public class Everybody implements Hello {
  public String hello() {
    return ("Hello Everybody!");
  }

  public static void main(String[] args) {
    System.out.println(new Everybody().hello());
  }
}