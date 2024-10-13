package br.dev.ferreiras.challenges.hackerrank;

/*
An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:
Triangle Inequality Theorem:
The sum of any two sides of a triangle must be greater than the length of the third side.
This means that for sides a, b, and c:

a + b > c,
a + c > b,
b + c > a

A[P] + A[Q] > A[R],
A[Q] + A[R] > A[P],
A[R] + A[P] > A[Q].
For example, consider array A such that:

  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20
Triplet (0, 2, 4) is triangular.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns 1 if there exists a triangular triplet for
this array and returns 0 otherwise.

For example, given array A such that:

  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20
the function should return 1, as explained above. Given array A such that:

  A[0] = 10    A[1] = 50    A[2] = 5
  A[3] = 1
the function should return 0.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].

 */
public class Triangle {
  public static void main(String[] args) {
    int[] triangle = {10, 2, 2, 5, 8, 20};
    boolean response = existsTriangle(triangle);
    System.out.println(response);

  }

  public static boolean existsTriangle(int[] numbers) {
    boolean triangle = false;
    int size = numbers.length;
    int left = 0;
    int right = 1;

    for (; left < size - 2; left++) {
      if (numbers[left] + numbers[right] > numbers[right + 1] &&
          numbers[left] + numbers[right + 1] > numbers[right] &&
          numbers[right] + numbers[right + 1] > numbers[left]) {
        triangle = true;
        right++;
      }
      right++;

    }
    return triangle;
  }

}
