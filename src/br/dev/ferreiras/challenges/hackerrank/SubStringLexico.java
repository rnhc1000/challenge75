package br.dev.ferreiras.challenges.hackerrank;

import java.util.*;

/*
Given a string s, and an integer k, complete the function so that it finds the lexicographically
smallest and largest substrings of length .

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find

Returns
string: the string ' + "\n" + ' where and are the two substrings
Input Format

The first line contains a string denoting .
The second line contains an integer denoting .

Constraints

 consists of English alphabetic letters only (i.e., [a-zA-Z]).
Sample Input
welcometojava
3
Sample Output 0

ava
wel
Explanation 0

String  has the following lexicographically-ordered substrings of length :

We then return the first (lexicographically smallest) substring and the last (lexicographically largest)
substring as two newline-separated values (i.e., ava\nwel).
 */
public class SubStringLexico {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String string = input.nextLine();
    int number = input.nextInt();
    input.nextLine();

    char[] ch = string.toCharArray();
    Set<String> set = new TreeSet<>();
    int right = number;
    for (int i = 0; i <= ch.length - number; i++) {

      set.add(string.substring(i, right++));
    }
    List<String> list = new ArrayList<>(set);

    System.out.println(list.get(0));
    System.out.println(list.get(list.size() - 1));

    System.out.println(list);
    input.close();
  }
}
