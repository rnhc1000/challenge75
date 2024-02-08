package br.dev.ferreiras.challenges.productArrayExceptSelf;

import java.util.Arrays;

/**
 * Basic concepts - Prefix Product and Suffix Product
 * Set int[0] & int[length-1] = 1  for 2 different arrays
 * prefix[1,0,0,0,0] & suffix[0,0,0,0,1]
 * start at index 1 and multiply prefix[i-1] * number[i-1]
 * and place the result in prefix[i];
 * int[] numbers = { 7, 3, 8, -4, 5};
 * int[] prefixProduct = { 1,7, 21, 168, -672}
 * start at index j = size-1 of suffix and multiply suffix[j] * numbers[j]
 * and place in suffix[j-1];
 * int[] numbers = { 7, 3, 8, -4, 5};
 * int[] suffixProduct = {-480, -160, -20, 5, 1}
 * with both prefix and suffix product arrays
 * multiply them and here you have:
 * int[] exceptSelf = {-480, -1120, -420, 840, -672}
 * Approach #2;
 * Generate a prefix product array as shown and
 * assign a variable to 1 and multiply the i[size-1] ny this variable.
 * Next, multiply this variable per numbers[i] and you save the suffix array.
 */
public class ProductArray {

  public static void main(String[] args) {
    int[] num = {1,2,3,4,5,6};
    System.out.println(Arrays.toString(num));
    int[] product = productExceptSelf(num);
    System.out.println(Arrays.toString(product));
  }
  public static int[] productExceptSelf(int[] numbers) {
    int size = numbers.length;
    int[] prefixProduct = new int[size];
    int append = 1;
    prefixProduct[0] = append;
    int suffixProduct=1;
    for (int i = 1; i < size; i++) {
      prefixProduct[i] = prefixProduct[i-1] * numbers[i-1];
    }
    for (int i = size-1; i >= 0; i--) {
      prefixProduct[i] = prefixProduct[i] * suffixProduct;
      suffixProduct*=numbers[i];
    }
    return prefixProduct;
  }
}
