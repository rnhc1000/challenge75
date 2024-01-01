package HackerRank;

/**
 * @author rferreira
 * You are given an array of integers nums, there is a sliding window of size iteratorOfNumbers
 * which is moving from the very left of the array to the very right.
 * You can only see the iteratorOfNumbers numbers in the window.
 * Each time the sliding window moves right by one position.
 * Return the maxOfEachArray sliding window.
 * Example 1:
 * Input: nums = [1,3,-1,-3,5,3,6,7,8], iteratorOfNumbers = 3
 * Output: [3,3,5,5,6,7,8]
 * Explanation:
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7  8    3
 * 1 [3  -1  -3] 5  3  6  7  8    3
 * 1  3 [-1  -3  5] 3  6  7  8    5
 * 1  3  -1 [-3  5  3] 6  7  8    5
 * 1  3  -1  -3 [5  3  6] 7  8    6
 * 1  3  -1  -3  5 [3  6  7] 8    7
 * 1  3  -1  -3  5  3  [6 7  8]   8
 */
public class SlidingWindows {

  public static void main(String[] args) {
    int[] numbers = new int[]{1,3,-1,-3,5,3,6,7,8};
    int iteratorOfNumbers = 3;
    int[] maximumOfEachWindow = new int[numbers.length - 2];
    maximumOfEachWindow = returnMaxWindow(numbers, iteratorOfNumbers);
    System.out.print("[ ");
    for (int i : maximumOfEachWindow) {
      System.out.print(i + " ");
    }
    System.out.print("]");
  }

  public static int[] returnMaxWindow(int[] numbers, int window) {
    int numberOfArrays = numbers.length-2;
    int maxOfEachArray = 0;
    int[] maximumOfEachArray = new int[numberOfArrays];
    int[][] slidingWindow = returnProcessedWindow(numbers, window);
    for (int i = 0; i < slidingWindow.length; i++) {
      for (int j = 0; j < slidingWindow[j].length; j++) {
        if (slidingWindow[i][j] > maxOfEachArray) {
          maxOfEachArray = slidingWindow[i][j];
        }
        maximumOfEachArray[i] = maxOfEachArray;
      }
    }
    return maximumOfEachArray;
  }

  public static int[][] returnProcessedWindow(int[] toBeProcessedArrays, int window) {
    int numberOfArrays = toBeProcessedArrays.length - 2;
    int[][] slidingWindow = new int[numberOfArrays][window];
    int incrementOnNumbers = 0;
    int iteratorOfNumbers = 0;
    for (int i = 0; i < slidingWindow.length; i++) {
      for (int j = 0; j < slidingWindow[i].length; j++) {
        slidingWindow[i][j] = toBeProcessedArrays[iteratorOfNumbers];
        iteratorOfNumbers++;
      }
      incrementOnNumbers++;
      iteratorOfNumbers = incrementOnNumbers;
    }
    return slidingWindow;
  }
}

