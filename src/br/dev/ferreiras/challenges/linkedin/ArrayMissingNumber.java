package br.dev.ferreiras.challenges.linkedin;

import java.util.Arrays;

public class ArrayMissingNumber {

  public static void main(String[] args) {
    int[] numbers = { 1,2,3,4,6,7,8,9 };
    int response = missingNumber(numbers);
    System.out.println(response);
  }

  public static int missingNumber(int[]  numbers) {
    /*
    Given a stream of integers N, calculate
    int m = max * ( max + 1 ) / 2;

    int sum = n+(n-1)+(n-2)....

    int miss = sum - m;
     */
    int sum = 0, n = numbers.length, miss = 0;
    int max = Arrays.stream(numbers).max().getAsInt();
    int min= numbers[0];
    for (int i = 1; i < n; i++) {

      min = Math.max(min,numbers[i] );



    }
    System.out.println(max+ " " + min);

    for (int number : numbers) {

      if (number < 0 ) number = -number;

      sum+=number;

    }


    return   ((max * (max + 1)) / 2 ) - sum;
  }
}
