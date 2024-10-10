package br.dev.ferreiras.challenges.hackerrank;

import java.util.LinkedHashMap;
import java.util.Map;

/*
A non-empty array A consisting of N integers is given. The array contains an odd number of elements,
and each element of the array can be paired with another element that has the same value, except for one element
that is left unpaired.

For example, in array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the elements at indexes 0 and 2 have value 9,
the elements at indexes 1 and 3 have value 3,
the elements at indexes 4 and 6 have value 9,
the element at index 5 has value 7 and is unpaired.
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

For example, given array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the function should return 7, as explained in the example above.

Write an efficient algorithm for the following assumptions:

N is an odd integer within the range [1..1,000,000];
each element of array A is an integer within the range [1..1,000,000,000];
all but one of the values in A occur an even number of times.
 */
public class ArrayOddOccurrences {

  public static void main(String[] args) {
    int[] numbers = {9, 3, 9, 3, 9, 7, 9};
    int response = oddElement(numbers);
    System.out.println("OddNumber -> " + response);
  }
  public static int oddElement(int[] numbers) {
    int oddNumber = 0;
    int size = numbers.length;
    if (size % 2 != 1) return -1;
    Map<Integer, Integer> map = new LinkedHashMap<>();

    for (int i = 0; i < size; i++) {

      if (map.containsKey(numbers[i]) ) {

        map.put(numbers[i], map.getOrDefault((numbers[i]), 0) + 1);

      } else {

        map.put(numbers[i], 1);

      }

      for (Map.Entry<Integer, Integer> entryMap : map.entrySet())  {
        if (entryMap.getValue() == 1) {
          oddNumber = entryMap.getKey();
          break;
        }
      }

    }

    System.out.println(map);

    return oddNumber;
  }
}
