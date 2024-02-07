package ferreiras.dev.br.udemy.dsa.sort;
import java.util.Arrays;
public class MergeSort {
  public static void main(String[] args) {
    int[] numbers = {3, 1, 4, 2};
    System.out.println(Arrays.toString(numbers));

    int[] response = mergeSort(numbers);
    System.out.println(Arrays.toString(response));
  }

  public static int[] mergeSort(int[] array) {
    if (array.length == 1) return array;
    int midIndex = array.length / 2;
    System.out.println("MidIndex: " + midIndex);
    int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
    int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));
    System.out.println(Arrays.toString(array));
    System.out.println(Arrays.toString(left));
    System.out.println(Arrays.toString(right));

    return merge(left, right);
  }

  public static int[] merge(int[] array1, int[] array2) {
    int[] combined = new int[array1.length + array2.length];
    int index = 0;
    int i = 0;
    int j = 0;
    while (i < array1.length && j < array2.length) {
      if (array1[i] < array2[j]) {
        combined[index] = array1[i];
        index++;
        i++;
      } else {
        combined[index] = array2[j];
        index++;
        j++;
      }
    }
    while (i < array1.length) {
      combined[index] = array1[i];
      index++;
      i++;
    }
    while (j < array2.length) {
      combined[index] = array2[j];
      index++;
      j++;
    }
    return combined;
  }
}
