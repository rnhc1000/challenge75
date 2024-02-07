package ferreiras.dev.br.exception;

public class CustomException {
  public static void main(String[] args) {
    int no = methodOne();
    System.out.println(no);
  }
  public static int methodOne(){

    try {
      return 1;
    } catch (Exception ex) {
      return 2;
    } finally {
      System.out.println("App closed!");    }
  }
}
