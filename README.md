## LeetCode Challenge75 - @Ricardo Ferreira
The only way to keep your game at a very high level
is being challenged every day. Nice source of coding challenges at https://leetcode.com
Lets dive into it!
## _Tools_
- Java 17
- IntelliJ Community Edition

## _Table of contents_
- [Java Coding Daily - @Ricardo Ferreira](#java-coding-daily---ricardo-ferreira)
- [_Tools_](#tools)
- [_Table of contents_](#table-of-contents)
- [_Screenshot_](#screenshot)
- [_Links_](#links)
- [_Built with_](#built-with)
- [_What I practiced_](#what-i-practiced)
- [_Continued development_](#continued-development)
  - [_Useful resources_](#useful-resources)
- [_Author_](#author)
- [Acknowledgments](#acknowledgments)


## _Screenshot_
[![](./carbon.png)]()
## _Links_
- Live Site URL: [] 
## _Built with_

 ![](https://ferreiras.dev.br/assets/images/icons/java-icon.svg)| ![](https://ferreiras.dev.br/assets/images/icons/git-scm-icon.svg) | ![](https://ferreiras.dev.br/assets/images/icons/icons8-intellij-idea.svg) | ![](https://ferreiras.dev.br/assets/images/icons/linux-original.svg) | ![](https://ferreiras.dev.br/assets/images/icons/icons8-visual-studio-code.svg)

 ## _What I practiced_
```java
package HandlingStrings;

/**
 * Given a string s, return the longest
 * palindromic substring  in s.
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 * Using Manacher's algorithm to find the longest
 * palindromic substring efficiently.
 */
public class LongestPalindromicSubString {

  public static void main(String[] args) {
    String s = "7anana7";
    System.out.println(isPalindrome(s));
  }



  public String longestPalindrome(String s) {
    if (s == null || s.length() < 1) return "";

    // Transform the input string to include special characters
    StringBuilder modifiedS = new StringBuilder("#");
    for (char c : s.toCharArray()) {
      modifiedS.append(c).append("#");
    }

    int n = modifiedS.length();
    int[] P = new int[n]; // Array to store the length of palindromes at each position
    int C = 0; // Center of the current palindrome
    int R = 0; // Right boundary of the current palindrome

    int maxLen = 0; // Maximum length of a palindrome found
    int maxCenter = 0; // Center of the palindrome with maximum length

    for (int i = 0; i < n; i++) {
      if (i < R) {
        int mirror = 2 * C - i; // Mirror position of i
        P[i] = Math.min(R - i, P[mirror]);
      }

      // Expand around the current character
      int a = i + (1 + P[i]);
      int b = i - (1 + P[i]);
      while (a < n && b >= 0 && modifiedS.charAt(a) == modifiedS.charAt(b)) {
        P[i]++;
        a++;
        b--;
      }

      // Update the center and right boundary if needed
      if (i + P[i] > R) {
        C = i;
        R = i + P[i];
      }

      // Update the maximum length and its center
      if (P[i] > maxLen) {
        maxLen = P[i];
        maxCenter = i;
      }
    }

    int start = (maxCenter - maxLen) / 2; // Start index of the longest palindrome
    int end = start + maxLen; // End index of the longest palindrome

    return s.substring(start, end);
  }


  public static boolean isPalindrome(String s) {

    char[] c=s.toCharArray();
    int size=s.length();
    int k=size-1;
    for (int i = 0; i < size; i++) {
      if (c[i] != c[k]) {
        return false;
      } else {
        k--;
      }
    }
    return true;
  }
}


``` 

## _Continued development_
- Next step: Hackerrank challenges.
- 
### _Useful resources_
- [https://docs.oracle.com/en/java/] Always trust and read the official documentation!
- [https://cp-algorithms.com/] 
## _Author_
- Website - [https://ferreiras.dev.br]  A must stop by to tackle DSA...
## Acknowledgments
