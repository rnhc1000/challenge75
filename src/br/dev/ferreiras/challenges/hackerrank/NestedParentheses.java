package br.dev.ferreiras.challenges.hackerrank;
/*
A string S consisting of N characters is considered to be properly nested if
any of the following conditions is true:

S is empty;
S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, the string "{[()()]}" is properly nested but "([)()]" is not.

Write a function:

class Solution { public int solution(String S); }

that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..200,000];
string S is made only of the following characters: '(', '{', '[', ']', '}' and/or ')'.

# ----
A string S consisting of N characters is called properly nested if:

S is empty;
S has the form "(U)" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, string "(()(())())" is properly nested but string "())" isn't.

Write a function:

class Solution { public int solution(String S); }

that, given a string S consisting of N characters, returns 1 if string S is properly nested and 0 otherwise.

For example, given S = "(()(())())", the function should return 1 and given S = "())",
the function should return 0, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..1,000,000];
string S is made only of the characters '(' and/or ')'.
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class NestedParentheses {
  public static void main(String[] args) {
    String brackets = "{}";
    boolean response = balancedParentheses(brackets);
    System.out.println(response);
    String parentheses = "((((((()))))))((())";
    int isBalanced = balancedParentheses(parentheses, true);
    System.out.println(isBalanced);

  }

  public static boolean balancedParentheses(String brackets) {
    int size = brackets.length();
    if (size == 0 || size == 1) return true;
    Deque<Character> stack = new ArrayDeque<>();
    Map<Character, Character> dictionary = new HashMap<>();
    dictionary.put('{', '}');
    dictionary.put('[', ']');
    dictionary.put('(', ')');


    for (char ch : brackets.toCharArray()) {

      if(dictionary.containsKey(ch)) {
        stack.push(ch);
      } else if (dictionary.containsValue(ch)
                 && !stack.isEmpty()
                 && dictionary.get(stack.peek()).equals(ch)) {
          stack.pop();
        }

    }

    return stack.isEmpty();
  }
  public static int balancedParentheses(String parentheses, boolean flag) {

    if (flag) {
      Deque<Character> stack = new ArrayDeque<>();
      for (char ch : parentheses.toCharArray()) {
        if (ch == '(') {
          stack.push(ch);
        } else if (!stack.isEmpty() && stack.peek() == '(') {
          stack.pop();
        } else {
          stack.push(ch);
        }
      }

      if (!stack.isEmpty()) return 0;
      return 1;
    }
    return -1;
  }
}
