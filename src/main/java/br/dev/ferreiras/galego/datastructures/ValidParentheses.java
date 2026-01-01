package br.dev.ferreiras.galego.datastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.Map;

public class ValidParentheses {

  public static void main(String[] args) {

    String string = "()[]{}(";
    boolean response = isValid(string);
    System.out.println(response);

  }

  public static boolean isValid(String parentheses) {
    Deque<Character> stack = new ArrayDeque<>();
    Map<Character, Character> map = new LinkedHashMap<>();
    map.put(')', '(');
    map.put(']', '[');
    map.put('}', '{');

    for (char ch : parentheses.toCharArray()) {
      if (map.containsKey(ch)) {
        if (!stack.isEmpty() && stack.peek() == map.get(ch)) {
          stack.pop();
        }
      } else {
        stack.push(ch);
      }
    }

//    int size = 6, sum = 0;
//    int[] n = { 1,2,3,4,5,6};
//    switch(size){
//      case 2:
//        sum += (n[0] + n[1]);
//        System.out.println(n[0]+"+"+n[1]+"="+sum);
//        break;
//      case 3:
//        sum += (n[0] + n[1] + n[2]);
//        System.out.println(n[0]+"+"+n[1]+"+"+n[2]+"="+sum);
//        break;
//      case 4:
//        sum += (n[0] + n[1] + n[2] + n[3]);
//        System.out.println(n[0]+"+"+n[1]+"+"+n[2]+"+"+n[3]+"="+sum);
//        break;
//      case 5:
//        sum += (n[0] + n[1] + n[2] + n[3] + n[4]);
//        System.out.println(n[0]+"+"+n[1]+"+"+n[2]+"+"+n[3]+"+"+n[4]+"="+sum);
//        break;
//      case 6:
//        sum += (n[5] + n[4] + n[3] + n[2] + n[1] + n[0]);
//        System.out.println(n[0]+"+"+n[1]+"+"+n[2]+"+"+n[3]+"+"+n[4]+"+"+n[5]+"="+sum);
//        break;
//
//      default:
//        break;
//
//    }

    return stack.isEmpty();
  }
}
