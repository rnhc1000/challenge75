package br.dev.ferreiras.challenges.dailyChallenges;

public class ArraySequence {

  public static void main(String[] args) {
    int[] numbers = { 2,4,5,6,7};
    boolean response = isSequenced(numbers);
    System.out.println(response);
    int number = 1234567;
    int sum = sumOfIntegers(number);
    System.out.println(sum);
    sum = recursiveSumOfIntegers(number);
    System.out.println(sum);
  }
  public static boolean isSequenced(int[] numbers) {
    int size = numbers.length;
    int right = 1, left = 0;
    for (int i = 1; i < size; i++) {
      int difference = numbers[i] - numbers[i-1];
      if( difference != 1) {
        return false;
      }
    }

    return true;
  }

  public static int sumOfIntegers(int number) {

    int sum = 0;
    while( number % 10 != 0) {

      sum += number % 10;
      number /= 10;

    }
    return sum;
  }

  public static int recursiveSumOfIntegers(int number) {
    int sum = 0;
    if (number == 0) {
      return number;
    }
    sum =  number % 10;
    return  sum + recursiveSumOfIntegers(number / 10);
  }
}
