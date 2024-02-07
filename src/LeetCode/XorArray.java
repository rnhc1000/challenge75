package LeetCode;

import java.util.Arrays;

public class XorArray {
  public static void main(String[] args) {
    int[] numbers = {5, 2, 0, 3, 1};
    System.out.println(Arrays.toString(XorArray.xorOriginal((numbers))));
  }

  public static int[] xorOriginal(int[] xor) {
    int[] original = new int[xor.length];
    original[0] = xor[0];
    for (int i = 1; i < xor.length; i++) {
      original[i] = xor[i] ^ xor[i - 1];
    }
    return original;
  }
}

