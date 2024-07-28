package br.dev.ferreiras.udemy.dsa.DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
longest increasing subsequence is the longest subsequence
such that all elements are sorted i
increasing order;
e.g 11, 23, 37, 50, 80

 */
public class LongestStringSubsequence {
  public static void main(String[] args) {
    int[] nums = { 11, 23, 10, 37, 21, 50, 80 };
    System.out.println(Arrays.toString(nums));
    int[] subSequence = longestSubsequence(nums);
    System.out.print("[ ");
    for (int s : subSequence) {
      System.out.printf("%d, ", s);
    }
    System.out.print(" ]");

  }
  public static int[] longestSubsequence(int[] numbers) {
    int max = 0, count = 0;
    int size = numbers.length;
    int[] longest = new int[size];
    List<Integer> list = new ArrayList<>();
    Arrays.fill(longest, 1);
    for (int i = 1; i < size ; i++) {
      for (int j = 0; j <= i - 1; j++) {
        if( (numbers[i] > numbers[j])  && (longest[i] < longest[j] + 1)) {
          longest[i] = longest[j]+1;

        }

      }
      if(max < longest[i]) {
        max = longest[i];
      }

    }

//    System.out.println(list);
// int[] nums = { 11, 23, 10, 37, 21, 50, 80 };
//    for (int i = 0; i < size; i++) {
//
//      if(max < longest[i]) {
//        max = longest[i];
//        list.add(numbers[i]);
//      }
//
//    }
    int[] r = list.stream().mapToInt(x -> x).toArray();
    System.out.println(Arrays.toString(longest));
    System.out.println(Arrays.toString(r));
    System.out.println(max);

    return new int[]{};
  }
}
/*
The idea is to save the index of previous element of each, we can change the pseudocode as follows:-



longest_inc_subsq(nums[]):

    n = nums.size()
    max_length = 0
    // This will save the index of previous element to each element
    nitialize longestSubsequence[n]

    // Also saving the last element's index
    last_element_index = 0

    // We define index of previous element to 0'th element as -1 which is indicative of nothing
    longestSubsequence[0] = -1

    initialize LIS[n] and fill it with all 1's

    for i from 1 upto (n-1):
        for j from 0 upto (i-1):

            if(nums[i] > nums[j] AND LIS[i] < LIS[j] + 1):
                LIS[i] = LIS[j] + 1
                // If nums[j] could be the previous element to nums[i]
                longestSubsequence[i] = j

    for i from 0 upto (n-1):
        if(max_length < LIS[i]):
            max_length = LIS[i]
            // Last element would have the highest value of LIS[i]
            last_element_index = i

     // This will print all the elements of LIS
     while(last_element_index != -1):
         print( nums[last_element_index] )
         last_element_index = longestSubsequence[last_element_index]

return max_length

Seu envio

Ricardo Alves Ferreira Silva
Publicado há Há alguns segundos
Statement- We can get rid of the last 'for' loop to find the 'max_length' and instead find it inside the double 'for' loop.

How can you do it? Note that you can change the below pseudocode or write your own.

Pseudocode:-

longest_inc_subsq(nums[]):

    n = nums.size()
    max_length = 0
    initialize LIS[n] and fill it with all 1's

    for i from 1 upto (n-1):

        for j from 0 upto (i-1):

            if(nums[i] > nums[j] AND LIS[i] < LIS[j] + 1)
                LIS[i] = LIS[j] + 1

    for i from 0 upto (n-1):

        if(max_length < LIS[i])

            max_length = LIS[i]

return max_length



longest_inc_subsq(nums[]):

n = nums.size()
max_length = 0
initialize LIS[n] and fill it with all 1's

for i from 1 upto (n-1):

   for j from 0 upto (i-1):

         if(nums[i] > nums[j] AND LIS[i] < LIS[j] + 1)
            LIS[i] = LIS[j] + 1

if(max_length < LIS[i])

  max_length = LIS[i]



return max_length



Statement- We can incorporate a simple change in the algorithm we discussed to print what that longest increasing subsequence is.

How can you do it? Note that you can change the below pseudocode or write your own.

Pseudocode:-

longest_inc_subsq(nums[]):

    n = nums.size()     max_length = 0     initialize LIS[n] and fill it with all 1's

    for i from 1 upto (n-1):

        for j from 0 upto (i-1):

            if(nums[i] > nums[j] AND LIS[i] < LIS[j] + 1)

                LIS[i] = LIS[j] + 1

    for i from 0 upto (n-1):

        if(max_length < LIS[i])

            max_length = LIS[i]

return max_length



longest_inc_subsq(nums[]):

n = nums.size()
max_length = 0
initialize LIS[n] and fill it with all 1's

for i from 1 upto (n-1):

for j from 0 upto (i-1):

if(nums[i] > nums[j]) AND LIS[i] < LIS[j] + 1)
LIS[i] = LIS[j] + 1

for i from 0 upto (n-1):

  if(max_length < LIS[i])

    max_length = LIS[i]

    SEQ[i] = nums[i]

return SEQ


 */