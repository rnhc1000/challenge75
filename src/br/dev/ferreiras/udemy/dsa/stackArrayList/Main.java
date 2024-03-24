package br.dev.ferreiras.udemy.dsa.stackArrayList;

public class Main {

  // WRITE THE REVERSESTRING METHOD HERE //
  //                                     //
  //                                     //
  //                                     //
  //                                     //
  /////////////////////////////////////////


  public static void main(String[] args) {

//    String myString = "hello";
//    String reversedString = reverseString(myString);
//    System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */
//    testAndPrint("()", true);
//    testAndPrint("()()", true);
//    testAndPrint("(())", true);
//    testAndPrint("()()()", true);
//    testAndPrint("(()())", true);
//    testAndPrint(")()(", false);
//    testAndPrint(")(", false);
//    testAndPrint("(()", false);
//    testAndPrint("))", false);
//    testAndPrint("(", false);
//    testAndPrint(")", false);
    Stack<Integer> stack = new Stack<>();
    stack.push(3);
    stack.push(1);
    stack.push(4);
    stack.push(2);

    sortStack(stack);
  }

  public static boolean isBalancedParentheses(String toBeTested) {

    Stack myStack = new Stack();
    int size = toBeTested.length();
    int count = 0;
    while (size > 0) {

      if (toBeTested.charAt(count) == '(') {
        myStack.push(toBeTested.charAt(count));

      } else if (toBeTested.charAt(count) == ')') {
        if (!myStack.isEmpty() && myStack.peek().equals('(')) {
          myStack.pop();
        } else {
          return false;
        }
      }

      count++;
      size--;
    }

    return myStack.isEmpty();
  }

  public static void sortStack(Stack<Integer> st) {

    Stack<Integer> stck = new Stack<>();
    while (!st.isEmpty()) {
      Integer temp = st.pop();
      while (!stck.isEmpty() && stck.peek() > temp) {
        st.push(stck.pop());
      }
      stck.push(temp);
    }

    while (!stck.isEmpty()) {
      st.push(stck.pop());
    }

  }

  public static void testAndPrint(String testStr, boolean expected) {
    // Run the test and store the result
    boolean result = isBalancedParentheses(testStr);

    // Print the test string, expected result, and actual result
    System.out.println("Test String: " + testStr);
    System.out.println("EXPECTED: " + expected);
    System.out.println("RESULT: " + result);

    // Check if the test passed or failed
    if (result == expected) {
      System.out.println("STATUS: PASS");
    } else {
      System.out.println("STATUS: FAIL");
    }

    // Print a separator for better readability
    System.out.println("--------------");
  }

  public static String reverseString(String s) {

    Stack myStack = new Stack();

    for (int i = 0; i <= s.length() - 1; i++) {

      myStack.push(s.charAt(i));

    }
    StringBuilder sb = new StringBuilder();

    while (!myStack.isEmpty()) {
      sb.append(myStack.pop());
    }

    return sb.toString();
  }

}

