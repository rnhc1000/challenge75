package br.dev.ferreiras.challenges.hackerrank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

Write a function:

class Solution { public int[] solution(int[] A, int K); }

that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given

    A = [3, 8, 9, 7, 6]
    K = 3
the function should return [9, 7, 6, 3, 8]. Three rotations were made:

    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
For another example, given

    A = [0, 0, 0]
    K = 1
the function should return [0, 0, 0]

Given

    A = [1, 2, 3, 4]
    K = 4
the function should return [1, 2, 3, 4]

Assume that:

N and K are integers within the range [0..100];
each element of array A is an integer within the range [−1,000..1,000].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */
public class ArrayCyclicRotation {

  public static void main(String[] args) {
    int[] numbers = {3, 8, 9, 7, 6};
    int key = 3;
    int[] response = cyclicArray(numbers, key);
    System.out.println(Arrays.toString(response));
  }
  public static int[] solution(int[] numbers, int key){

    int currentIndex = 0;
    int size = numbers.length;
    if (size == 0 || key == 0) return numbers;
    key = key % size;
    List<Integer> number = new LinkedList<>();
    for (int i = 0 ; i  < size ; i++) {
      currentIndex = (currentIndex + key) % size;
      System.out.println(currentIndex);
      number.add(numbers[currentIndex]);
    }
    System.out.println(Arrays.toString(numbers));
    return number.stream().mapToInt(x -> x).toArray();
  }
  public static int[] cyclicArray(int[] numbers, int key) {
    int size = numbers.length, count = 0;
    key %= size;
    System.out.println(Arrays.toString(numbers));
    for (int start = 0; count < size; start++) {
      int current = start;
      int previous = numbers[start];
      do {
        int next = (current + key) % size;
        System.out.printf(" next -> %d", next,"\t");
        int temp = numbers[next];
        numbers[next] = previous;
        previous = temp;
        current = next;
        count++;
      } while (start != current);
    }

    return numbers;
  }
}
