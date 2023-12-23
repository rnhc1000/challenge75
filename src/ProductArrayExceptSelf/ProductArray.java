package ProductArrayExceptSelf;

import java.util.Arrays;

/**
 * BAsic concepts:
 * Prefix Product
 * Suffix Product
 * int[] numbers = { 7, 3, 8, -4, 5};
 * int[] prefixProduct = { 1,    7,     21,  168, -672}
 * int[] suffixProduct = {-480, -160,  -20,  5,      1}
 * int[] exceptSelf = {-480,    -1120, -420, 840, -672}
 */
public class ProductArray {

  public static void main(String[] args) {
    int[] num = {7,3,8,-4,5};
    productExceptSelf(num);
  }
  public static int[] productExceptSelf(int[] numbers) {
    int size = numbers.length;
    int[] response = new int[size];
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
    System.out.println(Arrays.toString(prefixProduct));
    return response;
  }
}
