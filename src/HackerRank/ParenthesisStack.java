package HackerRank;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.List.of;

/**
 * @author rferreira
 * {@code @t}
 * In computer science, a listOfBrackets or LIFO (last in, first out) is an abstract data type that
 * serves as a collection of elements, with two principal operations: push, which adds an
 * element to the collection, and pop, which removes the last element that was added.(Wikipedia)
 * A string containing only parentheses is balanced if the following is true:
 * 1. if it is an empty string
 * 2. if A and B are correct, AB is correct,
 * 3. if A is correct, (A) and {A} and [A] are also correct.
 * Examples of some correctly balanced strings are:
 * "{}()", "[{()}]", "({()})"
 * Examples of some unbalanced strings are:
 * "{}(", "({)}", "[[", "}{" etc.
 * Given a string, determine if it is balanced or not.
 * Sample Input
 * {}()     Output->true
 * ({()})   Output->true
 * {}(      Output->false
 * []       Output->false
 * The first must be an '(', '{', '[' -> push stack
 * if the second is a closing, -> pop stack
 * if the second is an opening, ->push stack and so on
 * at the end if all are balanced the stack size will be zero
 * and the method isEmpty will return true, false otherwise
 */
public class ParenthesisStack {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s ="";
    System.out.println("Input the string of (), [], {} in any order or -1 to exit");
    while (sc.hasNext()) {
      s = sc.next();
      if (s.equals("-1")) {
        System.exit(0);
      }
      if (isBalanced(s)){
        System.out.println("Is Balanced");
      } else {
        System.out.println("Non balanced");
      }
    }
    sc.close();
  }

  public static boolean isBalanced(String input) {
    Deque<Character> listOfBrackets = new ArrayDeque<>();
    for (int i = 0; i < input.length(); i++) {
      char x = input.charAt(i);
      if (x == '(' || x == '{' || x == '[') {
        listOfBrackets.push(x);
      } else {
        if (x == ')' && !listOfBrackets.isEmpty() && listOfBrackets.peek() == '(') {
          listOfBrackets.pop();
        } else if (x == '}' && !listOfBrackets.isEmpty() && listOfBrackets.peek() == '{') {
          listOfBrackets.pop();
        } else if (x == ']' && !listOfBrackets.isEmpty() && listOfBrackets.peek() == '[') {
          listOfBrackets.pop();
        } else {
          return false;
        }
      }
    }
    return listOfBrackets.isEmpty();
  }
}

