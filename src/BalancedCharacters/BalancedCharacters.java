package BalancedCharacters;

/**
 * Given a string of characters, check if they are balanced...
 * The idea is to check if the character exists in the dictionary
 * opening bracket the kwy and the closing bracket being the value...
 * push them and pop them anc at the end check the size of stack...
 * If zero...balanced, unbalance otherwise...
 * Use of HashMap allow to add characters as needed...
 * e.g <>, !!
 *
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedCharacters {
  public static void main(String[] args) {
    String s = "((((()))))!?<>";
    boolean response = isValid(s);
    if (response) {
      System.out.println("Balanced string of characters");
    } else {
      System.out.println("Unbalanced string of characters");
    }
  }

  public static boolean isValid(String s) {
    boolean response = false;

    Map<Character, Character> dictionary = new HashMap<>();
    dictionary.put('{', '}');
    dictionary.put('[', ']');
    dictionary.put('(', ')');
    dictionary.put('!', '?');
    dictionary.put('<', '>');

    Stack<Character> stack = new Stack<>();
    char [] c = s.toCharArray();
    for (char ch : c) {
      if(dictionary.containsKey(ch)) {
        stack.push(ch);
      } else if(dictionary.containsValue(ch)) {
        if(!stack.isEmpty() && dictionary.get(stack.peek()).equals(ch)) {
          stack.pop();
        } else{
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
