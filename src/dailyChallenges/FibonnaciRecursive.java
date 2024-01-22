package dailyChallenges;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonnaciRecursive {
  public static void main(String[] args) {
    int n = 6;
    int response = fibonacci(n);
    System.out.println(response);
    List<Integer> list = fib(n);
    System.out.println(list);
    response = fibSum(n);
    System.out.println(response);
  }
  public static int fibonacci(int n) {
    if (n < 2) {
//      return 1; // return the sum of fib(n) _ fib)n-1)
      return n; // return fib(n);
    }
    return fibonacci(n-1) + fibonacci(n-2);
  }
  public static List<Integer> fib(int n) {
    List<Integer> fibonacci = new ArrayList<>();
    fibonacci.add(0,1) ;
    fibonacci.add(1,1);
    for (int i=2; i<n; i++) {
      fibonacci.add(fibonacci.get(i-1)+(fibonacci.get(i-2)));
    }
    return fibonacci;
  }
  public static int fibSum(int n) {
    List<Integer> fibonacci = new ArrayList<>();
    fibonacci.add(0,1) ;
    fibonacci.add(1,1);
    for (int i=2; i<n; i++) {
      fibonacci.add(fibonacci.get(i-1)+(fibonacci.get(i-2)));
    }
    return fibonacci.stream().reduce(0, Integer::sum);
  }
}
