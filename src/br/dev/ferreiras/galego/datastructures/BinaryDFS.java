package br.dev.ferreiras.galego.datastructures;

import java.util.Scanner;

public class BinaryDFS {


  // Helper class to store the results from the recursive function
  static class Result {
    boolean isBST;
    int size;
    int min;
    int max;

    public Result(boolean isBST, int size, int min, int max) {
      this.isBST = isBST;
      this.size = size;
      this.min = min;
      this.max = max;
    }
  }

  // Candidate function to find the largest BST
  public static int largestBSTSubtree(int[] bst) {
    // Write your code here
    //Approach - post-order traversal
    int root = bst[0];
    int left = 0, right = 0;
    int size = 0, count = 0;
    for (int i = 1; i < bst.length; i++) {

      if (bst[i] > bst[i - 1]) {
        right++;
        count = Math.max(count, right);

      } else if (bst[i] < root) {
        left++;
        count = Math.max(count, left);

      } else if (bst[i] == -1) {
        continue;
      }
    }
    return count;

  }


  public static void main(String[] args) {
    // Get input from stdin
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input the list of numbers separated by \" \" and -1 ");
    String[] input = scanner.nextLine().split(" ");
    int[] bst = new int[input.length];
    for (int i = 0; i < input.length; i++) {
      bst[i] = Integer.parseInt(input[i]);
    }

    // Call candidate function
    int result = largestBSTSubtree(bst);

    // Print result
    System.out.println(result);

    scanner.close();
  }

}
