package br.dev.ferreiras.galego.datastructures;
/*
Write a function that takes the binary representation of a positive integer and returns the number of
set bits it has (also known as the Hamming weight).



Example 1:
Input: n = 11

Output: 3

Explanation:

The input binary string 1011 has a total of three set bits.

Example 2:

Input: n = 128

Output: 1

Explanation:

The input binary string 10000000 has a total of one set bit.

Example 3:

Input: n = 2147483645

Output: 30

Explanation:

The input binary string 1111111111111111111111111111101 has a total of thirty set bits.



Constraints:

1 <= n <= 231 - 1
 */
public class NumberOfBitsOne {
  public static void main(String[] args) {
    int n = 8;
    int response = hammingWeight(n,true);
    System.out.println(response);
  }
  public static int hammingWeight(int n) {
    int numberOfBitsOne = 0;
    while (n > 0) {
      int r = n & 1;
      if (r == 1)
        numberOfBitsOne++;
      n = n /2;
    }

    return numberOfBitsOne;
  }

  public static int hammingWeight(int n, boolean flag) {
    int numberOfBitsOne = 0;
    while (n > 0) {
      numberOfBitsOne += n % 2;
      n >>= 1;
    }

    return numberOfBitsOne;
  }
}
