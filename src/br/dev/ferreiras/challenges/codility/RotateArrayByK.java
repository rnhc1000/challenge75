package br.dev.ferreiras.challenges.codility;

import java.util.Arrays;

public class RotateArrayByK {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        int[] response = rotatingArrayByK(numbers, k);
        System.out.println(Arrays.toString(response));


    }

    public static int[] rotatingArrayByK(int[] numbers, int k) {
        int size = numbers.length;
        int rotation = size % k;

        int ceiling = size - 1, floor = 0;

        while (k > 0) {

            int temp = numbers[floor];
            numbers[floor] = numbers[ceiling];
            numbers[ceiling] = temp;
            ceiling--;
            floor++;
            k--;
        }
        return numbers;

    }
}
