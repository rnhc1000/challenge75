package br.dev.ferreiras.udemy.dsa.advanced.recursion;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @param int n  ->  indicate a position of a number in a fibonacci series
 * @return int r -> number in  position n
 * Example:
 * position = 6 ;
 * value = 8;
 * <p>
 * 0 1 1 2 3 5 8 13 21....
 */
public class Fibonacci {
  public static void main(String[] args) {
    int n = 9;
    int a = 1;
    int b = 2;
    int response = tail(n, a, b);
//    System.out.println(response);
//    iterationOne(n);
    System.out.println();
    String s = "kevin";
//    System.out.println(revertString(s));
//    System.out.println(gcdRecursive(24,9));
    int[] nums = { 1,2,3,4,5,6,7,8,9};
    int index = 0;
    int item = 9;
    int left = 0;
    int right = nums.length-1;
//    System.out.println(recursiveFind(nums, item, index));
    System.out.println(binarySearch( nums, item, left, right));
  }

  public static int fibonacci(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }

    int fibOne = fibonacci(n - 1);
    int fibTwo = fibonacci(n - 2);

    return fibOne + fibTwo;
  }

  public static int tail(int n, int a, int b) {
    // there are 2 accumulator values now (a and b) - be careful about the initial values :)
    if (n == 0) return a;
    if (n == 1) return b;

    return tail(n - 1, b, a + b);
  }

  public List<Integer> iteration(int n) {

    // list containing the values
    List<Integer> nums = new ArrayList<>();

    nums.add(0);
    nums.add(1);
    for (int i = 1; i < n; i++) {
      nums.add(nums.get(i) + nums.get(i - 1));
    }

    return nums;
  }

  public static void iterationOne(int n) {

    int a = 0;
    int b = 1;

    while (a < n) {
      System.out.print(" " + a);
      int temp = b;
      b = a + b;
      a = temp;
    }
  }

  public static String reverse(String s) {
    Deque<Character> queue = new ArrayDeque<>();
    int i = 0;
    char[] ch = s.toCharArray();
    for (char c : ch) {
      queue.push(c);
    }
    System.out.println(queue);
    StringBuilder sb = new StringBuilder();
    while (!queue.isEmpty()) {
      sb.append(queue.pop());
    }
    return sb.toString();
  }

  public static String revertString(String s) {

    if (s.isEmpty()) return s;
    System.out.println(s.substring(1));
    return revertString(s.substring(1))  + s.charAt(0);
  }

  public static Integer gcdRecursive(int a, int b) {
    if(a % b == 0) return b;
    // Euclides condition, a > b at first passage
    // but to recurse b > a%b
    return gcdRecursive(b, a%b);
  }


  public static int recursiveFind(int[] container, int item, int index) {
    if (index >=container.length) return -1;

    if (item == container[index]) {
      return index;
    }
    return recursiveFind(container, item, index+1);
  }
// 1,2,3,4,5,6,7
  public static int binarySearch(int[] container, int item, int left, int right) {
    if (right < left) return -1;
    int middle = (left + right)/2;
    if (container[middle] == item) {
      return middle;
    } else if (container[middle] < item) {
      return binarySearch(container, item, middle+1, right );
    } else if (container[middle] > item) {
      return binarySearch(container, item, left, middle-1 );
    }
    return middle;
  }
}
