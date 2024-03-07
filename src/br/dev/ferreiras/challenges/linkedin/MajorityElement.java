package br.dev.ferreiras.challenges.linkedin;

public class MajorityElement {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7,8,9,9,9};
//    int[] nums = {9,9,8,7,6,5};
    int n = majorityElement(nums);
    System.out.println(n);
  }
  public static int majorityElement(int[] nums) {
    int element = 0;
    int countElement = 0;
    for (int num : nums) {

      if (countElement == 0) {
        element = num;
      }
      if (element == num) {
        countElement++;
      } else {
        countElement--;
      }
    }

    return countElement;
  }
}
