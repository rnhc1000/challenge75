package br.dev.ferreiras.challenges.dailyChallenges;

/**
 * Given an array of numbers and an index i, return the index of the nearest larger
 * number of the number at index i, where distance is measured in array indices.
 * For example, given [4, 1, 3, 5, 6] and index 0, you should return 3.
 * If two distances to larger numbers are the equal, then return any one of them.
 * If the array at i doesn't have a nearest larger integer, then return null.
 */
public class NearestLarger {
  public static void main(String[] args) {
    int[] numbers= {4, 1, 3, 5, 6, 2, 9};
    int key = 1;
    Integer response = nearestLarger(numbers, key);
    System.out.println(response);
  }
  public static Integer nearestLarger(int[] numbers, int index) {
    int base = numbers[index];
    int nearest = base+=1;
    for(int i=0; i<numbers.length; i++) {
      if (numbers[i] ==  nearest) {
        nearest = i;
        return nearest;
      }
    }
    return null;
  }
}
